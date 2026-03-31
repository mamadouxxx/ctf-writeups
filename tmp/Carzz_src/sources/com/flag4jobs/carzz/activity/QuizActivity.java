package com.flag4jobs.carzz.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import com.flag4jobs.carzz.net.NetClient;
import com.flag4jobs.carzz.net.NetHTTPResponse;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class QuizActivity extends AppCompatActivity {
    private static final String TAG = "QuizActivity";
    private static int offColor = R.color.black;
    private static int onColor = R.color.darkBlue;
    private ArrayList<String> answers;
    private ImageView backImage;
    private int currentQuestionIndex;
    private Button nextButton;
    private Button option1Button;
    private Button option2Button;
    private Button option3Button;
    private Button option4Button;
    private TextView qestionNumberTextView;
    private int quizId;
    private ImageView quizImageView;
    private JSONArray quizzes;
    private int selectedOptionIndex;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.carzz.activity.QuizActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return QuizActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.backImage = (ImageView) findViewById(R.id.quizBackImageView);
        this.qestionNumberTextView = (TextView) findViewById(R.id.quizQuestionNumberTextView);
        this.quizImageView = (ImageView) findViewById(R.id.quizCarImageView);
        this.option1Button = (Button) findViewById(R.id.quizOption1Button);
        this.option2Button = (Button) findViewById(R.id.quizOption2Button);
        this.option3Button = (Button) findViewById(R.id.quizOption3Button);
        this.option4Button = (Button) findViewById(R.id.quizOption4Button);
        this.nextButton = (Button) findViewById(R.id.quizNextButton);
        this.currentQuestionIndex = 0;
        this.selectedOptionIndex = -1;
        this.answers = new ArrayList<>();
        this.quizId = getIntent().getIntExtra("quizId", 0);
        String stringExtra = getIntent().getStringExtra("jsonQuiz");
        if (stringExtra != null) {
            try {
                this.quizzes = new JSONArray(stringExtra);
            } catch (Exception e) {
                Log.e(TAG, "Error in parsing JSON: " + e.getMessage());
            }
        }
        this.backImage.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.QuizActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$1(view);
            }
        });
        this.option1Button.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.QuizActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$2(view);
            }
        });
        this.option2Button.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.QuizActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$3(view);
            }
        });
        this.option3Button.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.QuizActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$4(view);
            }
        });
        this.option4Button.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.QuizActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$5(view);
            }
        });
        this.nextButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.QuizActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$6(view);
            }
        });
        displayQuiz();
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        handleBackArrow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(View view) {
        this.selectedOptionIndex = 0;
        this.option1Button.setBackgroundColor(getResources().getColor(onColor));
        this.option2Button.setBackgroundColor(getResources().getColor(offColor));
        this.option3Button.setBackgroundColor(getResources().getColor(offColor));
        this.option4Button.setBackgroundColor(getResources().getColor(offColor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$3(View view) {
        this.selectedOptionIndex = 1;
        this.option1Button.setBackgroundColor(getResources().getColor(offColor));
        this.option2Button.setBackgroundColor(getResources().getColor(onColor));
        this.option3Button.setBackgroundColor(getResources().getColor(offColor));
        this.option4Button.setBackgroundColor(getResources().getColor(offColor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$4(View view) {
        this.selectedOptionIndex = 2;
        this.option1Button.setBackgroundColor(getResources().getColor(offColor));
        this.option2Button.setBackgroundColor(getResources().getColor(offColor));
        this.option3Button.setBackgroundColor(getResources().getColor(onColor));
        this.option4Button.setBackgroundColor(getResources().getColor(offColor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$5(View view) {
        this.selectedOptionIndex = 3;
        this.option1Button.setBackgroundColor(getResources().getColor(offColor));
        this.option2Button.setBackgroundColor(getResources().getColor(offColor));
        this.option3Button.setBackgroundColor(getResources().getColor(offColor));
        this.option4Button.setBackgroundColor(getResources().getColor(onColor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$6(View view) {
        handleNext();
    }

    private void displayQuiz() {
        this.selectedOptionIndex = -1;
        this.qestionNumberTextView.setText((this.currentQuestionIndex + 1) + "/" + this.quizzes.length());
        this.option1Button.setBackgroundColor(getResources().getColor(offColor));
        this.option2Button.setBackgroundColor(getResources().getColor(offColor));
        this.option3Button.setBackgroundColor(getResources().getColor(offColor));
        this.option4Button.setBackgroundColor(getResources().getColor(offColor));
        try {
            JSONObject jSONObject = this.quizzes.getJSONObject(this.currentQuestionIndex);
            int i = jSONObject.getInt("picture_id");
            JSONArray jSONArray = jSONObject.getJSONArray("options");
            this.quizImageView.setImageResource(getResources().getIdentifier("car_" + i, "drawable", getPackageName()));
            this.option1Button.setText(jSONArray.get(0).toString());
            this.option2Button.setText(jSONArray.get(1).toString());
            this.option3Button.setText(jSONArray.get(2).toString());
            this.option4Button.setText(jSONArray.get(3).toString());
        } catch (Exception e) {
            Log.e(TAG, "Error in displayQuiz(...): " + e.getMessage());
        }
    }

    private void handleNext() {
        int i = this.selectedOptionIndex;
        if (i == -1) {
            Toast.makeText(this, "Please select an option.", 0).show();
            return;
        }
        if (i == 0) {
            this.answers.add(this.option1Button.getText().toString());
        } else if (i == 1) {
            this.answers.add(this.option2Button.getText().toString());
        } else if (i == 2) {
            this.answers.add(this.option3Button.getText().toString());
        } else if (i == 3) {
            this.answers.add(this.option4Button.getText().toString());
        }
        int i2 = this.currentQuestionIndex + 1;
        this.currentQuestionIndex = i2;
        if (i2 < this.quizzes.length()) {
            displayQuiz();
        } else {
            handleEndQuiz();
        }
    }

    private void handleBackArrow() {
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        finish();
    }

    private void handleEndQuiz() {
        Toast.makeText(this, "Quiz completed!", 0).show();
        NetHTTPResponse netHTTPResponseSubmitQuiz = new NetClient(this).submitQuiz(this.quizId, this.answers);
        if (netHTTPResponseSubmitQuiz == null) {
            Toast.makeText(this, "An error occurred.", 0).show();
            return;
        }
        if (netHTTPResponseSubmitQuiz.isOk()) {
            try {
                int i = netHTTPResponseSubmitQuiz.getDataObject().getInt("score");
                int i2 = netHTTPResponseSubmitQuiz.getDataObject().getInt("best_score");
                Intent intent = new Intent(this, (Class<?>) FinishActivity.class);
                intent.putExtra("quizId", this.quizId);
                intent.putExtra("score", i);
                intent.putExtra("bestScore", i2);
                startActivity(intent);
                return;
            } catch (Exception e) {
                Log.e(TAG, "Error in handleEndQuiz(): " + e.getMessage());
                return;
            }
        }
        Toast.makeText(this, netHTTPResponseSubmitQuiz.getMessage(), 0).show();
    }
}
