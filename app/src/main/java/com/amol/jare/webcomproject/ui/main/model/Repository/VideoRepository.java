package com.amol.jare.webcomproject.ui.main.model.Repository;

import androidx.lifecycle.MutableLiveData;

import com.amol.jare.webcomproject.ui.main.model.dataclass.MediaObject;

import java.util.ArrayList;
import java.util.List;

public class VideoRepository {

    private ArrayList<MediaObject> mediaObjectList = new ArrayList<>();

    public MutableLiveData<List<MediaObject>> getVideoMedia() {
        final MutableLiveData<List<MediaObject>> mutableLiveData = new MutableLiveData<>();
        prepareVideoList();
        return mutableLiveData;
    }

    private void prepareVideoList() {
        MediaObject mediaObject = new MediaObject();
        mediaObject.setId(1);
        mediaObject.setUserHandle("@ Amol Jare");
        mediaObject.setTitle(
                "Do you think the concept of marriage will no longer exist in the future?");
        mediaObject.setCoverUrl(
                "https://i.ibb.co/wBYDxLq/beach.jpg");
        mediaObject.setUrl("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4");
//        mediaObject.setUrl("https://www.learningcontainer.com/wp-content/uploads/2020/02/Kalimba.mp3");

        MediaObject mediaObject2 = new MediaObject();
        mediaObject2.setId(2);
        mediaObject2.setUserHandle("@ Hardik.patel");
        mediaObject2.setTitle(
                "If my future husband doesn't cook food as good as my mother should I scold him?");
        mediaObject2.setCoverUrl(
                "https://i.ibb.co/gM5NNJX/butterfly.jpg");
        mediaObject2.setUrl("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4");
//        mediaObject2.setUrl("https://www.learningcontainer.com/wp-content/uploads/2020/02/Kalimba-online-audio-converter.com_-1.wav");
        MediaObject mediaObject3 = new MediaObject();
        mediaObject3.setId(3);
        mediaObject3.setUserHandle("@ arun.gandhi");
        mediaObject3.setTitle("Give your opinion about the Ayodhya temple controversy.");
        mediaObject3.setCoverUrl(
                "https://i.ibb.co/10fFGkZ/car-race.jpg");
        mediaObject3.setUrl("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4");
//        mediaObject3.setUrl("https://www.learningcontainer.com/wp-content/uploads/2020/02/Kalimba.mp3");
        MediaObject mediaObject4 = new MediaObject();
        mediaObject4.setId(4);
        mediaObject4.setUserHandle("@ Sachin.patel");
        mediaObject4.setTitle("When did kama founders find sex offensive to Indian traditions");
        mediaObject4.setCoverUrl(
                "https://i.ibb.co/ygqHsHV/coffee-milk.jpg");
        mediaObject4.setUrl("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4");
        MediaObject mediaObject5 = new MediaObject();
        mediaObject5.setId(5);
        mediaObject5.setUserHandle("@ Monika.sharma");
        mediaObject5.setTitle("When did you last cry in front of someone?");
        mediaObject5.setCoverUrl("https://i.ibb.co/7XqwsLw/fox.jpg");
        mediaObject5.setUrl("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4");
        MediaObject mediaObject6 = new MediaObject();
        mediaObject6.setId(6);
        mediaObject6.setUserHandle("@ Virat Kohli");
        mediaObject6.setTitle("The Smoking Tire meets up with Chris and Jorge from CarsForAGrand.com to see just how far $1,000 can go when looking for a car");
        mediaObject6.setCoverUrl(
                "https://i.ibb.co/L1m1NxP/girl.jpg");
        mediaObject5.setUrl("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WhatCarCanYouGetForAGrand.mp4");
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
