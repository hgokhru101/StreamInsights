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
        var gson = Gson()
        val main = MainActivity()

        val jsonString = main.getJSONFromAssets(this,"AfterIntermediate.json")
        val after_Intermediate_Model = gson.fromJson(
            jsonString,
            AfterIntermediateListClass::class.java
        )

        val data = after_Intermediate_Model.data[0].streams

    }

}