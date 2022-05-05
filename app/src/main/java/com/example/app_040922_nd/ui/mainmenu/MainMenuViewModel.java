package com.example.app_040922_nd.ui.mainmenu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainMenuViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MainMenuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is main menu fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}