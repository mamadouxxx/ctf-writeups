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
public class EditNoteActivity extends AppCompatActivity {
    private static final String TAG = "EditNoteActivity";
    private Button editButton;
    private EditText noteContentEditText;
    private EditText noteTitleEditText;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_edit_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.protoscribe.EditNoteActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return EditNoteActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.noteTitleEditText = (EditText) findViewById(R.id.editNoteTitleEditText);
        this.noteContentEditText = (EditText) findViewById(R.id.editNoteContentEditText);
        this.editButton = (Button) findViewById(R.id.editNoteEditButton);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Toast.makeText(this, "An error occurred.", 0).show();
            return;
        }
        final String string = extras.getString("noteUuid");
        this.noteTitleEditText.setText(extras.getString("noteTitle"));
        this.noteContentEditText.setText(extras.getString("noteContent"));
        this.editButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.protoscribe.EditNoteActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m68lambda$onCreate$1$comflag4jobsprotoscribeEditNoteActivity(string, view);
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: lambda$onCreate$1$com-flag4jobs-protoscribe-EditNoteActivity, reason: not valid java name */
    /* synthetic */ void m68lambda$onCreate$1$comflag4jobsprotoscribeEditNoteActivity(String str, View view) {
        try {
            handleEditNote(str, this.noteTitleEditText.getText().toString(), this.noteContentEditText.getText().toString());
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
            Toast.makeText(this, "An error occurred.", 0).show();
        }
    }

    private void handleEditNote(String str, String str2, String str3) {
        GenericResponse genericResponseEditNote = GrpcClient.getClient().editNote(str, str2, str3);
        if (genericResponseEditNote == null) {
            Toast.makeText(this, "An error occurred.", 0).show();
        } else if (!genericResponseEditNote.getSuccess()) {
            Toast.makeText(this, genericResponseEditNote.getError(), 0).show();
        } else {
            Toast.makeText(this, "Note edited successfully.", 0).show();
            startActivity(new Intent(this, (Class<?>) NoteViewActivity.class));
        }
    }
}
