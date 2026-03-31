package com.flag4jobs.protoscribe;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.flag4jobs.protoscribe.grpc.Contact;
import com.flag4jobs.protoscribe.grpc.GenericResponse;
import com.flag4jobs.protoscribe.grpc.Note;
import com.flag4jobs.protoscribe.grpc.ShareNoteResponse;
import com.flag4jobs.protoscribe.remote.GrpcClient;
import com.flag4jobs.protoscribe.utils.AppContacts;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class NoteRecyclerViewAdapter extends RecyclerView.Adapter<NoteRecyclerViewHolder> {
    private static final String TAG = "NoteRecyclerViewAdapter";
    private Context context;
    private ArrayList<Note> notes;

    public NoteRecyclerViewAdapter(Context context, ArrayList<Note> arrayList) {
        this.context = context;
        this.notes = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public NoteRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new NoteRecyclerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_note, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(NoteRecyclerViewHolder noteRecyclerViewHolder, final int i) {
        final Note note = this.notes.get(i);
        noteRecyclerViewHolder.titleTextView.setText(note.getTitle());
        noteRecyclerViewHolder.contentTextView.setText(note.getContent());
        noteRecyclerViewHolder.shareImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.protoscribe.NoteRecyclerViewAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m71x1d39b995(note, view);
            }
        });
        noteRecyclerViewHolder.editImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.protoscribe.NoteRecyclerViewAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m72x60c4d756(note, view);
            }
        });
        noteRecyclerViewHolder.deleteImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.protoscribe.NoteRecyclerViewAdapter$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m73xa44ff517(note, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onBindViewHolder$0$com-flag4jobs-protoscribe-NoteRecyclerViewAdapter, reason: not valid java name */
    /* synthetic */ void m71x1d39b995(Note note, View view) {
        ArrayList<String> allPhoneNumbers = AppContacts.getAllPhoneNumbers(this.context);
        Log.e(TAG, allPhoneNumbers.toString());
        ShareNoteResponse shareNoteResponseShareNote = GrpcClient.getClient().shareNote(note.getUuid(), allPhoneNumbers);
        if (shareNoteResponseShareNote == null) {
            Toast.makeText(this.context, "An error occurred.", 0).show();
            return;
        }
        if (!shareNoteResponseShareNote.getSuccess()) {
            Toast.makeText(this.context, shareNoteResponseShareNote.getError(), 0).show();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Contact> it = shareNoteResponseShareNote.getContactsList().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPhoneNumber());
        }
        Intent intent = new Intent(this.context, (Class<?>) ContactViewActivity.class);
        intent.putExtra("phoneNumbers", arrayList);
        this.context.startActivity(intent);
    }

    /* JADX INFO: renamed from: lambda$onBindViewHolder$1$com-flag4jobs-protoscribe-NoteRecyclerViewAdapter, reason: not valid java name */
    /* synthetic */ void m72x60c4d756(Note note, View view) {
        Intent intent = new Intent(this.context, (Class<?>) EditNoteActivity.class);
        intent.putExtra("noteUuid", note.getUuid());
        intent.putExtra("noteTitle", note.getTitle());
        intent.putExtra("noteContent", note.getContent());
        this.context.startActivity(intent);
    }

    /* JADX INFO: renamed from: lambda$onBindViewHolder$2$com-flag4jobs-protoscribe-NoteRecyclerViewAdapter, reason: not valid java name */
    /* synthetic */ void m73xa44ff517(Note note, int i, View view) {
        GenericResponse genericResponseRemoveNote = GrpcClient.getClient().removeNote(note.getUuid());
        if (genericResponseRemoveNote == null) {
            Toast.makeText(this.context, "An error occurred.", 0).show();
            return;
        }
        if (!genericResponseRemoveNote.getSuccess()) {
            Toast.makeText(this.context, genericResponseRemoveNote.getError(), 0).show();
            return;
        }
        Toast.makeText(this.context, "Note removed", 0).show();
        this.notes.remove(i);
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, this.notes.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.notes.size();
    }

    public static class NoteRecyclerViewHolder extends RecyclerView.ViewHolder {
        private final TextView contentTextView;
        private final ImageView deleteImageView;
        private final ImageView editImageView;
        private final ImageView shareImageView;
        private final TextView titleTextView;

        public NoteRecyclerViewHolder(View view) {
            super(view);
            this.titleTextView = (TextView) view.findViewById(R.id.cardNoteTitleTextView);
            this.contentTextView = (TextView) view.findViewById(R.id.cardNoteContentTextView);
            this.shareImageView = (ImageView) view.findViewById(R.id.cardNoteShareImageView);
            this.editImageView = (ImageView) view.findViewById(R.id.cardNoteEditImageView);
            this.deleteImageView = (ImageView) view.findViewById(R.id.cardNoteDeleteImageView);
        }
    }
}
