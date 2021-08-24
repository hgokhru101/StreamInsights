package com.example.educationapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.LinearLayout.*
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Course_Type_Adapter(private val Course_Type_List: ArrayList<CourseTypeClass>): RecyclerView.Adapter<Course_Type_Adapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.course_type,
            parent, false)
        return MyViewHolder(itemView)
    }

    @SuppressLint("WrongConstant")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentCourse = Course_Type_List[position]
        holder.TitleView.text = currentCourse.title
        holder.recyclerview1.adapter = Course_Type_Adapter_1(currentCourse.courses)
        holder.recyclerview1.layoutManager = LinearLayoutManager(holder.recyclerview1.context, HORIZONTAL, false)
        holder.recyclerview1.setHasFixedSize(true)
    }

    override fun getItemCount() = Course_Type_List.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val TitleView : TextView = itemView.findViewById(R.id.Title)
        val recyclerview1 = itemView.findViewById<RecyclerView>(R.id.recyclerview1)


    }
}
