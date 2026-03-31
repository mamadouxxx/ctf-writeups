package com.flag4jobs.protoscribe;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ContactRecyclerViewAdapter extends RecyclerView.Adapter<ContactRecyclerViewHolder> {
    private static final String TAG = "ContactRecyclerViewAdapter";
    private final Context context;
    private final ArrayList<String> phoneNumbers;

    public ContactRecyclerViewAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.phoneNumbers = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ContactRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ContactRecyclerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_contact, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ContactRecyclerViewHolder contactRecyclerViewHolder, int i) {
        final String str = this.phoneNumbers.get(i);
        contactRecyclerViewHolder.phoneNumberTextView.setText(str);
        contactRecyclerViewHolder.shareImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.protoscribe.ContactRecyclerViewAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m66xfe0a79af(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onBindViewHolder$0$com-flag4jobs-protoscribe-ContactRecyclerViewAdapter, reason: not valid java name */
    /* synthetic */ void m66xfe0a79af(String str, View view) {
        Log.e(TAG, str);
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", "Check out my notes!");
        this.context.startActivity(intent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.phoneNumbers.size();
    }

    public static class ContactRecyclerViewHolder extends RecyclerView.ViewHolder {
        private final TextView phoneNumberTextView;
        private final ImageView shareImageView;

        public ContactRecyclerViewHolder(View view) {
            super(view);
            this.phoneNumberTextView = (TextView) view.findViewById(R.id.cardContactPhoneNumberTextView);
            this.shareImageView = (ImageView) view.findViewById(R.id.cardContactShareImageView);
        }
    }
}
