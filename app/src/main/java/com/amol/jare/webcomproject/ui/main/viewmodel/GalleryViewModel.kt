package com.amol.jare.webcomproject.ui.main.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.amol.jare.webcomproject.ui.main.model.dataclass.Images

class GalleryViewModel(application: Application) : AndroidViewModel(application) {

    private lateinit var images: MutableLiveData<List<Images>>
    private val imageList = ArrayList<Images>()

    fun getImages(): MutableLiveData<List<Images>> {
        if (!::images.isInitialized) {
            images = MutableLiveData()
            loadImages()
        }
        return images
    }

    private fun loadImages() {
        imageList.add(Images("https://i.ibb.co/wBYDxLq/beach.jpg", "Beach Houses"))
        imageList.add(Images("https://i.ibb.co/gM5NNJX/butterfly.jpg", "Butterfly"))
        imageList.add(Images("https://i.ibb.co/10fFGkZ/car-race.jpg", "Car Racing"))
        imageList.add(Images("https://i.ibb.co/ygqHsHV/coffee-milk.jpg", "Coffee with Milk"))
        imageList.add(Images("https://i.ibb.co/7XqwsLw/fox.jpg", "Fox"))
        imageList.add(Images("https://i.ibb.co/L1m1NxP/girl.jpg", "Mountain Girl"))
        imageList.add(Images("https://i.ibb.co/wc9rSgw/desserts.jpg", "Desserts Table"))
        imageList.add(Images("https://i.ibb.co/wdrdpKC/kitten.jpg", "Kitten"))
        imageList.add(Images("https://i.ibb.co/dBCHzXQ/paris.jpg", "Paris Eiffel"))
        imageList.add(Images("https://i.ibb.co/JKB0KPk/pizza.jpg", "Pizza Time"))
        imageList.add(Images("https://i.ibb.co/VYYPZGk/salmon.jpg", "Salmon "))
        imageList.add(Images("https://i.ibb.co/JvWpzYC/sunset.jpg", "Sunset in Beach"))

        images.postValue(imageList)
    }


}