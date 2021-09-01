package com.example.educationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class after_10th_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after10th)

        val actionBar=supportActionBar

        if (actionBar!=null){
            actionBar.title="After 10th" //title for actionbar
        }
        actionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}