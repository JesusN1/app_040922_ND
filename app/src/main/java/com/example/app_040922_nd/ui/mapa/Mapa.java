package com.example.app_040922_nd.ui.mapa;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.app_040922_nd.R;

public class Mapa extends ViewModel {

    private final MutableLiveData<String> mText;



    public Mapa() {
        mText = new MutableLiveData<>();
        mText.setValue("This is visualizador 3d fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}