package com.example.educationapp

import android.app.Activity
//import android.content.Context
//import android.content.Intent
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

data class first_page_adapter(var title_icon:List<FirstPage>, var activity: Activity) : BaseAdapter(){


    override fun getItem(position: Int): Any {
        return title_icon.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return title_icon.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = View.inflate(activity,R.layout.first_page,null)

        val title = view.findViewById<TextView>(R.id.title) as TextView
        val img_icon=view.findViewById<ImageView>(R.id.img_icon)
        title.setTextColor(Color.parseColor("#FFFFFF"))
        title.text= title_icon.get(position).title
        val title_pic=title_icon.get(position).img_icon
        img_icon.setImageResource(title_pic)

        return view
    }

}