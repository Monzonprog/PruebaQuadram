package com.example.jorge.pruebaquadram.Interfaces;

import com.example.jorge.pruebaquadram.Class.AppObject;
import com.example.jorge.pruebaquadram.Class.DetailObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jorge on 22/10/17.
 */

public interface RestClient {

    @GET("es/rss/toppaidapplications/limit=10/json")
    Call<AppObject>getPaidApp();

    @GET("es/rss/topfreeapplications/limit=10/json")
    Call<AppObject>getFreeApp();

    @GET("lookup?id=")
    Call<DetailObject>getInfoApp(@Query("id")String id);
}