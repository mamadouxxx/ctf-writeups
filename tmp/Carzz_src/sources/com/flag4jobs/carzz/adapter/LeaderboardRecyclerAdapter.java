package com.flag4jobs.carzz.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.flag4jobs.carzz.R;
import com.flag4jobs.carzz.internal.LeaderboardUser;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class LeaderboardRecyclerAdapter extends RecyclerView.Adapter<LeaderboardRecyclerViewHolder> {
    private static final String TAG = "LeaderboardRecyclerAdapter";
    private final Context context;
    private final ArrayList<LeaderboardUser> users;

    public LeaderboardRecyclerAdapter(Context context, ArrayList<LeaderboardUser> arrayList) {
        this.context = context;
        this.users = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public LeaderboardRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new LeaderboardRecyclerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_leaderboard_user, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(LeaderboardRecyclerViewHolder leaderboardRecyclerViewHolder, int i) {
        LeaderboardUser leaderboardUser = this.users.get(i);
        String phoneNumber = leaderboardUser.getPhoneNumber();
        String strValueOf = String.valueOf(leaderboardUser.getScore());
        boolean zIsSelf = leaderboardUser.isSelf();
        leaderboardRecyclerViewHolder.phoneNumberTextView.setText(phoneNumber);
        leaderboardRecyclerViewHolder.scoreTextView.setText(strValueOf);
        if (zIsSelf) {
            leaderboardRecyclerViewHolder.cardView.setBackgroundColor(this.context.getResources().getColor(R.color.lightBlue));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.users.size();
    }

    public static class LeaderboardRecyclerViewHolder extends RecyclerView.ViewHolder {
        private final LinearLayout cardView;
        private final TextView phoneNumberTextView;
        private final TextView scoreTextView;

        public LeaderboardRecyclerViewHolder(View view) {
            super(view);
            this.cardView = (LinearLayout) view.findViewById(R.id.cardLeaderboardLayout);
            this.phoneNumberTextView = (TextView) view.findViewById(R.id.cardLeaderboardPhoneNumberTextView);
            this.scoreTextView = (TextView) view.findViewById(R.id.cardLeaderboardScoreTextView);
        }
    }
}
