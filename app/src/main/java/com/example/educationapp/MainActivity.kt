package com.example.educationapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.Toast
import com.google.gson.Gson
import java.io.IOException
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.first_page.*

class MainActivity : AppCompatActivity() {
    //RecyclerView recyclerview;
//    private lateinit var listviewadapter:Course_Type_Adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_page)

       val actionBar=supportActionBar
        if(actionBar!=null){
            actionBar.title="What Next?"
        }

        button1.setOnClickListener {
            val intent = Intent(this, Course_type_activity::class.java)
            // start your next activity
            startActivity(intent)
        }

        button2.setOnClickListener{
            val intent2 =Intent(this,AfterIntermediate::class.java)
            startActivity(intent2)
        }
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)

//        button1.setOnClickListener(this)
//        button2.setOnClickListener(this)
//        button3.setOnClickListener(this)
//        button4.setOnClickListener(this)
//        button5.setOnClickListener(this)

        Toast.makeText(this,"Welcome!!",Toast.LENGTH_SHORT).show()
        Log.d("Main Activity","Size:")
    }

//    override fun onClick(v: View) {
//        button1.setOnClickListener(this)
//        when (v.id) {
//            R.id.button1 -> Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show()
//            R.id.button2 -> Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show()
//            R.id.button3 -> Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show()
//            R.id.button4 -> Toast.makeText(this, "Button 4 clicked", Toast.LENGTH_SHORT).show()
//            R.id.button5 -> Toast.makeText(this, "Button 5 clicked", Toast.LENGTH_SHORT).show()
//        }
//    }

//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//        var TitleName= ArrayList<String>()
//        var Exams= ArrayList<String>()
//        var titlename= ArrayList<String>()
//        var test_name= ArrayList<String>()
//        var eligibility= ArrayList<String>()
//        var syllabus= ArrayList<String>()
//        var website_link= ArrayList<String>()

//        val jsonString = getJSONFromAssets(this)
        //Talent Test Page

//        val talent_Test_Model = gson.fromJson(
//            jsonString,
//            TalentTestListClass::class.java
//        )
        //Exams After Intermediate

//        val exam_after_intermediate_model = gson.fromJson(
//            jsonString,
//            ExamAfterIntermediateListClass::class.java
//        )

        //Course Type

//        var gson = Gson()
//        val Course_Type_Model = gson.fromJson(
//            getJSONFromAssets(this),
//            CourseTypeListClass::class.java
//        )

        //After Intermediate
//        val After_Intermedaite_Model = gson.fromJson(
//            getJSONFromAssets(this,"AfterIntermediate.json"),
//            AfterIntermediateListClass::class.java)

        //After Graduation

//        val After_Graduation_Model = gson.fromJson(
//            getJSONFromAssets(this),
//            AfterGraduationListClass::class.java
//        )

        //After 10th

//        val After_Tenth_Model = gson.fromJson(
//            getJSONFromAssets(this),
//            AfterTenListClass::class.java
//        )

// Fetching Data using JSONObjects and JSONArray

//        try {
//            var i: Int = 0;
//            val obj = JSONObject(getJSONFromAssets(this))
//            val userArray = obj.getJSONArray("data")
//            for (i in  0 until userArray.length()){
//                //creating json object for fetching data
//                val userDetail = userArray.getJSONObject(i)
//                TitleName.add(userDetail.getString("title"))
//                val examarray=userDetail.getJSONArray("exams")
//                var j=0
//               for(j in 0 until examarray.length()){
//                   val examDetail = examarray.getJSONObject(j)
//                   test_name.add(examDetail.getString("test_name"))
//                   eligibility.add(examDetail.getString("eligibility"))
//                   syllabus.add(examDetail.getString("syllabus"))
//                   website_link.add(examDetail.getString("website"))
//               }
//
//            }
//        }catch (ex: IOException){
//            ex.printStackTrace()
//        }

//        recyclerView.adapter = Course_Type_Adapter(Course_Type_Model.data)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.setHasFixedSize(true)

//        var Firstlist:ArrayList<String> = ArrayList<String>()
//        var Topiclist:HashMap<String,ArrayList<String>> = HashMap()
//        try{
//            var i:Int=0
//            for(i in 0 until Course_Type_Model.data[0].courses.size) {
//                var Slist:ArrayList<String>
//                Firstlist.add(Course_Type_Model.data[0].courses[i].name)
//                Slist=Course_Type_Model.data[0].courses[i].course_name
//                Topiclist[Firstlist[i]]=Slist
//            }
//
//
//        }catch (ex:IOException){
//            ex.printStackTrace()
//        }
//        listviewadapter= Course_Type_Adapter(this,Firstlist,Topiclist)
//        elistView.setAdapter(listviewadapter)


//        Toast.makeText(this,"Welcome!!",Toast.LENGTH_SHORT).show()
//        Log.d("Main Activity","Size:")

//    private fun showList() {
//        var gson = Gson()
//        val Course_Type_Model = gson.fromJson(
//            getJSONFromAssets(this),
//            CourseTypeListClass::class.java
//        )
//        lateinit var Flist:ArrayList<String>
//        lateinit var Topiclist:HashMap<String,ArrayList<String>>
//        var i:Int=0
//        for(i in 0 until Course_Type_Model.data[0].courses.size) {
//            var Slist:ArrayList<String>
//            Flist.add(Course_Type_Model.data[0].courses[i].name)
////            var Flist=Course_Type_Model.data[0].courses[i].name
//            Slist=Course_Type_Model.data[0].courses[i].course_name
////                (Slist as ArrayList<>)
//            Topiclist[Flist[i]]=Slist
//    }
//
//    }


     public fun getJSONFromAssets(context: Context,filename:String): String? {
        var json: String? = null
        try {
            val myUsersJSONFile = context.assets.open(filename)
            val size = myUsersJSONFile.available()
            val buffer = ByteArray(size)
            myUsersJSONFile.read(buffer)
            myUsersJSONFile.close()
            json = String(buffer)
        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }
        return json
    }
}
