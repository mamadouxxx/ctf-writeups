package com.flag4jobs.carzz.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.flag4jobs.carzz.R;
import com.flag4jobs.carzz.internal.DateManager;
import com.flag4jobs.carzz.internal.PermissionHelper;
import com.flag4jobs.carzz.net.NetClient;
import com.flag4jobs.carzz.net.NetHTTPResponse;

/* JADX INFO: loaded from: classes.dex */
public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    private TextView dateTextView;
    private int dayOffset;
    private ImageView friendsImageView;
    private ImageView nextDayImageView;
    private Button playQuizButton;
    private ImageView previousDayImageView;
    private Button signOutButton;
    private TextView totalScoreTextView;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.carzz.activity.HomeActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return HomeActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.totalScoreTextView = (TextView) findViewById(R.id.homeScoreTextView);
        this.dateTextView = (TextView) findViewById(R.id.homeDateTextView);
        this.playQuizButton = (Button) findViewById(R.id.homeButtonPlayQuiz);
        this.signOutButton = (Button) findViewById(R.id.homeButtonSignOut);
        this.friendsImageView = (ImageView) findViewById(R.id.homeFriendsImageView);
        this.previousDayImageView = (ImageView) findViewById(R.id.homePreviousDayImageView);
        this.nextDayImageView = (ImageView) findViewById(R.id.homeNextDayImageView);
        this.playQuizButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.HomeActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$1(view);
            }
        });
        this.friendsImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.HomeActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$2(view);
            }
        });
        this.signOutButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.HomeActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$3(view);
            }
        });
        this.dateTextView.setText(DateManager.getTodayDate());
        NetHTTPResponse netHTTPResponse = new NetClient(this).totalScore();
        if (netHTTPResponse == null) {
            Toast.makeText(this, "An error occurred.", 0).show();
            return;
        }
        if (!netHTTPResponse.isOk()) {
            Toast.makeText(this, netHTTPResponse.getMessage(), 0).show();
            return;
        }
        this.totalScoreTextView.setText("" + netHTTPResponse.getDataObject().optInt("total_score", 0));
        this.dayOffset = 0;
        this.nextDayImageView.setVisibility(4);
        this.previousDayImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.HomeActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$4(view);
            }
        });
        this.nextDayImageView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.HomeActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$5(view);
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
        handlePlayQuiz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(View view) {
        handleShowFriends();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$3(View view) {
        handleSignOut();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$4(View view) {
        handlePreviousDay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$5(View view) {
        handleNextDay();
    }

    private void handlePlayQuiz() {
        int timestampFromToday = DateManager.getTimestampFromToday(this.dayOffset);
        NetHTTPResponse netHTTPResponsePlayQuiz = new NetClient(this).playQuiz(timestampFromToday);
        if (netHTTPResponsePlayQuiz == null) {
            Toast.makeText(this, "An error occurred.", 0).show();
            return;
        }
        if (!netHTTPResponsePlayQuiz.isOk()) {
            Toast.makeText(this, netHTTPResponsePlayQuiz.getMessage(), 0).show();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) QuizActivity.class);
        intent.putExtra("quizId", timestampFromToday);
        intent.putExtra("jsonQuiz", netHTTPResponsePlayQuiz.getDataArray().toString());
        startActivity(intent);
    }

    private void handleShowFriends() {
        startActivity(new Intent(this, (Class<?>) FriendsActivity.class));
    }

    private void handlePreviousDay() {
        int i = this.dayOffset;
        if (i <= -30) {
            Toast.makeText(this, "You cannot go back more than 30 days.", 0).show();
            return;
        }
        int i2 = i - 1;
        this.dayOffset = i2;
        this.dateTextView.setText(DateManager.getDateFromToday(i2));
        int i3 = this.dayOffset;
        if (i3 == 0) {
            this.nextDayImageView.setVisibility(4);
            this.previousDayImageView.setVisibility(0);
        } else if (i3 == -30) {
            this.previousDayImageView.setVisibility(4);
            this.nextDayImageView.setVisibility(0);
        } else {
            this.previousDayImageView.setVisibility(0);
            this.nextDayImageView.setVisibility(0);
        }
    }

    private void handleNextDay() {
        int i = this.dayOffset;
        if (i >= 0) {
            Toast.makeText(this, "You cannot go forward more than today.", 0).show();
            return;
        }
        int i2 = i + 1;
        this.dayOffset = i2;
        this.dateTextView.setText(DateManager.getDateFromToday(i2));
        int i3 = this.dayOffset;
        if (i3 == 0) {
            this.nextDayImageView.setVisibility(4);
            this.previousDayImageView.setVisibility(0);
        } else if (i3 == -30) {
            this.previousDayImageView.setVisibility(4);
            this.nextDayImageView.setVisibility(0);
        } else {
            this.previousDayImageView.setVisibility(0);
            this.nextDayImageView.setVisibility(0);
        }
    }

    public void handleSignOut() {
        new NetClient(this).setSession(this, null);
        Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
        intent.addFlags(335544320);
        startActivity(intent);
        finish();
    }
}
