package com.example.educationapp
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import android.widget.Toast
//import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView.ViewHolder
//import java.util.*
//class CustomAdapter(
//    private var context: Context,
//    private var TitleName: ArrayList<String>,
//    private var Exams: ArrayList<String>,
//    private var TestName: ArrayList<String>
//) :
//    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        val v = LayoutInflater.from(parent.context).inflate(R.layout.rawlayout, parent, false)
//        return MyViewHolder(v)
//    }
//
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        // set the data in items
//        holder.name.text = TitleName[position]
//        holder.email.text = Exams[position]
//        holder.mobileNo.text = TestName[position]
//        // implement setOnClickListener event on item view.
//        holder.itemView.setOnClickListener { // display a toast with person name on item click
//            Toast.makeText(context, TitleName[position], Toast.LENGTH_SHORT).show()
//        }
//    }

//       override fun getItemCount(): Int {
//        return TitleName.size
//    }
//    class MyViewHolder(itemView: View) : ViewHolder(itemView) {
//        var name: TextView = itemView.findViewById<View>(R.id.title_name) as TextView
//        var email: TextView = itemView.findViewById<View>(R.id.email) as TextView
//        var mobileNo: TextView = itemView.findViewById<View>(R.id.mobileNo) as TextView
//    }
//    }
//}