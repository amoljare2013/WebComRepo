package com.amol.jare.webcomproject.ui.main.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amol.jare.webcomproject.R
import com.amol.jare.webcomproject.ui.main.model.dataclass.HomeData
import com.amol.jare.webcomproject.ui.main.model.dataclass.Images
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import kotlinx.android.synthetic.main.home_list_item.view.*
import kotlinx.android.synthetic.main.item_gallery_image.view.*

class HomeAdapter(private val itemList: List<HomeData>) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {
    private var context: Context? = null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeAdapter.ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.home_list_item, parent,
            false
        )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            val home = itemList.get(adapterPosition)

            Glide.with(context!!)
                .load(home.mediaCoverImgUrl)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(itemView.ivProfile)

            itemView.tvTitle.setText(home.title)
            itemView.tvUserHandle.setText(home.name)
        }
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        holder.bind()
    }

}