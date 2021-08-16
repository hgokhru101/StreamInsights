package com.example.educationapp

import com.google.gson.annotations.SerializedName

class TalentTestListClass {
    @SerializedName("exams")
    var exams: ArrayList<TalentTestClass> = ArrayList()
}