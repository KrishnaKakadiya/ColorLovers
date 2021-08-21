package com.krishna.myapplication.presenter;

import android.content.Context;

import com.krishna.myapplication.models.ColourLovers;
import com.krishna.myapplication.restfuls.RestApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Presenter {

    private ViewListener mViewListener;
    private Context mContext;
    private RestApi mRestApi;


    public Presenter(Context context, ViewListener listener, RestApi restApi) {
        this.mContext = context;
        this.mViewListener = listener;
        this.mRestApi = restApi;
    }

    public void getData(String searchKey) {
        if(searchKey != null) {
            mRestApi.searchColor(searchKey, new Callback<List<ColourLovers>>() {


                @Override
                public void onResponse(Call<List<ColourLovers>> call, Response<List<ColourLovers>> response) {
                    if(response.isSuccessful()){
                        mViewListener.successTag(response);
                    }
                }

                @Override
                public void onFailure(Call<List<ColourLovers>> call, Throwable t) {

                }
            });
        }
    }
}
