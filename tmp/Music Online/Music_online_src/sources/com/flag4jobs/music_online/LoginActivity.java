package com.flag4jobs.music_online;

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
import com.flag4jobs.music_online.httpclient.ApiClient;
import com.flag4jobs.music_online.httpclient.schema.request.LoginRequest;
import com.flag4jobs.music_online.httpclient.schema.response.MessageResponse;
import com.flag4jobs.music_online.httpclient.schema.response.TokenResponse;
import com.flag4jobs.music_online.storage.JWTStorage;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    private EditText emailEditText;
    private Button loginButton;
    private EditText passwordEditText;
    private TextView registerTextView;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.music_online.LoginActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return LoginActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.emailEditText = (EditText) findViewById(R.id.loginEmailEditText);
        this.passwordEditText = (EditText) findViewById(R.id.loginPasswordEditText);
        this.loginButton = (Button) findViewById(R.id.loginLoginButton);
        this.registerTextView = (TextView) findViewById(R.id.loginRegisterTextView);
        this.loginButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.music_online.LoginActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m66lambda$onCreate$1$comflag4jobsmusic_onlineLoginActivity(view);
            }
        });
        this.registerTextView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.music_online.LoginActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m67lambda$onCreate$2$comflag4jobsmusic_onlineLoginActivity(view);
            }
        });
        JWTStorage.clearJWT(this);
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: lambda$onCreate$1$com-flag4jobs-music_online-LoginActivity, reason: not valid java name */
    /* synthetic */ void m66lambda$onCreate$1$comflag4jobsmusic_onlineLoginActivity(View view) {
        try {
            handeLogin(this.emailEditText.getText().toString(), this.passwordEditText.getText().toString());
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
            Toast.makeText(this, "An error occurred.", 0).show();
        }
    }

    /* JADX INFO: renamed from: lambda$onCreate$2$com-flag4jobs-music_online-LoginActivity, reason: not valid java name */
    /* synthetic */ void m67lambda$onCreate$2$comflag4jobsmusic_onlineLoginActivity(View view) {
        handleRegister();
    }

    private void handeLogin(String str, String str2) {
        if (str.isEmpty() || str2.isEmpty()) {
            Toast.makeText(this, "Email and password are required.", 0).show();
            return;
        }
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setEmail(str);
        loginRequest.setPassword(str2);
        ApiClient.getApiService(this).login(loginRequest).enqueue(new Callback<TokenResponse>() { // from class: com.flag4jobs.music_online.LoginActivity.1
            @Override // retrofit2.Callback
            public void onResponse(Call<TokenResponse> call, Response<TokenResponse> response) {
                String token;
                if (response.isSuccessful()) {
                    TokenResponse tokenResponseBody = response.body();
                    if (tokenResponseBody == null || (token = tokenResponseBody.getToken()) == null) {
                        return;
                    }
                    JWTStorage.saveJWT(LoginActivity.this, token);
                    LoginActivity.this.startActivity(new Intent(LoginActivity.this, (Class<?>) MusicViewActivity.class));
                    return;
                }
                try {
                    Toast.makeText(LoginActivity.this, ((MessageResponse) new Gson().fromJson(response.errorBody().charStream(), MessageResponse.class)).getMessage(), 1).show();
                } catch (JsonSyntaxException e) {
                    Log.e(LoginActivity.TAG, e.getMessage());
                    Toast.makeText(LoginActivity.this, "An error occurred.", 1).show();
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<TokenResponse> call, Throwable th) {
                Log.w(LoginActivity.TAG, th.getMessage());
                Toast.makeText(LoginActivity.this, "Unable to contact the server.", 1).show();
            }
        });
    }

    private void handleRegister() {
        startActivity(new Intent(this, (Class<?>) RegisterActivity.class));
    }
}
