package com.flag4jobs.music_online.httpclient;

import com.flag4jobs.music_online.httpclient.schema.request.AddOrRemoveFavoriteRequest;
import com.flag4jobs.music_online.httpclient.schema.request.LoginRequest;
import com.flag4jobs.music_online.httpclient.schema.request.PasswordResetRequest;
import com.flag4jobs.music_online.httpclient.schema.request.RegisterRequest;
import com.flag4jobs.music_online.httpclient.schema.response.MessageResponse;
import com.flag4jobs.music_online.httpclient.schema.response.MusicsResponse;
import com.flag4jobs.music_online.httpclient.schema.response.TokenResponse;
import com.flag4jobs.music_online.httpclient.schema.response.UserResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes.dex */
public interface ApiService {
    @POST("favorites/add")
    Call<MessageResponse> addFavoriteMusic(@Body AddOrRemoveFavoriteRequest addOrRemoveFavoriteRequest);

    @GET("musics/all")
    Call<MusicsResponse> getAllMusics();

    @GET("musics/favorites")
    Call<MusicsResponse> getFavoriteMusics();

    @POST("auth/login")
    Call<TokenResponse> login(@Body LoginRequest loginRequest);

    @POST("auth/password-reset")
    Call<UserResponse> passwordReset(@Body PasswordResetRequest passwordResetRequest);

    @POST("auth/register")
    Call<TokenResponse> register(@Body RegisterRequest registerRequest);

    @POST("favorites/remove")
    Call<MessageResponse> removeFavoriteMusic(@Body AddOrRemoveFavoriteRequest addOrRemoveFavoriteRequest);
}
