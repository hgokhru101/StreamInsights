package com.example.educationapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.gallery_thumbnail.view.*
import java.util.*


class GalleryAdapter(val context: Context, val items: ArrayList<ImagesList>) : RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        return GalleryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.gallery_thumbnail, parent, false)
        )
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val item = items.get(position)
        holder.college.text = item.college_name

//        val requestOptions: RequestOptions = RequestOptions()
//            .placeholder(R.drawable.ic_place_holder)
//            .error(R.drawable.ic_error)
//            .fitCenter()
//        Glide.with(context)
//            .setDefaultRequestOptions(requestOptions)
//            .load(image_url[position].getImageUrl())
//            .into(holder.img)
    }

    class GalleryViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val college = view.college_name
        var images = view.images
        }

    override fun getItemCount(): Int {
        return items.size
    }
}