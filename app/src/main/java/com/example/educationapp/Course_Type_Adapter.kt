package com.example.educationapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Course_Type_Adapter(private val Course_Type_List: ArrayList<CourseTypeClass>): RecyclerView.Adapter<Course_Type_Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.course_type,
            parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentCourse = Course_Type_List[position]
        holder.CourseView.text = currentCourse.title
        holder.SubCourseView.text = currentCourse.courses.toString()

    }

    override fun getItemCount() = Course_Type_List.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val CourseView : TextView = itemView.findViewById(R.id.Course)
        val SubCourseView : TextView = itemView.findViewById(R.id.Sub_Course)

    }
}
