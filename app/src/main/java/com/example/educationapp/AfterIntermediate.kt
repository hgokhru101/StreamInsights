package com.example.educationapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import java.io.IOException

class AfterIntermediate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_intermediate)

        val actionBar=supportActionBar

        if (actionBar!=null){
            actionBar.title="After Intermediate" //title for actionbar
        }
        actionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    //ExamAfterIntermediateListClass
    var gson = Gson()
    val Course_Type_Model = gson.fromJson(
        getJSONFromAssets(this),
        AfterIntermediateListClass::class.java
    )



    private fun getJSONFromAssets(context: Context): String? {
        var json: String? = null
        try {
            val myUsersJSONFile = assets.open("AfterIntermediate.json")
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