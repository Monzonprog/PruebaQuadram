package com.example.jorge.pruebaquadram.Utils;

import android.util.Log;

import com.example.jorge.pruebaquadram.Class.AppObject;
import com.example.jorge.pruebaquadram.Class.DetailObject;
import com.example.jorge.pruebaquadram.Interfaces.IDataApp;
import com.example.jorge.pruebaquadram.Interfaces.IDataDetails;
import com.example.jorge.pruebaquadram.Interfaces.RestClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jorge on 22/10/17.
 */

public class ConexionManager {

        private Gson gson;
        private Retrofit retrofit;
        private RestClient restClient;
        private IDataApp appListener;
        private IDataDetails detailsListener;

        public ConexionManager(String url) {

            gson = new GsonBuilder()
                    .create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            restClient = retrofit.create(RestClient.class);
        }

        public void getPaidApp(IDataApp listener) {
            appListener = listener;
            Call<AppObject> call = restClient.getPaidApp();
            call.enqueue(new Callback<AppObject>() {
                @Override
                public void onResponse(Call<AppObject>call, Response<AppObject>response) {
                    switch (response.code()) {
                        case 200:
                            AppObject data = response.body();
                            appListener.conexionCorrecta(data);
                            break;
                        case 401:
                            appListener.conexionIncorrecta();
                            break;
                        default:
                            appListener.conexionIncorrecta();

                            break;
                    }
                }

                @Override
                public void onFailure(Call<AppObject>call, Throwable t) {
                    appListener.conexionIncorrecta();

                    Log.e("error", t.toString());
                }

            });
        }

    public void getFreeApp(IDataApp listener) {
        appListener = listener;
        Call<AppObject> call = restClient.getFreeApp();
        call.enqueue(new Callback<AppObject>() {
            @Override
            public void onResponse(Call<AppObject> call, Response<AppObject> response) {
                switch (response.code()) {
                    case 200:
                        AppObject data = response.body();
                        appListener.conexionCorrecta(data);
                        break;
                    case 401:
                        appListener.conexionIncorrecta();
                        break;
                    default:
                        appListener.conexionIncorrecta();

                        break;
                }
            }

            @Override
            public void onFailure(Call<AppObject>call, Throwable t) {
                appListener.conexionIncorrecta();

                Log.e("error", t.toString());
            }

        });
    }

    public void getInfoApp(IDataDetails listener, String id){
        detailsListener = listener;
        Call<DetailObject> call = restClient.getInfoApp(id);
        call.enqueue(new Callback<DetailObject>() {
            @Override
            public void onResponse(Call<DetailObject> call, Response<DetailObject> response) {
                switch (response.code()) {
                    case 200:
                        DetailObject data = response.body();
                        detailsListener.conexionCorrecta(data);
                        break;
                    case 401:
                        detailsListener.conexionIncorrecta();
                        break;
                    default:
                        detailsListener.conexionIncorrecta();

                        break;
                }
            }

            @Override
            public void onFailure(Call<DetailObject> call, Throwable t) {

                detailsListener.conexionIncorrecta();

                Log.e("error", t.toString());

            }



        });
    }


}
