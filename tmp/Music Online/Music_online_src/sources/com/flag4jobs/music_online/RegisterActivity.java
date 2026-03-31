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
import com.flag4jobs.music_online.httpclient.schema.request.RegisterRequest;
import com.flag4jobs.music_online.httpclient.schema.response.MessageResponse;
import com.flag4jobs.music_online.httpclient.schema.response.TokenResponse;
import com.flag4jobs.music_online.storage.JWTStorage;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class RegisterActivity extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";
    private EditText emailEditText;
    private TextView loginTextView;
    private EditText passwordEditText;
    private Button registerButton;
    private EditText usernameEditText;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.flag4jobs.music_online.RegisterActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return RegisterActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.usernameEditText = (EditText) findViewById(R.id.registerUsernameEditText);
        this.emailEditText = (EditText) findViewById(R.id.registerEmailEditText);
        this.passwordEditText = (EditText) findViewById(R.id.registerPasswordEditText);
        this.registerButton = (Button) findViewById(R.id.registerRegisterButton);
        this.loginTextView = (TextView) findViewById(R.id.registerLoginTextView);
        this.registerButton.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.music_online.RegisterActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m74lambda$onCreate$1$comflag4jobsmusic_onlineRegisterActivity(view);
            }
        });
        this.loginTextView.setOnClickListener(new View.OnClickListener() { // from class: com.flag4jobs.music_online.RegisterActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m75lambda$onCreate$2$comflag4jobsmusic_onlineRegisterActivity(view);
            }
        });
        JWTStorage.clearJWT(this);
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: lambda$onCreate$1$com-flag4jobs-music_online-RegisterActivity, reason: not valid java name */
    /* synthetic */ void m74lambda$onCreate$1$comflag4jobsmusic_onlineRegisterActivity(View view) {
        try {
            handleRegister(this.usernameEditText.getText().toString(), this.emailEditText.getText().toString(), this.passwordEditText.getText().toString());
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
            Toast.makeText(this, "An error occurred.", 0).show();
        }
    }

    /* JADX INFO: renamed from: lambda$onCreate$2$com-flag4jobs-music_online-RegisterActivity, reason: not valid java name */
    /* synthetic */ void m75lambda$onCreate$2$comflag4jobsmusic_onlineRegisterActivity(View view) {
        handleLogin();
    }

    private void handleRegister(String str, String str2, String str3) {
        if (str.isEmpty() || str2.isEmpty() || str3.isEmpty()) {
            Toast.makeText(this, "Username, email and password are required.", 0).show();
            return;
        }
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setUsername(str);
        registerRequest.setEmail(str2);
        registerRequest.setPassword(str3);
        ApiClient.getApiService(this).register(registerRequest).enqueue(new Callback<TokenResponse>() { // from class: com.flag4jobs.music_online.RegisterActivity.1
            @Override // retrofit2.Callback
            public void onResponse(Call<TokenResponse> call, Response<TokenResponse> response) {
                String token;
                if (response.isSuccessful()) {
                    TokenResponse tokenResponseBody = response.body();
                    if (tokenResponseBody == null || (token = tokenResponseBody.getToken()) == null) {
                        return;
                    }
                    JWTStorage.saveJWT(RegisterActivity.this, token);
                    RegisterActivity.this.startActivity(new Intent(RegisterActivity.this, (Class<?>) MusicViewActivity.class));
                    return;
                }
                try {
                    Toast.makeText(RegisterActivity.this, ((MessageResponse) new Gson().fromJson(response.errorBody().charStream(), MessageResponse.class)).getMessage(), 1).show();
                } catch (JsonSyntaxException e) {
                    Log.e(RegisterActivity.TAG, e.getMessage());
                    Toast.makeText(RegisterActivity.this, "An error occurred.", 1).show();
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<TokenResponse> call, Throwable th) {
                Log.w(RegisterActivity.TAG, th.getMessage());
                Toast.makeText(RegisterActivity.this, "Unable to contact the server.", 1).show();
            }
        });
    }

    private void handleLogin() {
        startActivity(new Intent(this, (Class<?>) LoginActivity.class));
    }
}
