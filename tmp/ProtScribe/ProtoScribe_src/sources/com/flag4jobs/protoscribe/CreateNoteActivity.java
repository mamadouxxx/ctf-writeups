package com.flag4jobs.protoscribe;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.flag4jobs.protoscribe.grpc.GenericResponse;
import com.flag4jobs.protoscribe.remote.GrpcClient;

/* JADX INFO: loaded from: classes.dex */
public class CreateNoteActivity extends AppCompatActivity {
    private static final String TAG = "CreateNoteActivity";
    private Button createButton;
    private EditText noteContentEditText;
    private EditText noteTitleEditText;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.protoscribe.CreateNoteActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return CreateNoteActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.noteTitleEditText = (EditText) findViewById(R.id.createNoteTitleEditText);
        this.noteContentEditText = (EditText) findViewById(R.id.createNoteContentEditText);
        Button button = (Button) findViewById(R.id.createNoteCreateButton);
        this.createButton = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.protoscribe.CreateNoteActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m67lambda$onCreate$1$comflag4jobsprotoscribeCreateNoteActivity(view);
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: lambda$onCreate$1$com-flag4jobs-protoscribe-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m67lambda$onCreate$1$comflag4jobsprotoscribeCreateNoteActivity(View view) {
        try {
            handleCreateNote(this.noteTitleEditText.getText().toString(), this.noteContentEditText.getText().toString());
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
            Toast.makeText(this, "An error occurred.", 0).show();
        }
    }

    private void handleCreateNote(String str, String str2) {
        GenericResponse genericResponseAddNote = GrpcClient.getClient().addNote(str, str2);
        if (genericResponseAddNote == null) {
            Toast.makeText(this, "An error occurred.", 0).show();
        } else if (!genericResponseAddNote.getSuccess()) {
            Toast.makeText(this, genericResponseAddNote.getError(), 0).show();
        } else {
            Toast.makeText(this, "Note created successfully.", 0).show();
            startActivity(new Intent(this, (Class<?>) NoteViewActivity.class));
        }
    }
}
