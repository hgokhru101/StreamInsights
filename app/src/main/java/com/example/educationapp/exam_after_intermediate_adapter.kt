package com.example.educationapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.talent_test_data_presentation.view.*

class exam_after_intermediate_adapter (val context: Context, val testname: ArrayList<ExamAfterIntermediateExamClass>) :
    RecyclerView.Adapter<exam_after_intermediate_adapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): exam_after_intermediate_adapter.ViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.exams_after_intermediate_card, parent, false)
        return ViewHolder(itemView)
    }


    override fun getItemCount(): Int {
        return testname.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = testname[position]

        holder.af_test_name.text=item.test_name
        holder.af_purpose.text=item.Purpose
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val af_test_name=view.findViewById<TextView>(R.id.af_test_name)
        val af_purpose=view.findViewById<TextView>(R.id.af_purpose)

    }
}
