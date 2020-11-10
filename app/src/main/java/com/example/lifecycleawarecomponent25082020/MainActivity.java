package com.example.lifecycleawarecomponent25082020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    MyViewModel myViewModel;
    TextView mTv;
    Button mBtnRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        mTv = findViewById(R.id.textview);
        mBtnRandom = findViewById(R.id.buttonRandom);

        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.setString(new Random().nextInt() + "");
            }
        });
        myViewModel.getString().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                mTv.setText(s);
            }
        });


    }
}