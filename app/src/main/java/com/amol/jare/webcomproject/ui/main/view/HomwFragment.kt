package com.amol.jare.webcomproject.ui.main.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.amol.jare.webcomproject.R
import com.amol.jare.webcomproject.ui.main.adapter.GalleryImageAdapter
import com.amol.jare.webcomproject.ui.main.adapter.HomeAdapter
import com.amol.jare.webcomproject.ui.main.model.dataclass.HomeData
import com.amol.jare.webcomproject.ui.main.model.dataclass.Images
import com.amol.jare.webcomproject.ui.main.viewmodel.GalleryViewModel
import com.amol.jare.webcomproject.ui.main.viewmodel.HomeViewModel

class HomwFragment : Fragment() {

    private val homeList = ArrayList<HomeData>()
    lateinit var homeAdapter: HomeAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(
            R.layout.fragment_home, container,
            false
        )


        val model = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        model.gethomes().observe(viewLifecycleOwner, Observer<List<HomeData>> { homes ->
            // update UI
            updateData(homes)

        })
        return view
    }

    private fun updateData(homes: List<HomeData>) {
        homeList.clear();
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerView)
        homeAdapter = HomeAdapter(homes)
        if (recyclerView != null) {
            val layoutManager = LinearLayoutManager(activity)
            recyclerView.layoutManager = layoutManager
            recyclerView.adapter = homeAdapter
        }
        // Setting item decoration for recycler view
        var itemDecoration: RecyclerView.ItemDecoration? = null
        if (recyclerView != null) {
            while (recyclerView.itemDecorationCount > 0 && (recyclerView.getItemDecorationAt(0)?.let { itemDecoration = it }) != null) {
                recyclerView.removeItemDecoration(itemDecoration!!)
            }
        }

        homeAdapter.notifyDataSetChanged()

    }
}