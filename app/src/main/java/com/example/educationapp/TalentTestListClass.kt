package com.example.educationapp

import com.google.gson.annotations.SerializedName

class TalentTestListClass {
    @SerializedName("exams")
    var exams: ArrayList<TalentTestClass> = ArrayList()
}

class AfterTenListClass{
    @SerializedName("streams")
    var streams : ArrayList<Afterten> = ArrayList()
}

class AfterTenCourseListClass {
    @SerializedName("course")
    var course : ArrayList<Aftertencourse> = ArrayList()
}