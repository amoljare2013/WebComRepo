package com.amol.jare.webcomproject.ui.main.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.amol.jare.webcomproject.R
import com.amol.jare.webcomproject.ui.main.adapter.GalleryImageAdapter
import com.amol.jare.webcomproject.ui.main.model.dataclass.Images
import com.amol.jare.webcomproject.ui.main.viewmodel.GalleryViewModel

class GalleryFragment : Fragment() {

    private val SPAN_COUNT = 2
    private val imageList = ArrayList<Images>()
    lateinit var galleryAdapter: GalleryImageAdapter

    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(
            R.layout.fragment_gallery, container,
            false
        )


        val model = ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        model.getImages().observe(viewLifecycleOwner, Observer<List<Images>> { images ->
            // update UI
            updateGallery(images)
            Log.e("List--",""+images)

        })
        return view

    }

    private fun updateGallery(images: List<Images>) {
        imageList.clear();
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerView)
        galleryAdapter = GalleryImageAdapter(images)
        if (recyclerView != null) {
            recyclerView.layoutManager = GridLayoutManager(this.context, SPAN_COUNT)
            recyclerView.adapter = galleryAdapter
        }
        galleryAdapter.notifyDataSetChanged()
    }


}