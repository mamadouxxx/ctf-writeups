package com.flag4jobs.carzz.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.flag4jobs.carzz.R;
import com.flag4jobs.carzz.internal.PermissionHelper;

/* JADX INFO: loaded from: classes.dex */
public class FinishActivity extends AppCompatActivity {
    private static final String TAG = "FinishActivity";
    private ImageView backHomeButton;
    private int bestScore;
    private TextView bestScoreTextView;
    private Button leaderboardButton;
    private int quizId;
    private int score;
    private TextView scoreTextView;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_finish);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.carzz.activity.FinishActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return FinishActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.scoreTextView = (TextView) findViewById(R.id.finishScoreTextView);
        this.bestScoreTextView = (TextView) findViewById(R.id.finishBestScoreTextView);
        this.leaderboardButton = (Button) findViewById(R.id.finishLeaderboardButton);
        this.backHomeButton = (ImageView) findViewById(R.id.finishBackHomeButton);
        this.quizId = getIntent().getIntExtra("quizId", 0);
        this.score = getIntent().getIntExtra("score", 0);
        this.bestScore = getIntent().getIntExtra("bestScore", 0);
        this.scoreTextView.setText(this.score + " (current)");
        this.bestScoreTextView.setText(this.bestScore + " (max)");
        this.leaderboardButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.FinishActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$1(view);
            }
        });
        this.backHomeButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.FinishActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$2(view);
            }
        });
        PermissionHelper.requestContactsPermission(this);
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        handleLeaderboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(View view) {
        handleBackHome();
    }

    private void handleLeaderboard() {
        Intent intent = new Intent(this, (Class<?>) LeaderboardActivity.class);
        intent.putExtra("quizId", this.quizId);
        startActivity(intent);
    }

    private void handleBackHome() {
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
    }
}
