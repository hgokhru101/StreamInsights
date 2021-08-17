package com.example.educationapp

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

//Talent Test page Starts
class TalentTestListClass {
    @SerializedName("data")
    val data: ArrayList<TalentTestClass> = ArrayList()
}
class TalentTestClass {
    @SerializedName("title")
    val title: String = ""
    @SerializedName("exams")
    val exams: ArrayList<TalentExamClass> = ArrayList()
}
class TalentExamClass {
    @SerializedName("test_name")
    val test_name: String = ""
    @SerializedName("eligibility")
    val eligibility: String = ""
    @SerializedName("syllabus")
    val syllabus: String = ""
    @SerializedName("website")
    val website: String = ""
}
// Talent Test page ends

//Course Type Page Starts
class CourseTypeListClass{
    @SerializedName("data")
    val data : ArrayList<CourseTypeClass> = ArrayList()
}
class CourseTypeClass{
    @SerializedName("title")
    val title : String = ""
    @SerializedName("courses")
    val courses : ArrayList<CourseTypeCourseClass> = ArrayList()
}
class CourseTypeCourseClass{
    @SerializedName("name")
    val name : String = ""
    @SerializedName("course_name")
    val course_name : ArrayList<String> = ArrayList()
}
//Course Type page end

//Exam After Intermediate Page Starts
class ExamAfterIntermediateListClass{
    @SerializedName("data")
    val data : ArrayList<ExamAfterIntermediateClass> = ArrayList()
}
class ExamAfterIntermediateClass {
    @SerializedName("title")
    val title:String = ""
    @SerializedName("streams")
    val streams:ArrayList<ExamAfterIntermediateStreamClass> = ArrayList()
}
class ExamAfterIntermediateStreamClass{
    @SerializedName("Name")
    val Name:String = ""
    @SerializedName("entrance_exams")
    val entrance_exams : ArrayList<ExamAfterIntermediateExamClass> = ArrayList()
}
class ExamAfterIntermediateExamClass{
    @SerializedName("test_name")
    val test_name : String = ""
    @SerializedName("Purpose")
    val Purpose : String = ""
    @SerializedName("Eligibility")
    val Eligibility : String = ""
    @SerializedName("Application_mode")
    val Application_mode : String = ""
    @SerializedName("Source")
    val Source : String = ""
    @SerializedName("Conducted_By")
    val Conducted_By : String = ""
    @SerializedName("Application_Invited_For")
    val Application_Invited_For : String = ""
    @SerializedName("Notification_Month")
    val Notification_Month : String = ""
    @SerializedName("Mode_of_Selection")
    val Mode_of_Selection : String = ""
}
//After Intermediate Page Ends

//After Intermediate Starts
class AfterIntermediateListClass{
    @SerializedName("data")
    val data : ArrayList<AfterIntermediateClass> = ArrayList()
}
class AfterIntermediateClass{
    @SerializedName("title")
    val title : String = ""
    @SerializedName("streams")
    val streams : ArrayList<AfterIntermediateStreamClass> = ArrayList()
}
class AfterIntermediateStreamClass{
    @SerializedName("name")
    val name : String = ""
    @SerializedName("duration")
    val duration : String = ""
    @SerializedName("eligible")
    val eligible : String = ""
    @SerializedName("course")
    val course : ArrayList<AfterIntermediateCourseClass> = ArrayList()
}
class AfterIntermediateCourseClass{
    @SerializedName("degree_name")
    val degree_name : String = ""
    @SerializedName("course_duration")
    val course_duration : String = ""
    @SerializedName("type")
    val type : String = ""
    @SerializedName("sub_course")
    val sub_course : ArrayList<String> = ArrayList()
}
//After Intermediate Ends

//After Graduation
class AfterGraduationListClass{
    @SerializedName("data")
    val data : ArrayList<AfterGraduationClass> = ArrayList()
}
class AfterGraduationClass{
    @SerializedName("title")
    val title : String = ""
    @SerializedName("streams")
    val streams: ArrayList<AfterGraduationStreamClass> = ArrayList()
}
class AfterGraduationStreamClass{
    @SerializedName("student_type")
    val student_type :String = ""
    @SerializedName("future_options")
    val future_options : ArrayList<String> = ArrayList()
}
//After Graduation Ends

//After Tenth Starts
class AfterTenListClass{
    @SerializedName("data")
    val data : ArrayList<AfterTenClass> = ArrayList()
}
class AfterTenClass{
    @SerializedName("title")
    val title : String = ""
    @SerializedName("streams")
    val streams : ArrayList<AfterTenStreamClass> = ArrayList()
}
class AfterTenStreamClass{
    @SerializedName("name")
    var name :String = ""
    @SerializedName("duration")
    var duration :String = ""
    @SerializedName("course")
    val course : ArrayList<AfterTenCourseClass> = ArrayList()
}
class AfterTenCourseClass{
    @SerializedName("name")
    var name : String = ""
    @SerializedName("sub_course")
    var sub_course : ArrayList<String> = ArrayList()
}
//After Tenth Ends