package com.senjuid.location;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class GeolocationViewModelFactory implements ViewModelProvider.Factory {

    private Context appContext;

    public GeolocationViewModelFactory(Context appContext) {
        this.appContext = appContext;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(GeolocationViewModel.class)) {
            return (T) new GeolocationViewModel(appContext);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
