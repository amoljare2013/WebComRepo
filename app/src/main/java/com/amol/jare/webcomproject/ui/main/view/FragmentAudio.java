package com.amol.jare.webcomproject.ui.main.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.amol.jare.webcomproject.R;
import com.amol.jare.webcomproject.ui.main.adapter.MediaRecyclerAdapter;
import com.amol.jare.webcomproject.ui.main.helper.ExoPlayerRecyclerView;
import com.amol.jare.webcomproject.ui.main.model.dataclass.MediaObject;
import com.amol.jare.webcomproject.ui.main.viewmodel.AudioViewModel;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import static android.widget.LinearLayout.VERTICAL;

public class FragmentAudio extends Fragment {

    public static FragmentVideo newInstance() {
        return new FragmentVideo();
    }

    ExoPlayerRecyclerView mRecyclerView;
    private ArrayList<MediaObject> mediaObjectList = new ArrayList<>();
    private MediaRecyclerAdapter mAdapter;
    private boolean firstTime = true;
    AudioViewModel audioViewModel = new AudioViewModel();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.fragment_video, container, false);

        mRecyclerView = RootView.findViewById(R.id.exoPlayerRecyclerView);

        return RootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            mediaObjectList.clear();
            initView();
            prepareAudioList();
            mRecyclerView.setMediaObjects(mediaObjectList);
            mAdapter = new MediaRecyclerAdapter(mediaObjectList, initGlide());
            mRecyclerView.setAdapter(mAdapter);
            if (firstTime) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        mRecyclerView.playVideo(false);
                    }
                });
                firstTime = false;
            }
        }
    }

    @SuppressLint("WrongConstant")
    private void initView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), VERTICAL, false));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private RequestManager initGlide() {
        RequestOptions options = new RequestOptions();
        return Glide.with(this)
                .setDefaultRequestOptions(options);
    }

    @Override
    public void onDestroy() {
        if (mRecyclerView != null) {
            mRecyclerView.releasePlayer();
        }
        super.onDestroy();
    }

    @Override
    public void onStop() {
        if (mRecyclerView != null) {
            mRecyclerView.releasePlayer();
            mRecyclerView.onPausePlayer();
        }
        super.onStop();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    private void prepareAudioList() {
        MediaObject mediaObject = new MediaObject();
        mediaObject.setId(1);
        mediaObject.setUserHandle("@ Amol Jare");
        mediaObject.setTitle(
                "Do you think the concept of marriage will no longer exist in the future?");
        mediaObject.setCoverUrl(
                "https://i.ibb.co/wBYDxLq/beach.jpg");
        mediaObject.setUrl("https://www.learningcontainer.com/wp-content/uploads/2020/02/Kalimba.mp3");

        MediaObject mediaObject2 = new MediaObject();
        mediaObject2.setId(2);
        mediaObject2.setUserHandle("@ Hardik.patel");
        mediaObject2.setTitle(
                "If my future husband doesn't cook food as good as my mother should I scold him?");
        mediaObject2.setCoverUrl(
                "https://i.ibb.co/gM5NNJX/butterfly.jpg");
        mediaObject2.setUrl("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3");
        MediaObject mediaObject3 = new MediaObject();
        mediaObject3.setId(3);
        mediaObject3.setUserHandle("@ arun.gandhi");
        mediaObject3.setTitle("Give your opinion about the Ayodhya temple controversy.");
        mediaObject3.setCoverUrl(
                "https://i.ibb.co/10fFGkZ/car-race.jpg");
        mediaObject3.setUrl("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-2.mp3");
        MediaObject mediaObject4 = new MediaObject();
        mediaObject4.setId(4);
        mediaObject4.setUserHandle("@ Sachin.patel");
        mediaObject4.setTitle("When did kama founders find sex offensive to Indian traditions");
        mediaObject4.setCoverUrl(
                "https://i.ibb.co/ygqHsHV/coffee-milk.jpg");
        mediaObject4.setUrl("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-3.mp3");
        MediaObject mediaObject5 = new MediaObject();
        mediaObject5.setId(5);
        mediaObject5.setUserHandle("@ Monika.sharma");
        mediaObject5.setTitle("When did you last cry in front of someone?");
        mediaObject5.setCoverUrl("https://i.ibb.co/7XqwsLw/fox.jpg");
        mediaObject5.setUrl("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-4.mp3");
        MediaObject mediaObject6 = new MediaObject();
        mediaObject6.setId(6);
        mediaObject6.setUserHandle("@ Virat Kohli");
        mediaObject6.setTitle("The Smoking Tire meets up with Chris and Jorge from CarsForAGrand.com to see just how far $1,000 can go when looking for a car");
        mediaObject6.setCoverUrl(
                "https://i.ibb.co/L1m1NxP/girl.jpg");
        mediaObject5.setUrl("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-5.mp3");
        mediaObjectList.add(mediaObject);
        mediaObjectList.add(mediaObject2);
        mediaObjectList.add(mediaObject3);
        mediaObjectList.add(mediaObject4);
        mediaObjectList.add(mediaObject5);
        mediaObjectList.add(mediaObject);
        mediaObjectList.add(mediaObject2);
        mediaObjectList.add(mediaObject3);
        mediaObjectList.add(mediaObject4);
        mediaObjectList.add(mediaObject5);
    }

}
