package com.example.app_040922_nd.ui.calculadora;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CalculadoraViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CalculadoraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is calculadora fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}