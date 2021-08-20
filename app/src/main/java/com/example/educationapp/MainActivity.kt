package com.example.educationapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.nio.charset.Charset
import java.nio.file.Files.size
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.rawlayout.*

class MainActivity : AppCompatActivity() {
    //RecyclerView recyclerview;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val linearLayoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = linearLayoutManager

        var TitleName= ArrayList<String>()
        var Exams= ArrayList<String>()
        var titlename= ArrayList<String>()
        var test_name= ArrayList<String>()
        var eligibility= ArrayList<String>()
        var syllabus= ArrayList<String>()
        var website_link= ArrayList<String>()
        var gson = Gson()
        val jsonString = getJSONFromAssets(this)
        val talentModel = gson.fromJson(
            jsonString,
            TalentTestListClass::class.java
        )
        try {

            var i: Int = 0;
            val obj = JSONObject(getJSONFromAssets(this))
            val userArray = obj.getJSONArray("data")
            for (i in  0 until userArray.length()){
                //creating json object for fetching data
                val userDetail = userArray.getJSONObject(i)
                // fetching title and exams
//                titleName.add(userdetail.getString())
              //  var examtitle=userDetail.getJSONObject("title")

                TitleName.add(userDetail.getString("title"))
             //   Exams.add(userDetail.getString("exams"))
                //val detail=userDetail.getJSONObject("exams")
                val examarray=userDetail.getJSONArray("exams")
                var j=0
               for(j in 0 until examarray.length()){
                   val examDetail = examarray.getJSONObject(j)
                   test_name.add(examDetail.getString("test_name"))
                   eligibility.add(examDetail.getString("eligibility"))
                   syllabus.add(examDetail.getString("syllabus"))
                   website_link.add(examDetail.getString("website"))
               }

            }

           // tvJsonString.text = jsonString

            val AfterTenModel = gson.fromJson(
                getJSONFromAssets1(this),
                AfterTenListClass::class.java
            )
        }catch (ex: IOException){
            ex.printStackTrace()
        }
        val customAdapter = CustomAdapter(this@MainActivity, test_name, eligibility, website_link)
        recyclerView.adapter = customAdapter

        Log.d("Main Activity","Size:")
    }


    private fun getJSONFromAssets(context: Context): String? {
        var json: String? = null
        try {
            val myUsersJSONFile = assets.open("talent_test.json")
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
    private fun getJSONFromAssets1(context: Context): String? {
        var json: String? = null
        try {
            val myUsersJSONFile = assets.open("After10th.json")
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
