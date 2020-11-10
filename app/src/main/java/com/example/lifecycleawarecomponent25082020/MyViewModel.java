package com.example.lifecycleawarecomponent25082020;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    MutableLiveData<String> mStringData ;

    public MyViewModel() {
        mStringData = new MutableLiveData<>();
    }

    public void setString(String message){
        mStringData.setValue(message);
    }
    public LiveData<String> getString(){
        return  mStringData;
    }
}
