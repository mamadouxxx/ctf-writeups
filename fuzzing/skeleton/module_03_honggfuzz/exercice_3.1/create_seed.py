#!/usr/bin/env python3
"""
Script pour créer des seeds valides pour le fuzzing de target_hfuzz

Format du paquet :
- Magic : 4 bytes (0x504B5456 = "PKTV")
- Version : 1 byte (1, 2, ou 3)
- Type : 1 byte (0x01=DATA, 0x02=CONTROL, 0x03=STATS)
- Length : 2 bytes (little-endian)
- Payload : N bytes
- Checksum : 4 bytes (optionnel selon version)
"""

import struct
import os
import sys

# Constantes
MAGIC = 0x504B5456  # "PKTV"
PACKET_TYPE_DATA = 0x01
PACKET_TYPE_CONTROL = 0x02
PACKET_TYPE_STATS = 0x03

def calculate_crc32(data):
    """Calcule un CRC32 simplifié (compatible avec le code C)"""
    crc = 0xFFFFFFFF
    for byte in data:
        crc ^= byte
        for _ in range(8):
            if crc & 1:
                crc = (crc >> 1) ^ 0xEDB88320
            else:
                crc >>= 1
    return (~crc) & 0xFFFFFFFF

def create_packet(version, packet_type, payload):
    """Crée un paquet valide"""
    # Header
    header = struct.pack('<I', MAGIC)  # Magic (little-endian)
    header += struct.pack('B', version)  # Version
    header += struct.pack('B', packet_type)  # Type
    header += struct.pack('<H', len(payload))  # Length (little-endian)

    # Paquet complet
    packet = header + payload

    # Ajouter checksum pour version 3
    if version == 3:
        checksum = calculate_crc32(packet)
        packet += struct.pack('<I', checksum)

    return packet

def create_data_packet(version=1, payload_text="Hello, fuzzing world!"):
    """Crée un paquet DATA"""
    payload = payload_text.encode('utf-8')
    return create_packet(version, PACKET_TYPE_DATA, payload)

def create_control_packet(version=1):
    """Crée un paquet CONTROL"""
    payload = b'\x01\x00\x00\x00'  # Simple payload de contrôle
    return create_packet(version, PACKET_TYPE_CONTROL, payload)

def create_stats_packet(version=1, total=100, errors=5, success_rate=95):
    """Crée un paquet STATS"""
    # Structure stats_t : total_packets (4), errors (4), success_rate (4)
    payload = struct.pack('<III', total, errors, success_rate)
    return create_packet(version, PACKET_TYPE_STATS, payload)

def create_edge_case_packets():
    """Crée des paquets pour des cas limites (sans bugs volontaires)"""
    packets = []

    # 1. Paquet avec payload vide
    packets.append(("empty_payload", create_packet(1, PACKET_TYPE_DATA, b'')))

    # 2. Paquet avec payload de 1 byte
    packets.append(("single_byte", create_packet(1, PACKET_TYPE_DATA, b'A')))

    # 3. Paquet avec payload moyen
    packets.append(("medium_payload", create_packet(1, PACKET_TYPE_DATA, b'A' * 50)))

    # 4. Paquet version 2
    packets.append(("version2", create_data_packet(2, "Version 2 packet")))

    # 5. Paquet version 3
    packets.append(("version3", create_data_packet(3, "Version 3 packet with checksum")))

    # 6. Paquet CONTROL
    packets.append(("control", create_control_packet(1)))

    # 7. Paquet STATS valide
    packets.append(("stats_valid", create_stats_packet(1, 1000, 10, 99)))

    # 8. Paquet STATS avec zero (pour tester la division par zéro)
    # Note : On crée un packet "proche" du bug mais pas encore déclencheur
    packets.append(("stats_small", create_stats_packet(1, 10, 1, 90)))

    return packets

def main():
    # Créer le dossier seeds s'il n'existe pas
    os.makedirs('seeds', exist_ok=True)

    print("=== Création des seeds pour le fuzzing ===\n")

    # 1. Seed principal : paquet valide simple
    packet = create_data_packet(1, "Hello, fuzzing!")
    with open('seeds/valid_packet.bin', 'wb') as f:
        f.write(packet)
    print(f"✓ seeds/valid_packet.bin créé ({len(packet)} bytes)")

    # 2. Seeds pour différentes versions
    for version in [1, 2, 3]:
        packet = create_data_packet(version, f"Test packet version {version}")
        filename = f'seeds/packet_v{version}.bin'
        with open(filename, 'wb') as f:
            f.write(packet)
        print(f"✓ {filename} créé ({len(packet)} bytes)")

    # 3. Seeds pour différents types
    types = [
        ('data', create_data_packet(1, "DATA packet")),
        ('control', create_control_packet(1)),
        ('stats', create_stats_packet(1, 100, 5, 95))
    ]

    for name, packet in types:
        filename = f'seeds/packet_{name}.bin'
        with open(filename, 'wb') as f:
            f.write(packet)
        print(f"✓ {filename} créé ({len(packet)} bytes)")

    # 4. Seeds pour cas limites
    edge_packets = create_edge_case_packets()
    for name, packet in edge_packets:
        filename = f'seeds/edge_{name}.bin'
        with open(filename, 'wb') as f:
            f.write(packet)
        print(f"✓ {filename} créé ({len(packet)} bytes)")

    print(f"\n=== {3 + 3 + len(edge_packets)} seeds créés avec succès ===")
    print("\nPour tester un seed :")
    print("  ./target_hfuzz < seeds/valid_packet.bin")
    print("\nPour lancer le fuzzing :")
    print("  honggfuzz -i seeds/ --exit_upon_crash -- ./target_hfuzz")
    print("\nPour voir le contenu d'un seed :")
    print("  hexdump -C seeds/valid_packet.bin")

    # Afficher un exemple de structure
    print("\n=== Structure du paquet valide ===")
    with open('seeds/valid_packet.bin', 'rb') as f:
        data = f.read()

    print("Hexdump :")
    for i in range(0, len(data), 16):
        hex_part = ' '.join(f'{b:02x}' for b in data[i:i+16])
        ascii_part = ''.join(chr(b) if 32 <= b < 127 else '.' for b in data[i:i+16])
        print(f"  {i:04x}: {hex_part:<48} |{ascii_part}|")

    print("\nDécodage :")
    magic = struct.unpack('<I', data[0:4])[0]
    version = data[4]
    pkt_type = data[5]
    length = struct.unpack('<H', data[6:8])[0]
    payload = data[8:8+length]

    print(f"  Magic:   0x{magic:08X} ({'PKTV' if magic == MAGIC else 'invalid'})")
    print(f"  Version: {version}")
    print(f"  Type:    0x{pkt_type:02X} ", end='')
    if pkt_type == PACKET_TYPE_DATA:
        print("(DATA)")
    elif pkt_type == PACKET_TYPE_CONTROL:
        print("(CONTROL)")
    elif pkt_type == PACKET_TYPE_STATS:
        print("(STATS)")
    else:
        print("(unknown)")
    print(f"  Length:  {length}")
    print(f"  Payload: {payload.decode('utf-8', errors='replace')}")

if __name__ == '__main__':
    try:
        main()
    except KeyboardInterrupt:
        print("\n\nInterrompu par l'utilisateur")
        sys.exit(1)
    except Exception as e:
        print(f"\nErreur : {e}", file=sys.stderr)
        sys.exit(1)
