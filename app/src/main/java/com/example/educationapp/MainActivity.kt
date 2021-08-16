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
        val talentModel = gson.fromJson(
            jsonString,
            TalentTestListClass::class.java
        )
        val AfterTenModel = gson.fromJson(
            getJSONFromAssets1(this),
            AfterTenListClass::class.java
        )
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
