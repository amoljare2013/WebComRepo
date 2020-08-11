package com.amol.jare.webcomproject.ui.main.viewmodel;

import androidx.lifecycle.MutableLiveData;

import com.amol.jare.webcomproject.ui.main.model.dataclass.AudioObject;

import java.util.ArrayList;
import java.util.List;

public class AudioRepository {

    private ArrayList<AudioObject> mediaObjectList = new ArrayList<>();

    public MutableLiveData<List<AudioObject>> getAudio() {
        final MutableLiveData<List<AudioObject>> mutableLiveData = new MutableLiveData<>();
        prepareAudioList();
        return mutableLiveData;
    }

    private void prepareAudioList() {
        AudioObject mediaObject = new AudioObject();
        mediaObject.setId(1);
        mediaObject.setUserHandle("@ Amol Jare");
        mediaObject.setTitle(
                "Do you think the concept of marriage will no longer exist in the future?");
        mediaObject.setCoverUrl(
                "https://i.ibb.co/wBYDxLq/beach.jpg");
        mediaObject.setUrl("https://www.learningcontainer.com/wp-content/uploads/2020/02/Kalimba.mp3");

        AudioObject mediaObject2 = new AudioObject();
        mediaObject2.setId(2);
        mediaObject2.setUserHandle("@ Hardik.patel");
        mediaObject2.setTitle(
                "If my future husband doesn't cook food as good as my mother should I scold him?");
        mediaObject2.setCoverUrl(
                "https://i.ibb.co/gM5NNJX/butterfly.jpg");
        mediaObject2.setUrl(" https://www.learningcontainer.com/wp-content/uploads/2020/02/Sample-FLAC-File.flac");
        AudioObject mediaObject3 = new AudioObject();
        mediaObject3.setId(3);
        mediaObject3.setUserHandle("@ arun.gandhi");
        mediaObject3.setTitle("Give your opinion about the Ayodhya temple controversy.");
        mediaObject3.setCoverUrl(
                "https://i.ibb.co/10fFGkZ/car-race.jpg");
        mediaObject3.setUrl("https://www.learningcontainer.com/wp-content/uploads/2020/02/Sample-OGG-File.ogg");
        AudioObject mediaObject4 = new AudioObject();
        mediaObject4.setId(4);
        mediaObject4.setUserHandle("@ Sachin.patel");
        mediaObject4.setTitle("When did kama founders find sex offensive to Indian traditions");
        mediaObject4.setCoverUrl(
                "https://i.ibb.co/ygqHsHV/coffee-milk.jpg");
        mediaObject4.setUrl("https://www.learningcontainer.com/wp-content/uploads/2020/02/Sample-OGG-File.ogg");
        AudioObject mediaObject5 = new AudioObject();
        mediaObject5.setId(5);
        mediaObject5.setUserHandle("@ Monika.sharma");
        mediaObject5.setTitle("When did you last cry in front of someone?");
        mediaObject5.setCoverUrl("https://i.ibb.co/7XqwsLw/fox.jpg");
        mediaObject5.setUrl("https://www.learningcontainer.com/wp-content/uploads/2020/02/Sample-OGG-File.ogg");
        AudioObject mediaObject6 = new AudioObject();
        mediaObject6.setId(6);
        mediaObject6.setUserHandle("@ Virat Kohli");
        mediaObject6.setTitle("The Smoking Tire meets up with Chris and Jorge from CarsForAGrand.com to see just how far $1,000 can go when looking for a car");
        mediaObject6.setCoverUrl(
                "https://i.ibb.co/L1m1NxP/girl.jpg");
        mediaObject5.setUrl("https://www.learningcontainer.com/wp-content/uploads/2020/02/Kalimba.mp3");
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

