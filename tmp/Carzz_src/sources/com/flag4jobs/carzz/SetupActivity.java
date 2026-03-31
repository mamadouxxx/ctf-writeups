package com.flag4jobs.carzz;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.flag4jobs.carzz.activity.LoginActivity;
import com.flag4jobs.carzz.net.NetClient;
import com.flag4jobs.carzz.net.NetHTTPResponse;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class SetupActivity extends AppCompatActivity {
    private EditText instanceUrlEditText;
    private Button startChallengeButton;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_setup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.carzz.SetupActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SetupActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        EditText editText = (EditText) findViewById(R.id.instanceUrlEditText);
        this.instanceUrlEditText = editText;
        editText.getBackground().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        this.startChallengeButton = (Button) findViewById(R.id.startChallengeButton);
        String url = NetClient.getUrl(this);
        if (url != null) {
            this.instanceUrlEditText.setText(url);
        }
        this.startChallengeButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.SetupActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$1(view);
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        handleStartChallenge();
    }

    private void handleStartChallenge() {
        String strTrim = this.instanceUrlEditText.getText().toString().trim();
        if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
            Toast.makeText(this, "Please provide an HTTP URL", 1).show();
            return;
        }
        try {
            URL url = new URL(strTrim);
            NetClient netClient = new NetClient(url);
            NetHTTPResponse netHTTPResponsePing = netClient.ping();
            if (netHTTPResponsePing == null) {
                Toast.makeText(this, "An error occurred.", 0).show();
            } else if (!netHTTPResponsePing.isOk()) {
                Toast.makeText(this, netHTTPResponsePing.getMessage(), 0).show();
            } else {
                netClient.setUrl(this, url);
                startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            }
        } catch (Exception unused) {
            Toast.makeText(this, "Please provide a valid URL", 1).show();
        }
    }
}
