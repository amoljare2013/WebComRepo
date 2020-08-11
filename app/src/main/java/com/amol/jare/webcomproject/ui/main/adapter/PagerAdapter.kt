package com.amol.jare.webcomproject.ui.main.adapter

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.amol.jare.webcomproject.ui.main.view.*

class PagerAdapter(fragmentManager: FragmentManager?) : FragmentPagerAdapter(fragmentManager!!) {

    private val TITLES = arrayOf("HOME", "AUDIO", "GALLERY", "VIDEO")
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return HomwFragment()
            }

            1 -> {
                return FragmentAudio()
            }

            2 -> {
                return GalleryFragment()
            }

            3 -> {
                return FragmentVideo()
            }
            else ->
                return HomwFragment()
        }
    }



    override fun getPageTitle(position: Int): CharSequence {
        return TITLES[position]
    }

    override fun getCount(): Int {
        return TITLES.size
    }

}