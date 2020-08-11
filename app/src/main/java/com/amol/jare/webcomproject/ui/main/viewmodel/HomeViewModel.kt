package com.amol.jare.webcomproject.ui.main.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.amol.jare.webcomproject.ui.main.model.dataclass.HomeData

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private lateinit var homes: MutableLiveData<List<HomeData>>
    private val homeList = ArrayList<HomeData>()

    fun gethomes(): MutableLiveData<List<HomeData>> {
        if (!::homes.isInitialized) {
            homes = MutableLiveData()
            loadhomes()
        }
        return homes
    }

    private fun loadhomes() {
        homeList.add(HomeData("Do you think the concept of marriage will no longer exist in the future?","Amol Jare","https://i.ibb.co/gM5NNJX/butterfly.jpg"))
        homeList.add(HomeData("If my future husband doesn't cook food as good as my mother should I scold him?","Ajay","https://i.ibb.co/10fFGkZ/car-race.jpg"))
        homeList.add(HomeData("Give your opinion about the Ayodhya temple controversy.","Anil","https://i.ibb.co/7XqwsLw/fox.jpg"))
        homeList.add(HomeData("When did kama founders find sex offensive to Indian traditions","Ankit","https://i.ibb.co/L1m1NxP/girl.jpg"))
        homeList.add(HomeData("Do you think the concept of marriage will no longer exist in the future?","Amol","https://i.ibb.co/gM5NNJX/butterfly.jpg"))
        homeList.add(HomeData("If my future husband doesn't cook food as good as my mother should I scold him?","Prem","https://i.ibb.co/10fFGkZ/car-race.jpg"))
        homeList.add(HomeData("Give your opinion about the Ayodhya temple controversy.","Akhil","https://i.ibb.co/7XqwsLw/fox.jpg"))
        homeList.add(HomeData("When did kama founders find sex offensive to Indian traditions","Achut","https://i.ibb.co/L1m1NxP/girl.jpg"))

        homes.postValue(homeList)
    }


}