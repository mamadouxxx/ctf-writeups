package com.flag4jobs.music_online;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
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
import com.flag4jobs.music_online.httpclient.ApiClient;
import com.flag4jobs.music_online.httpclient.schema.model.MusicModel;
import com.flag4jobs.music_online.httpclient.schema.response.MessageResponse;
import com.flag4jobs.music_online.httpclient.schema.response.MusicsResponse;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class MusicViewActivity extends AppCompatActivity {
    private static final String TAG = "MusicViewActivity";
    private SwitchMaterial favoriteSwitch;
    private ArrayList<MusicModel> musics;
    private ProgressBar progressBar;
    private RecyclerView recyclerView;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_music_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.music_online.MusicViewActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return MusicViewActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.progressBar = (ProgressBar) findViewById(R.id.musicViewProgressBar);
        this.recyclerView = (RecyclerView) findViewById(R.id.musicViewRecyclerView);
        this.favoriteSwitch = (SwitchMaterial) findViewById(R.id.musicViewFavoriteSwitch);
        handleLoadMusics();
        this.favoriteSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.flag4jobs.music_online.MusicViewActivity$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f$0.m73lambda$onCreate$1$comflag4jobsmusic_onlineMusicViewActivity(compoundButton, z);
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: lambda$onCreate$1$com-flag4jobs-music_online-MusicViewActivity, reason: not valid java name */
    /* synthetic */ void m73lambda$onCreate$1$comflag4jobsmusic_onlineMusicViewActivity(CompoundButton compoundButton, boolean z) {
        handleLoadMusics();
    }

    private void enableProgressBar() {
        this.progressBar.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enableRecyclerView() {
        this.progressBar.setVisibility(8);
        MusicRecyclerViewAdapter musicRecyclerViewAdapter = new MusicRecyclerViewAdapter(this, this.musics);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.recyclerView.setAdapter(musicRecyclerViewAdapter);
    }

    private void handleLoadMusics() {
        enableProgressBar();
        (this.favoriteSwitch.isChecked() ? ApiClient.getApiService(this).getFavoriteMusics() : ApiClient.getApiService(this).getAllMusics()).enqueue(new Callback<MusicsResponse>() { // from class: com.flag4jobs.music_online.MusicViewActivity.1
            @Override // retrofit2.Callback
            public void onResponse(Call<MusicsResponse> call, Response<MusicsResponse> response) {
                if (response.isSuccessful()) {
                    MusicsResponse musicsResponseBody = response.body();
                    if (musicsResponseBody != null) {
                        Log.e(MusicViewActivity.TAG, musicsResponseBody.getMusics().size() + "");
                        MusicViewActivity.this.musics = musicsResponseBody.getMusics();
                        MusicViewActivity.this.enableRecyclerView();
                        return;
                    }
                    return;
                }
                try {
                    Toast.makeText(MusicViewActivity.this, ((MessageResponse) new Gson().fromJson(response.errorBody().charStream(), MessageResponse.class)).getMessage(), 1).show();
                } catch (JsonSyntaxException e) {
                    Log.e(MusicViewActivity.TAG, e.getMessage());
                    Toast.makeText(MusicViewActivity.this, "An error occurred.", 1).show();
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<MusicsResponse> call, Throwable th) {
                Log.w(MusicViewActivity.TAG, th.getMessage());
                Toast.makeText(MusicViewActivity.this, "Unable to contact the server.", 1).show();
            }
        });
    }
}
