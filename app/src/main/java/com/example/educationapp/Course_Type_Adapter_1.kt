package com.example.educationapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Course_Type_Adapter_1(
    private val Course_List: ArrayList<CourseTypeCourseClass>
) : RecyclerView.Adapter<Course_Type_Adapter_1.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.course_type_1,
            parent, false
        )

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentCourse = Course_List[position]

        holder.Courses_View.text = currentCourse.name
        holder.Sub_CoursesView.text = currentCourse.course_name.toString()
//        holder.recyclerview2.adapter= Course_Type_Adapter_1(currentCourse.course_name)
//        if (currentCourse.duration != "") holder.textView3.text = currentCourse.duration

        Log.i("position", "$position")
        Log.i("itemCount", "$itemCount")

    }

    override fun getItemCount() = Course_List.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val Courses_View: TextView = itemView.findViewById(R.id.Course)
        val Sub_CoursesView: TextView = itemView.findViewById(R.id.Sub_Courses)
    }
}
