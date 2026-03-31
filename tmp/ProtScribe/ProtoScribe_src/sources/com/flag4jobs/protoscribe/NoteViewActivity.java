package com.flag4jobs.protoscribe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flag4jobs.protoscribe.grpc.GetNoteResponse;
import com.flag4jobs.protoscribe.grpc.GetNotesResponse;
import com.flag4jobs.protoscribe.grpc.Note;
import com.flag4jobs.protoscribe.remote.GrpcClient;
import com.flag4jobs.protoscribe.utils.AppStorage;
import com.google.protobuf.ProtocolStringList;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class NoteViewActivity extends AppCompatActivity {
    private static final String TAG = "MusicViewActivity";
    private ImageView createNoteImageView;
    private ArrayList<Note> notes;
    private ProgressBar progressBar;
    private RecyclerView recyclerView;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_note_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.protoscribe.NoteViewActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return NoteViewActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.progressBar = (ProgressBar) findViewById(R.id.noteViewProgressBar);
        this.recyclerView = (RecyclerView) findViewById(R.id.noteViewRecyclerView);
        ImageView imageView = (ImageView) findViewById(R.id.noteViewCreateNoteImageView);
        this.createNoteImageView = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.protoscribe.NoteViewActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m74lambda$onCreate$1$comflag4jobsprotoscribeNoteViewActivity(view);
            }
        });
        handleLoadNotes();
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: lambda$onCreate$1$com-flag4jobs-protoscribe-NoteViewActivity, reason: not valid java name */
    /* synthetic */ void m74lambda$onCreate$1$comflag4jobsprotoscribeNoteViewActivity(View view) {
        handleCreateNote();
    }

    private void enableProgressBar() {
        this.progressBar.setVisibility(0);
    }

    private void disableProgressBar() {
        this.progressBar.setVisibility(8);
    }

    private void enableRecyclerView() {
        disableProgressBar();
        NoteRecyclerViewAdapter noteRecyclerViewAdapter = new NoteRecyclerViewAdapter(this, this.notes);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.recyclerView.setAdapter(noteRecyclerViewAdapter);
    }

    private void handleLoadNotes() {
        enableProgressBar();
        GetNotesResponse notes = GrpcClient.getClient().getNotes(AppStorage.getUserUuid(this));
        if (notes == null) {
            Toast.makeText(this, "Failed to load notes", 0).show();
            return;
        }
        if (!notes.getSuccess()) {
            Toast.makeText(this, notes.getError(), 0).show();
            return;
        }
        ProtocolStringList notesUuidList = notes.getNotesUuidList();
        int size = notesUuidList.size();
        if (size == 0) {
            Toast.makeText(this, "No notes found", 0).show();
            Toast.makeText(this, "Create a note using the top-right icon", 1).show();
        } else if (size == 1) {
            Toast.makeText(this, "1 note found", 0).show();
        } else {
            Toast.makeText(this, size + " notes found", 0).show();
        }
        this.notes = new ArrayList<>();
        Iterator<String> it = notesUuidList.iterator();
        while (it.hasNext()) {
            GetNoteResponse note = GrpcClient.getClient().getNote(it.next());
            if (note.getSuccess()) {
                this.notes.add(note.getNote());
            }
        }
        enableRecyclerView();
    }

    private void handleCreateNote() {
        startActivity(new Intent(this, (Class<?>) CreateNoteActivity.class));
    }
}
