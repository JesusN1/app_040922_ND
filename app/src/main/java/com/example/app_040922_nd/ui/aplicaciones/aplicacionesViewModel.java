package com.example.app_040922_nd.ui.aplicaciones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class aplicacionesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public aplicacionesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is abrir aplicaciones fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}