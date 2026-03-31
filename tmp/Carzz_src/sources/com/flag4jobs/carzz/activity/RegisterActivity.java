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
public class RegisterActivity extends AppCompatActivity {
    private TextView loginTextView;
    private EditText passwordEditText;
    private EditText phoneNumberEditText;
    private Button registerButton;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.carzz.activity.RegisterActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return RegisterActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.phoneNumberEditText = (EditText) findViewById(R.id.registerPhoneNumberEditText);
        this.passwordEditText = (EditText) findViewById(R.id.registerPasswordEditText);
        this.registerButton = (Button) findViewById(R.id.registerRegisterButton);
        this.loginTextView = (TextView) findViewById(R.id.registerLoginTextView);
        this.registerButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.RegisterActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$1(view);
            }
        });
        this.loginTextView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.carzz.activity.RegisterActivity$$ExternalSyntheticLambda2
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
        handleRegister(this.phoneNumberEditText.getText().toString(), this.passwordEditText.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(View view) {
        handleLogin();
    }

    private void handleRegister(String str, String str2) {
        NetClient netClient = new NetClient(this);
        NetHTTPResponse netHTTPResponseRegister = netClient.register(str, str2);
        if (netHTTPResponseRegister == null) {
            Toast.makeText(this, "An error occurred.", 0).show();
            return;
        }
        if (!netHTTPResponseRegister.isOk()) {
            Toast.makeText(this, netHTTPResponseRegister.getMessage(), 0).show();
            return;
        }
        try {
            netClient.setSession(this, netHTTPResponseRegister.getDataObject().getString("session"));
            Toast.makeText(this, "Registration successful.", 0).show();
            startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        } catch (Exception unused) {
            Toast.makeText(this, "An error occurred.", 0).show();
        }
    }

    private void handleLogin() {
        startActivity(new Intent(this, (Class<?>) LoginActivity.class));
    }
}
