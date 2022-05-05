package com.example.app_040922_nd.ui.maravillasmodernas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MaravillasModernasViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MaravillasModernasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is maravillas modernas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}