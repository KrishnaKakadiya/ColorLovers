package com.krishna.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;

import com.krishna.myapplication.adapters.ColourLoverAdapter;
import com.krishna.myapplication.databinding.ActivityMainBinding;
import com.krishna.myapplication.models.ColourLovers;
import com.krishna.myapplication.presenter.Presenter;
import com.krishna.myapplication.presenter.ViewListener;
import com.krishna.myapplication.restfuls.RestApi;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewListener {
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        demoApplication = DemoApplication.getApplication(this);
        restApi = demoApplication.getRestApi();
        presenter = new Presenter(this,this, restApi);

        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(activityMainBinding.edittextSearchkey.getText().toString().length()>2) {
                    presenter.getData(activityMainBinding.edittextSearchkey.getText().toString());
                }
            }
        });

    }
    private Presenter presenter;
    private DemoApplication demoApplication;
    private RestApi restApi;

    @Override
    public void successTag(Object objectType) {
        final List<ColourLovers> listColourLovers = (List<ColourLovers>) objectType;

        if(listColourLovers.size() > 0) {
            activityMainBinding.gridview.setAdapter((ListAdapter) new ColourLoverAdapter(listColourLovers));
        }
    }
}