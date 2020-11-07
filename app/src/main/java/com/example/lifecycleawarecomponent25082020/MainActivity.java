package com.example.lifecycleawarecomponent25082020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MyListenerActivity myListenerActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListenerActivity = new MyListenerActivity();
        getLifecycle().addObserver(myListenerActivity);
    }
}