package com.andrey7mel.testrx.model.api;

import com.andrey7mel.testrx.model.data.Repo;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

public interface ApiInterface {
// Интерфейс для получения данных о репозиториях
    @GET("users/{user}/repos")
    Observable<List<Repo>> getRepositories(@Path("user") String user);

}
