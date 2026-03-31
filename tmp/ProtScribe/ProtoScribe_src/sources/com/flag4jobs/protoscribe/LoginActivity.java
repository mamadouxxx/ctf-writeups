package com.flag4jobs.protoscribe;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.flag4jobs.protoscribe.grpc.AuthResponse;
import com.flag4jobs.protoscribe.remote.GrpcClient;
import com.flag4jobs.protoscribe.utils.AppStorage;

/* JADX INFO: loaded from: classes.dex */
public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    private Button loginButton;
    private EditText passwordEditText;
    private EditText phoneNumberEditText;
    private TextView registerTextView;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.protoscribe.LoginActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return LoginActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.phoneNumberEditText = (EditText) findViewById(R.id.loginPhoneNumberEditText);
        this.passwordEditText = (EditText) findViewById(R.id.loginPasswordEditText);
        this.loginButton = (Button) findViewById(R.id.loginLoginButton);
        this.registerTextView = (TextView) findViewById(R.id.loginRegisterTextView);
        this.loginButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.protoscribe.LoginActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m69lambda$onCreate$1$comflag4jobsprotoscribeLoginActivity(view);
            }
        });
        this.registerTextView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.protoscribe.LoginActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m70lambda$onCreate$2$comflag4jobsprotoscribeLoginActivity(view);
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: lambda$onCreate$1$com-flag4jobs-protoscribe-LoginActivity, reason: not valid java name */
    /* synthetic */ void m69lambda$onCreate$1$comflag4jobsprotoscribeLoginActivity(View view) {
        try {
            handleLogin(this.phoneNumberEditText.getText().toString(), this.passwordEditText.getText().toString());
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
            Toast.makeText(this, "An error occurred.", 0).show();
        }
    }

    /* JADX INFO: renamed from: lambda$onCreate$2$com-flag4jobs-protoscribe-LoginActivity, reason: not valid java name */
    /* synthetic */ void m70lambda$onCreate$2$comflag4jobsprotoscribeLoginActivity(View view) {
        handleRegister();
    }

    private void handleRegister() {
        startActivity(new Intent(this, (Class<?>) RegisterActivity.class));
    }

    private void handleLogin(String str, String str2) {
        AuthResponse authResponseLogin = GrpcClient.getClient().login(str, str2);
        if (authResponseLogin == null) {
            Toast.makeText(this, "An error occurred.", 0).show();
            return;
        }
        if (!authResponseLogin.getSuccess()) {
            Toast.makeText(this, authResponseLogin.getError(), 0).show();
            return;
        }
        GrpcClient.setToken(authResponseLogin.getToken());
        AppStorage.setUserUuid(this, authResponseLogin.getUuid());
        Toast.makeText(this, "Login successful.", 0).show();
        startActivity(new Intent(this, (Class<?>) NoteViewActivity.class));
    }
}
