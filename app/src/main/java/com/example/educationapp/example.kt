package com.example.educationapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

internal class Example : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button1 -> Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show()
            R.id.button2 -> Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show()
            R.id.button3 -> Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show()
            R.id.button4 -> Toast.makeText(this, "Button 4 clicked", Toast.LENGTH_SHORT).show()
            R.id.button5 -> Toast.makeText(this, "Button 5 clicked", Toast.LENGTH_SHORT).show()
        }
    }
}