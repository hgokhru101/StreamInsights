package com.example.educationapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import java.nio.charset.Charset
import java.nio.file.Files.size

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var gson = Gson()
        val jsonString = getJSONFromAssets(this)
        tvJsonString.text = jsonString

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

//        val Course_Type_Model = gson.fromJson(
//            getJSONFromAssets(this),
//            CourseTypeListClass::class.java
//        )

        //After Intermediate

//        val After_Intermedaite_Model = gson.fromJson(
//            getJSONFromAssets(this),
//            AfterIntermediateListClass::class.java
//        )

        //After Graduation

//        val After_Graduation_Model = gson.fromJson(
//            getJSONFromAssets(this),
//            AfterGraduationListClass::class.java
//        )

        //After Tenth

        val After_Tenth_Model = gson.fromJson(
            getJSONFromAssets(this),
            AfterTenListClass::class.java
        )
        Log.d("Main Activity","Size:")
    }


    private fun getJSONFromAssets(context: Context): String? {
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
