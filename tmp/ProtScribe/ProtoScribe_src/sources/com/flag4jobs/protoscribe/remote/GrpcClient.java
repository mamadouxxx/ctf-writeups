package com.flag4jobs.protoscribe.remote;

import android.util.Log;
import com.flag4jobs.protoscribe.grpc.AddNoteRequest;
import com.flag4jobs.protoscribe.grpc.AuthRequest;
import com.flag4jobs.protoscribe.grpc.AuthResponse;
import com.flag4jobs.protoscribe.grpc.EditNoteRequest;
import com.flag4jobs.protoscribe.grpc.GenericResponse;
import com.flag4jobs.protoscribe.grpc.GetNoteRequest;
import com.flag4jobs.protoscribe.grpc.GetNoteResponse;
import com.flag4jobs.protoscribe.grpc.GetNotesRequest;
import com.flag4jobs.protoscribe.grpc.GetNotesResponse;
import com.flag4jobs.protoscribe.grpc.NoteServiceGrpc;
import com.flag4jobs.protoscribe.grpc.RemoveNoteRequest;
import com.flag4jobs.protoscribe.grpc.ShareNoteRequest;
import com.flag4jobs.protoscribe.grpc.ShareNoteResponse;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class GrpcClient {
    private static final String TAG = "GrpcClient";
    private static GrpcClient grpcClient;
    private static String token;
    private NoteServiceGrpc.NoteServiceBlockingStub stub = NoteServiceGrpc.newBlockingStub(ManagedChannelBuilder.forAddress(Environment.HOST, Environment.PORT).usePlaintext().enableRetry().keepAliveTime(10, TimeUnit.SECONDS).build());

    public static void setToken(String str) {
        grpcClient = null;
        token = str;
    }

    public static GrpcClient getClient() {
        if (grpcClient == null) {
            grpcClient = new GrpcClient();
        }
        return grpcClient;
    }

    public AuthResponse login(String str, String str2) {
        try {
            return this.stub.login(AuthRequest.newBuilder().setPhoneNumber(str).setPassword(str2).build());
        } catch (Exception e) {
            Log.e(TAG, "Error at login:", e);
            return null;
        }
    }

    public AuthResponse register(String str, String str2) {
        try {
            Log.e(TAG, "Register:" + str + ", " + str2);
            return this.stub.register(AuthRequest.newBuilder().setPhoneNumber(str).setPassword(str2).build());
        } catch (Exception e) {
            Log.e(TAG, "Error at register:", e);
            return null;
        }
    }

    public GetNoteResponse getNote(String str) {
        try {
            return this.stub.getNote(GetNoteRequest.newBuilder().setToken(token).setUuid(str).build());
        } catch (Exception e) {
            Log.e(TAG, "Error at getNote:", e);
            return null;
        }
    }

    public GetNotesResponse getNotes(String str) {
        try {
            return this.stub.getNotes(GetNotesRequest.newBuilder().setToken(token).setUuid(str).build());
        } catch (Exception e) {
            Log.e(TAG, "Error at getNotes:", e);
            return null;
        }
    }

    public GenericResponse addNote(String str, String str2) {
        try {
            return this.stub.addNote(AddNoteRequest.newBuilder().setToken(token).setTitle(str).setContent(str2).build());
        } catch (Exception e) {
            Log.e(TAG, "Error at addNote:", e);
            return null;
        }
    }

    public GenericResponse editNote(String str, String str2, String str3) {
        try {
            return this.stub.editNote(EditNoteRequest.newBuilder().setToken(token).setUuid(str).setTitle(str2).setContent(str3).build());
        } catch (Exception e) {
            Log.e(TAG, "Error at editNote:", e);
            return null;
        }
    }

    public GenericResponse removeNote(String str) {
        try {
            return this.stub.removeNote(RemoveNoteRequest.newBuilder().setToken(token).setUuid(str).build());
        } catch (Exception e) {
            Log.e(TAG, "Error at removeNote:", e);
            return null;
        }
    }

    public ShareNoteResponse shareNote(String str, ArrayList<String> arrayList) {
        try {
            return this.stub.shareNote(ShareNoteRequest.newBuilder().setToken(token).setUuid(str).addAllPhoneNumbers(arrayList).build());
        } catch (Exception e) {
            Log.e(TAG, "Error at shareNote:", e);
            return null;
        }
    }
}
