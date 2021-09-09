package com.example.educationapp

//import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import android.widget.BaseAdapter
import android.widget.BaseExpandableListAdapter
//import android.widget.LinearLayout
//import android.widget.LinearLayout.*
import android.widget.TextView
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView

class after_graduation_adapter internal constructor(private val context:Context,private val student_type: ArrayList<String>,private val stud_fut_opt_map: HashMap<String,ArrayList<String>>): BaseExpandableListAdapter() {

    override fun getGroupCount(): Int {
        return student_type.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return this.stud_fut_opt_map[this.student_type[groupPosition]]!!.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return student_type[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return this.stud_fut_opt_map[this.student_type[groupPosition]]!![childPosition]
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
            convertView = inflater.inflate(R.layout.after_graduation_parent, null)
        }
        val student_typeTv=convertView!!.findViewById<TextView>(R.id.student_type)
        student_typeTv.setText(chapterTitle)
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
            convertView = inflater.inflate(R.layout.after_graduation_child, null)
        }
        val courseNameTv=convertView!!.findViewById<TextView>(R.id.future_options)
        courseNameTv.setText(TopicTitle)
        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}
