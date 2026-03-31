package com.flag4jobs.carzz.activity;

import android.content.Intent;
import android.os.Bundle;
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
import com.flag4jobs.carzz.R;
import com.flag4jobs.carzz.internal.PermissionHelper;
import com.flag4jobs.carzz.net.NetClient;
import com.flag4jobs.carzz.net.NetHTTPResponse;

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.carzz.activity.LoginActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return LoginActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.phoneNumberEditText = (EditText) findViewById(R.id.loginPhoneNumberEditText);
        this.passwordEditText = (EditText) findViewById(R.id.loginPasswordEditText);
        this.loginButton = (Button) findViewById(R.id.loginLoginButton);
        this.registerTextView = (TextView) findViewById(R.id.loginRegisterTextView);
        this.loginButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.LoginActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$1(view);
            }
        });
        this.registerTextView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.LoginActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$2(view);
            }
        });
        PermissionHelper.requestNetworkPermission(this);
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        handleLogin(this.phoneNumberEditText.getText().toString(), this.passwordEditText.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(View view) {
        handleRegister();
    }

    private void handleRegister() {
        startActivity(new Intent(this, (Class<?>) RegisterActivity.class));
    }

    private void handleLogin(String str, String str2) {
        NetClient netClient = new NetClient(this);
        NetHTTPResponse netHTTPResponseLogin = netClient.login(str, str2);
        if (netHTTPResponseLogin == null) {
            Toast.makeText(this, "An error occurred.", 0).show();
            return;
        }
        if (!netHTTPResponseLogin.isOk()) {
            Toast.makeText(this, netHTTPResponseLogin.getMessage(), 0).show();
            return;
        }
        try {
            netClient.setSession(this, netHTTPResponseLogin.getDataObject().getString("session"));
            Toast.makeText(this, "Login successful.", 0).show();
            startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        } catch (Exception unused) {
            Toast.makeText(this, "An error occurred.", 0).show();
        }
    }
}
