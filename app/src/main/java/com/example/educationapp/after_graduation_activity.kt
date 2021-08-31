package com.example.educationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_after_graduation_activity.*
import java.io.IOException

class after_graduation_activity : AppCompatActivity() {

    private lateinit var listviewadapter:after_graduation_adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_graduation_activity)
        val actionBar=supportActionBar

        if (actionBar!=null){
            actionBar.title="After Graduation" //title for actionbar
        }
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        val main = MainActivity()
        val jsonString = main.getJSONFromAssets(this,"AfterGraduation.json")
        val gson = Gson()
        val After_Graduation_Model = gson.fromJson(
            jsonString,
            AfterGraduationListClass::class.java
        )
        val student_type:ArrayList<String> = ArrayList<String>()
        val stud_fut_opt_map:HashMap<String,ArrayList<String>> = HashMap()
        try{
            var i:Int=0
            for(i in 0 until After_Graduation_Model.data[0].streams.size) {
                student_type.add(After_Graduation_Model.data[0].streams[i].student_type)
                val future_options:ArrayList<String> = After_Graduation_Model.data[0].streams[i].future_options
                stud_fut_opt_map[student_type[i]] = future_options
            }
        }catch (ex: IOException){
            ex.printStackTrace()
        }
        listviewadapter= after_graduation_adapter(this,student_type,stud_fut_opt_map)
        elistView_graduation.setAdapter(listviewadapter)
    }
}
