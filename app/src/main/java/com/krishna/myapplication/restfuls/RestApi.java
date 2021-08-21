package com.krishna.myapplication.restfuls;

import com.krishna.myapplication.models.ColourLovers;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RestApi {

    @GET("colors?keywords={searchKey}&format=json&numResults=20")
    void searchColor(@Path("searchKey") String searchKey, Callback<List<ColourLovers>> callback);

}
