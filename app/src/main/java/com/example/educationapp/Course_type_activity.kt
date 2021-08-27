package com.example.educationapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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
        var gson = Gson()
        val Course_Type_Model = gson.fromJson(
            jsonString,
            CourseTypeListClass::class.java
        )
        var Firstlist:ArrayList<String> = ArrayList<String>()
        var Topiclist:HashMap<String,ArrayList<String>> = HashMap()
        try{
            var i:Int=0
            for(i in 0 until Course_Type_Model.data[0].courses.size) {
                var Slist:ArrayList<String>
                Firstlist.add(Course_Type_Model.data[0].courses[i].name)
                Slist=Course_Type_Model.data[0].courses[i].course_name
                Topiclist[Firstlist[i]]=Slist
            }


        }catch (ex: IOException){
            ex.printStackTrace()
        }
        listviewadapter= Course_Type_Adapter(this,Firstlist,Topiclist)
        elistView.setAdapter(listviewadapter)


//        Toast.makeText(this,"Welcome!!", Toast.LENGTH_SHORT).show()
//        Log.d("Main Activity","Size:")
    }

//    private fun getJSONFromAssets(context: Context): String? {
//        var json: String? = null
//        try {
//            val myUsersJSONFile = assets.open("CourseTypes.json")
//            val size = myUsersJSONFile.available()
//            val buffer = ByteArray(size)
//            myUsersJSONFile.read(buffer)
//            myUsersJSONFile.close()
//            json = String(buffer)
//        } catch (ex: IOException) {
//            ex.printStackTrace()
//            return null
//        }
//        return json
//    }
}