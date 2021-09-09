package com.example.educationapp

//import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.util.Log
//import android.widget.Toast
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_course_type.*
import java.io.IOException

class Course_type_activity : AppCompatActivity() {

    private lateinit var listviewadapter:Course_Type_Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_type)

        val actionBar=supportActionBar

        if (actionBar!=null){
            actionBar.title="Course Types" //title for actionbar
        }
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        val main = MainActivity()
        val jsonString = main.getJSONFromAssets(this,"CourseTypes.json")
        val gson = Gson()
        val course_Type_Model = gson.fromJson(
            jsonString,
            CourseTypeListClass::class.java
        )
        val firstlist:ArrayList<String> = ArrayList<String>()
        val topiclist:HashMap<String,ArrayList<String>> = HashMap()
        try{
//            var i:Int=0
            for(i in 0 until course_Type_Model.data[0].courses.size) {
                firstlist.add(course_Type_Model.data[0].courses[i].name)
                val slist:ArrayList<String> = course_Type_Model.data[0].courses[i].course_name
                topiclist[firstlist[i]]=slist
            }
        }catch (ex: IOException){
            ex.printStackTrace()
        }
        listviewadapter= Course_Type_Adapter(this,firstlist,topiclist)
        elistView.setAdapter(listviewadapter)


//        Toast.makeText(this,"Welcome!!", Toast.LENGTH_SHORT).show()
//        Log.d("Main Activity","Size:")
    }

}