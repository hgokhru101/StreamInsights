package com.example.educationapp

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.BaseExpandableListAdapter
import android.widget.LinearLayout
import android.widget.LinearLayout.*
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Course_Type_Adapter internal constructor(private val context:Context,private val CourseType: ArrayList<String>,private val Course_names: HashMap<String,ArrayList<String>>): BaseExpandableListAdapter() {

    override fun getGroupCount(): Int {
        return CourseType.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return this.Course_names[this.CourseType[groupPosition]]!!.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return CourseType[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return this.Course_names[this.CourseType[groupPosition]]!![childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {

        var convertView= convertView
        val chapterTitle=getGroup(groupPosition) as String

        if (convertView==null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.course_type, null)
        }
        val courseTypeTv=convertView!!.findViewById<TextView>(R.id.Course_Title)
        courseTypeTv.setText(chapterTitle)
        return convertView
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView= convertView
        val TopicTitle=getChild(groupPosition,childPosition) as String

        if (convertView==null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.course_type_1, null)
        }
        val courseNameTv=convertView!!.findViewById<TextView>(R.id.Sub_Courses)
        courseNameTv.setText(TopicTitle)
        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}
