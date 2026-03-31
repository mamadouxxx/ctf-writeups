package com.flag4jobs.carzz.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.flag4jobs.carzz.R;
import com.flag4jobs.carzz.internal.Contact;
import com.flag4jobs.carzz.net.NetClient;
import com.flag4jobs.carzz.net.NetHTTPResponse;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class FriendsRecyclerAdapter extends RecyclerView.Adapter<ContactRecyclerViewHolder> {
    private static final String TAG = "FriendsRecyclerAdapter";
    private final ArrayList<Contact> contacts;
    private final Context context;

    public FriendsRecyclerAdapter(Context context, ArrayList<Contact> arrayList) {
        this.context = context;
        this.contacts = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ContactRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ContactRecyclerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_friend, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ContactRecyclerViewHolder contactRecyclerViewHolder, int i) {
        final Contact contact = this.contacts.get(i);
        final String phoneNumber = contact.getPhoneNumber();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(contact.isFriend());
        contactRecyclerViewHolder.phoneNumberTextView.setText(phoneNumber);
        final NetClient netClient = new NetClient(this.context);
        if (atomicBoolean.get()) {
            contactRecyclerViewHolder.addOrRemoveImageView.setImageResource(R.drawable.baseline_person_remove_24);
            contactRecyclerViewHolder.cardView.setBackgroundColor(this.context.getResources().getColor(R.color.lightBlue));
        } else {
            contactRecyclerViewHolder.addOrRemoveImageView.setImageResource(R.drawable.baseline_person_add_24);
            contactRecyclerViewHolder.cardView.setBackgroundColor(this.context.getResources().getColor(R.color.white));
        }
        contactRecyclerViewHolder.addOrRemoveImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.adapter.FriendsRecyclerAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onBindViewHolder$0(atomicBoolean, contact, netClient, phoneNumber, contactRecyclerViewHolder, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(AtomicBoolean atomicBoolean, Contact contact, NetClient netClient, String str, ContactRecyclerViewHolder contactRecyclerViewHolder, View view) {
        NetHTTPResponse netHTTPResponseAddFriend;
        atomicBoolean.set(contact.isFriend());
        if (atomicBoolean.get()) {
            netHTTPResponseAddFriend = netClient.removeFriend(str);
        } else {
            netHTTPResponseAddFriend = netClient.addFriend(str);
        }
        if (netHTTPResponseAddFriend == null) {
            Toast.makeText(this.context, "An error occurred.", 0).show();
            return;
        }
        if (!netHTTPResponseAddFriend.isOk()) {
            Toast.makeText(this.context, netHTTPResponseAddFriend.getMessage(), 0).show();
            return;
        }
        if (atomicBoolean.get()) {
            Toast.makeText(this.context, "Friend removed!", 0).show();
            contact.setFriend(false);
            contactRecyclerViewHolder.addOrRemoveImageView.setImageResource(R.drawable.baseline_person_add_24);
            contactRecyclerViewHolder.cardView.setBackgroundColor(this.context.getResources().getColor(R.color.white));
            return;
        }
        Toast.makeText(this.context, "Friend added!", 0).show();
        contact.setFriend(true);
        contactRecyclerViewHolder.addOrRemoveImageView.setImageResource(R.drawable.baseline_person_remove_24);
        contactRecyclerViewHolder.cardView.setBackgroundColor(this.context.getResources().getColor(R.color.lightBlue));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.contacts.size();
    }

    public static class ContactRecyclerViewHolder extends RecyclerView.ViewHolder {
        private final ImageView addOrRemoveImageView;
        private final LinearLayout cardView;
        private final TextView phoneNumberTextView;

        public ContactRecyclerViewHolder(View view) {
            super(view);
            this.cardView = (LinearLayout) view.findViewById(R.id.cardFriendLayout);
            this.phoneNumberTextView = (TextView) view.findViewById(R.id.cardFriendPhoneNumberTextView);
            this.addOrRemoveImageView = (ImageView) view.findViewById(R.id.cardFriendAddOrRemoveImageView);
        }
    }
}
