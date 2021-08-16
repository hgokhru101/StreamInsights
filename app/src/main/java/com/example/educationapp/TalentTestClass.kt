package com.example.educationapp

import com.google.gson.annotations.SerializedName

//class TalentTestClass (
//    val test_name : String,
//    val eligibility : String,
//    val syllabus : String,
//    val website : String
//)
class TalentTestClass{
  @SerializedName("test_name")
  var test_name:String = ""
    @SerializedName("eligibility")
    var eligibility:String = ""
    @SerializedName("syllabus")
    var syllabus:String = ""
    @SerializedName("website")
    var webiste:String = ""
}

class Afterten{
    @SerializedName("name")
    var name :String = ""
    @SerializedName("duration")
    var duration :String = ""
}
class Aftertencourse{
    @SerializedName("name")
    var name : String = ""
    @SerializedName("sub_course")
    var sub_course : ArrayList<String> = ArrayList()
}