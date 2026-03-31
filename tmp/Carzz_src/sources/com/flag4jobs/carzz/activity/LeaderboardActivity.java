package com.flag4jobs.carzz.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flag4jobs.carzz.R;
import com.flag4jobs.carzz.adapter.LeaderboardRecyclerAdapter;
import com.flag4jobs.carzz.internal.LeaderboardUser;
import com.flag4jobs.carzz.net.NetClient;
import com.flag4jobs.carzz.net.NetHTTPResponse;
import java.util.ArrayList;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class LeaderboardActivity extends AppCompatActivity {
    private static final String TAG = "LeaderboardActivity";
    private ImageView homeImageView;
    private int quizId;
    private RecyclerView recyclerView;
    private ArrayList<LeaderboardUser> users;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_leaderboard);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.carzz.activity.LeaderboardActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return LeaderboardActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.quizId = getIntent().getIntExtra("quizId", 0);
        this.recyclerView = (RecyclerView) findViewById(R.id.leaderboardRecyclerView);
        ImageView imageView = (ImageView) findViewById(R.id.leaderboardHomeImageView);
        this.homeImageView = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.LeaderboardActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$1(view);
            }
        });
        enableRecyclerView();
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        handleBackHome();
    }

    private void handleBackHome() {
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
    }

    private void enableRecyclerView() {
        this.users = new ArrayList<>();
        NetHTTPResponse netHTTPResponseQuizLeaderboard = new NetClient(this).quizLeaderboard(this.quizId);
        if (netHTTPResponseQuizLeaderboard == null) {
            Toast.makeText(this, "An error occurred.", 0).show();
            return;
        }
        if (!netHTTPResponseQuizLeaderboard.isOk()) {
            Toast.makeText(this, netHTTPResponseQuizLeaderboard.getMessage(), 0).show();
            return;
        }
        JSONArray dataArray = netHTTPResponseQuizLeaderboard.getDataArray();
        for (int i = 0; i < dataArray.length(); i++) {
            try {
                String string = dataArray.getJSONObject(i).getString("phone_number");
                dataArray.getJSONObject(i).getString("address");
                this.users.add(new LeaderboardUser(string, dataArray.getJSONObject(i).getInt("score"), dataArray.getJSONObject(i).getBoolean("is_self")));
            } catch (Exception unused) {
                Toast.makeText(this, "An error occurred.", 0).show();
                return;
            }
        }
        LeaderboardRecyclerAdapter leaderboardRecyclerAdapter = new LeaderboardRecyclerAdapter(this, this.users);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.recyclerView.setAdapter(leaderboardRecyclerAdapter);
    }
}
