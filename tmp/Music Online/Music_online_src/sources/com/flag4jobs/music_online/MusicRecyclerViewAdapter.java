package com.flag4jobs.music_online;

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
import com.flag4jobs.music_online.httpclient.ApiClient;
import com.flag4jobs.music_online.httpclient.schema.model.MusicModel;
import com.flag4jobs.music_online.httpclient.schema.request.AddOrRemoveFavoriteRequest;
import com.flag4jobs.music_online.httpclient.schema.response.MessageResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.Locale;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class MusicRecyclerViewAdapter extends RecyclerView.Adapter<MusicRecyclerViewHolder> {
    private static final String TAG = "MusicRecyclerViewAdapter";
    private Context context;
    private ArrayList<MusicModel> musics;

    public MusicRecyclerViewAdapter(Context context, ArrayList<MusicModel> arrayList) {
        this.context = context;
        this.musics = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MusicRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MusicRecyclerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_music, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final MusicRecyclerViewHolder musicRecyclerViewHolder, int i) {
        final MusicModel musicModel = this.musics.get(i);
        musicRecyclerViewHolder.titleTextView.setText(musicModel.getTitle());
        musicRecyclerViewHolder.durationTextView.setText(String.format(Locale.FRENCH, "%02dm%02ds", Integer.valueOf(musicModel.getDuration() / 60), Integer.valueOf(musicModel.getDuration() % 60)));
        musicRecyclerViewHolder.artistTextView.setText(musicModel.getArtist());
        musicRecyclerViewHolder.genreTextView.setText(musicModel.getGenre());
        if (musicModel.isFavorite()) {
            musicRecyclerViewHolder.favoriteImageView.setImageResource(R.drawable.baseline_favorite_on_24);
        } else {
            musicRecyclerViewHolder.favoriteImageView.setImageResource(R.drawable.baseline_favorite_off_24);
        }
        musicRecyclerViewHolder.shareImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.music_online.MusicRecyclerViewAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m68xabc20cfd(musicModel, view);
            }
        });
        musicRecyclerViewHolder.previousImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.music_online.MusicRecyclerViewAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m69x38fcbe7e(view);
            }
        });
        musicRecyclerViewHolder.playImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.music_online.MusicRecyclerViewAdapter$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m70xc6376fff(view);
            }
        });
        musicRecyclerViewHolder.nextImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.music_online.MusicRecyclerViewAdapter$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m71x53722180(view);
            }
        });
        musicRecyclerViewHolder.favoriteImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.music_online.MusicRecyclerViewAdapter$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m72xe0acd301(musicRecyclerViewHolder, musicModel, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onBindViewHolder$0$com-flag4jobs-music_online-MusicRecyclerViewAdapter, reason: not valid java name */
    /* synthetic */ void m68xabc20cfd(MusicModel musicModel, View view) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", musicModel.getTitle() + " by " + musicModel.getArtist());
        intent.setType("text/plain");
        this.context.startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: renamed from: lambda$onBindViewHolder$1$com-flag4jobs-music_online-MusicRecyclerViewAdapter, reason: not valid java name */
    /* synthetic */ void m69x38fcbe7e(View view) {
        Toast.makeText(this.context, "Previous not implemented", 0).show();
    }

    /* JADX INFO: renamed from: lambda$onBindViewHolder$2$com-flag4jobs-music_online-MusicRecyclerViewAdapter, reason: not valid java name */
    /* synthetic */ void m70xc6376fff(View view) {
        Toast.makeText(this.context, "Play not implemented", 0).show();
    }

    /* JADX INFO: renamed from: lambda$onBindViewHolder$3$com-flag4jobs-music_online-MusicRecyclerViewAdapter, reason: not valid java name */
    /* synthetic */ void m71x53722180(View view) {
        Toast.makeText(this.context, "Next not implemented", 0).show();
    }

    /* JADX INFO: renamed from: lambda$onBindViewHolder$4$com-flag4jobs-music_online-MusicRecyclerViewAdapter, reason: not valid java name */
    /* synthetic */ void m72xe0acd301(final MusicRecyclerViewHolder musicRecyclerViewHolder, final MusicModel musicModel, View view) {
        Call<MessageResponse> callAddFavoriteMusic;
        musicRecyclerViewHolder.favoriteImageView.setImageResource(R.drawable.baseline_sync_24);
        AddOrRemoveFavoriteRequest addOrRemoveFavoriteRequest = new AddOrRemoveFavoriteRequest();
        addOrRemoveFavoriteRequest.setMusicId(musicModel.getId());
        if (musicModel.isFavorite()) {
            callAddFavoriteMusic = ApiClient.getApiService(this.context).removeFavoriteMusic(addOrRemoveFavoriteRequest);
        } else {
            callAddFavoriteMusic = ApiClient.getApiService(this.context).addFavoriteMusic(addOrRemoveFavoriteRequest);
        }
        callAddFavoriteMusic.enqueue(new Callback<MessageResponse>() { // from class: com.flag4jobs.music_online.MusicRecyclerViewAdapter.1
            @Override // retrofit2.Callback
            public void onResponse(Call<MessageResponse> call, Response<MessageResponse> response) {
                if (response.isSuccessful()) {
                    MessageResponse messageResponseBody = response.body();
                    if (messageResponseBody != null) {
                        Toast.makeText(MusicRecyclerViewAdapter.this.context, messageResponseBody.getMessage(), 1).show();
                        if (musicModel.isFavorite()) {
                            musicModel.setFavorite(false);
                            musicRecyclerViewHolder.favoriteImageView.setImageResource(R.drawable.baseline_favorite_off_24);
                            return;
                        } else {
                            musicModel.setFavorite(true);
                            musicRecyclerViewHolder.favoriteImageView.setImageResource(R.drawable.baseline_favorite_on_24);
                            return;
                        }
                    }
                    return;
                }
                try {
                    Toast.makeText(MusicRecyclerViewAdapter.this.context, ((MessageResponse) new Gson().fromJson(response.errorBody().charStream(), MessageResponse.class)).getMessage(), 1).show();
                } catch (JsonSyntaxException e) {
                    Log.e(MusicRecyclerViewAdapter.TAG, e.getMessage());
                    Toast.makeText(MusicRecyclerViewAdapter.this.context, "An error occurred.", 1).show();
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<MessageResponse> call, Throwable th) {
                Log.w(MusicRecyclerViewAdapter.TAG, th.getMessage());
                Toast.makeText(MusicRecyclerViewAdapter.this.context, "Unable to contact the server.", 1).show();
            }
        });
        if (musicModel.isFavorite()) {
            musicRecyclerViewHolder.favoriteImageView.setImageResource(R.drawable.baseline_favorite_on_24);
        } else {
            musicRecyclerViewHolder.favoriteImageView.setImageResource(R.drawable.baseline_favorite_off_24);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.musics.size();
    }

    public static class MusicRecyclerViewHolder extends RecyclerView.ViewHolder {
        private final TextView artistTextView;
        private final TextView durationTextView;
        private final ImageView favoriteImageView;
        private final TextView genreTextView;
        private final ImageView nextImageView;
        private final ImageView playImageView;
        private final ImageView previousImageView;
        private final ImageView shareImageView;
        private final TextView titleTextView;

        public MusicRecyclerViewHolder(View view) {
            super(view);
            this.titleTextView = (TextView) view.findViewById(R.id.cardMusicTitleTextView);
            this.durationTextView = (TextView) view.findViewById(R.id.cardMusicDurationTextView);
            this.artistTextView = (TextView) view.findViewById(R.id.cardMusicArtistTextView);
            this.genreTextView = (TextView) view.findViewById(R.id.cardMusicGenreTextView);
            this.shareImageView = (ImageView) view.findViewById(R.id.cardMusicShareImageView);
            this.previousImageView = (ImageView) view.findViewById(R.id.cardMusicPreviousImageView);
            this.playImageView = (ImageView) view.findViewById(R.id.cardMusicPlayImageView);
            this.nextImageView = (ImageView) view.findViewById(R.id.cardMusicNextImageView);
            this.favoriteImageView = (ImageView) view.findViewById(R.id.cardMusicFavoriteImageView);
        }
    }
}
