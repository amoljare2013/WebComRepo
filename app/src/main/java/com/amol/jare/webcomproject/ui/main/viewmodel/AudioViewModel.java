package com.amol.jare.webcomproject.ui.main.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.amol.jare.webcomproject.ui.main.model.dataclass.AudioObject;

import java.util.List;

public class AudioViewModel extends ViewModel {

    private AudioRepository audioRepository;

    private MutableLiveData<List<AudioObject>> mutableLiveData;

    public AudioViewModel() {
        audioRepository = new AudioRepository();
    }

    public LiveData<List<AudioObject>> getAudio() {
        if (mutableLiveData == null) {
            mutableLiveData = audioRepository.getAudio();
        }
        return mutableLiveData;
    }

}