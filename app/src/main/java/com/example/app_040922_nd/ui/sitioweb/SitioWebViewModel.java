package com.example.app_040922_nd.ui.sitioweb;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SitioWebViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SitioWebViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is sitio web fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}