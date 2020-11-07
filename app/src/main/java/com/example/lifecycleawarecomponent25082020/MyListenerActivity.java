package com.example.lifecycleawarecomponent25082020;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyListenerActivity implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void create(){
        Log.d("BBB","Create");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void start(){
        Log.d("BBB","Start");
    }
}
