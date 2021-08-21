package com.krishna.myapplication.restfuls;

import android.content.res.Resources;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RestClient {
    public RestClient(Resources resources)
    {
        setRetrofit(resources);
    }

    private static final String END_POINT = "https://www.colourlovers.com/api/";
    private static final int TIME_OUT = 30000;

    private void setRetrofit(final Resources resources) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(END_POINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        restApi = retrofit.create(RestApi.class);
    }

    private RestApi restApi = null;

    public RestApi getRestAPI()
    {
        return restApi;
    }
}
