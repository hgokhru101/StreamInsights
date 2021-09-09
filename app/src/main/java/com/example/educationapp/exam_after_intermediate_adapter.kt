package com.example.educationapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class exam_after_intermediate_adapter (val context: Context, val entrance_list: ArrayList<ExamAfterIntermediateExamClass>) :
    RecyclerView.Adapter<exam_after_intermediate_adapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): exam_after_intermediate_adapter.ViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.exams_after_intermediate_card, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return entrance_list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = entrance_list[position]
        holder.af_test_name.text = item.test_name
        holder.af_purpose.text = item.Purpose
        holder.af_eligibility.text = item.Eligibility
        holder.af_app_mode.text = item.Application_mode
        holder.af_source.text = item.Source
        holder.af_conduct.text = item.Conducted_By
        holder.af_invited.text = item.Application_Invited_For
        holder.af_notify.text = item.Notification_Month
        holder.af_selection.text = item.Mode_of_Selection

        if (holder.af_test_name.length() == 0) {
            holder.testname_linear.setVisibility(View.GONE);
        }
        if (holder.af_purpose.length() == 0) {
            holder.purpose_linear.setVisibility(View.GONE);
        }
        if (holder.af_eligibility.length() == 0) {
            holder.eligib_linear.setVisibility(View.GONE);
        }
        if (holder.af_source.length() == 0) {
            holder.source_linear.setVisibility(View.GONE);
        }
        if (holder.af_app_mode.length() == 0) {
            holder.app_mode_linear.setVisibility(View.GONE);
        }
        if (holder.af_conduct.length() == 0) {
            holder.conduct_linear.setVisibility(View.GONE);
        }
        if (holder.af_invited.length() == 0) {
            holder.app_invited_linear.setVisibility(View.GONE);
        }
        if (holder.af_notify.length() == 0) {
            holder.notif_linear.setVisibility(View.GONE);
        }
        if (holder.af_selection.length() == 0) {
            holder.select_mode_linear.setVisibility(View.GONE);
        }

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val af_test_name = view.findViewById<TextView>(R.id.af_test_name)
        val af_purpose= view.findViewById<TextView>(R.id.af_purpose)
        val af_eligibility = view.findViewById<TextView>(R.id.af_eligibility)
        val af_app_mode = view.findViewById<TextView>(R.id.af_app_mode)
        val af_source = view.findViewById<TextView>(R.id.af_source)
        val af_conduct = view.findViewById<TextView>(R.id.af_conduct)
        val af_invited = view.findViewById<TextView>(R.id.af_invited)
        val af_notify = view.findViewById<TextView>(R.id.af_notify)
        val af_selection = view.findViewById<TextView>(R.id.af_selection)

        //linear layputs
        val testname_linear= view.findViewById<LinearLayout>(R.id.testname_linear)
        val purpose_linear= view.findViewById<LinearLayout>(R.id.purpose_linear)
        val eligib_linear= view.findViewById<LinearLayout>(R.id.eligib_linear)
        val app_mode_linear= view.findViewById<LinearLayout>(R.id.app_mode_linear)
        val source_linear= view.findViewById<LinearLayout>(R.id.source_linear)
        val conduct_linear=view.findViewById<LinearLayout>(R.id.conduct_linear)
        val app_invited_linear= view.findViewById<LinearLayout>(R.id.app_invited_linear)
        val notif_linear= view.findViewById<LinearLayout>(R.id.notif_linear)
        val select_mode_linear= view.findViewById<LinearLayout>(R.id.select_mode_linear)
    }
}
