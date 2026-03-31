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

/* JADX INFO: loaded from: classes.dex */
public class RegisterActivity extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";
    private TextView loginTextView;
    private EditText passwordEditText;
    private EditText phoneNumberEditText;
    private Button registerButton;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.protoscribe.RegisterActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return RegisterActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.phoneNumberEditText = (EditText) findViewById(R.id.registerPhoneNumberEditText);
        this.passwordEditText = (EditText) findViewById(R.id.registerPasswordEditText);
        this.registerButton = (Button) findViewById(R.id.registerRegisterButton);
        this.loginTextView = (TextView) findViewById(R.id.registerLoginTextView);
        this.registerButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.protoscribe.RegisterActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m75lambda$onCreate$1$comflag4jobsprotoscribeRegisterActivity(view);
            }
        });
        this.loginTextView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.protoscribe.RegisterActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m76lambda$onCreate$2$comflag4jobsprotoscribeRegisterActivity(view);
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: lambda$onCreate$1$com-flag4jobs-protoscribe-RegisterActivity, reason: not valid java name */
    /* synthetic */ void m75lambda$onCreate$1$comflag4jobsprotoscribeRegisterActivity(View view) {
        try {
            handleRegister(this.phoneNumberEditText.getText().toString(), this.passwordEditText.getText().toString());
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
            Toast.makeText(this, "An error occurred.", 0).show();
        }
    }

    /* JADX INFO: renamed from: lambda$onCreate$2$com-flag4jobs-protoscribe-RegisterActivity, reason: not valid java name */
    /* synthetic */ void m76lambda$onCreate$2$comflag4jobsprotoscribeRegisterActivity(View view) {
        handleLogin();
    }

    private void handleRegister(String str, String str2) {
        AuthResponse authResponseRegister = GrpcClient.getClient().register(str, str2);
        if (authResponseRegister == null) {
            Toast.makeText(this, "An error occurred.", 0).show();
        } else if (!authResponseRegister.getSuccess()) {
            Toast.makeText(this, authResponseRegister.getError(), 0).show();
        } else {
            Toast.makeText(this, "Registration successful.", 0).show();
            handleLogin();
        }
    }

    private void handleLogin() {
        startActivity(new Intent(this, (Class<?>) LoginActivity.class));
    }
}
