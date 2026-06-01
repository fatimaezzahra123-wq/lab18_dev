package com.example.viewmodellivedatademo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    // MutableLiveData = modifiable uniquement depuis le ViewModel
    private final MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    public CounterViewModel() {
        countLiveData.setValue(0); // valeur initiale, appelée une seule fois
    }

    public void increment() {
        Integer current = countLiveData.getValue();
        if (current != null) {
            countLiveData.setValue(current + 1);
        }
    }

    public void decrement() {
        Integer current = countLiveData.getValue();
        if (current != null) {
            countLiveData.setValue(current - 1);
        }
    }

    public void reset() {
        countLiveData.setValue(0);
    }

    // Exposé en lecture seule à l'Activity
    public LiveData<Integer> getCount() {
        return countLiveData;
    }
}