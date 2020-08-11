package com.amol.jare.webcomproject.ui.main.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.amol.jare.webcomproject.ui.main.model.Repository.VideoRepository;
import com.amol.jare.webcomproject.ui.main.model.dataclass.MediaObject;

import java.util.List;

public class VideoViewModel extends ViewModel {

    private VideoRepository videoRepository;

    private MutableLiveData<List<MediaObject>> mutableLiveData;

    public VideoViewModel() {
        videoRepository = new VideoRepository();
    }

    public LiveData<List<MediaObject>> getVideo() {
        if (mutableLiveData == null) {
            mutableLiveData = videoRepository.getVideoMedia();
        }
        return mutableLiveData;
    }

}
