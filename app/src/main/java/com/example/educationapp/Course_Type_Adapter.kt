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

class Course_Type_Adapter(private val Course_Type_List: ArrayList<CourseTypeClass>,private val Course_Type: ArrayList<CourseTypeCourseClass>): RecyclerView.Adapter<Course_Type_Adapter.MyViewHolder>() {
    private var isFirstItemExpanded : Boolean = true
    private var actionLock = false

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.course_type,
            parent, false)
        return MyViewHolder(itemView)
    }

    @SuppressLint("WrongConstant")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var currentCourse = Course_Type_List[position]
        holder.TitleView.text = currentCourse.title
        holder.Sub_CoursesView.text =  currentCourse.courses[position].course_name.toString()
    }

    override fun getItemCount() = Course_Type_List.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var TitleView : TextView = itemView.findViewById(R.id.Course_Title)
        var Sub_CoursesView: TextView = itemView.findViewById(R.id.Sub_Courses)

    }
}
