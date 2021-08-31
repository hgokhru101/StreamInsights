package com.example.educationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_talent_test_activity.*
import talent_test_adapter
import java.io.IOException

class talent_test_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_talent_test_activity)
        val actionBar=supportActionBar

        if (actionBar!=null){
            actionBar.title="Talent Test" //title for actionbar
        }
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        try{
        val main = MainActivity()
        val jsonString = main.getJSONFromAssets(this,"talent_test.json")
        val gson = Gson()
        val talent_Test_Model = gson.fromJson(
            jsonString,
            TalentTestListClass::class.java
        )
        tt_List.layoutManager = LinearLayoutManager(this)
        // Adapter class is initialized and list is passed in the param.
        val itemAdapter = talent_test_adapter(this, talent_Test_Model.data[0].exams)
        // adapter instance is set to the recyclerview to inflate the items.
        tt_List.adapter = itemAdapter

        }catch (ex: IOException){
            ex.printStackTrace()
        }
    }
}
