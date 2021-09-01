package com.example.educationapp

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

//Talent Test page Starts
class TalentTestListClass {
    @SerializedName("data")
    val data: ArrayList<TalentTestClass> = ArrayList()
    override fun toString(): String {
        return "TalentTestListClass(data=$data)"
    }
}
class TalentTestClass {
    @SerializedName("title")
    val title: String = ""
    @SerializedName("exams")
    val exams: ArrayList<TalentExamClass> = ArrayList()
    override fun toString(): String {
        return "TalentTestClass(title='$title', exams=$exams)"
    }
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
    override fun toString(): String {
        return "TalentExamClass(test_name='$test_name', eligibility='$eligibility', syllabus='$syllabus', website='$website')"
    }
}
// Talent Test page ends

//Course Type Page Starts
class CourseTypeListClass{
    @SerializedName("data")
    val data : ArrayList<CourseTypeClass> = ArrayList()
    override fun toString(): String {
        return "CourseTypeListClass(data=$data)"
    }
}
class CourseTypeClass{
    @SerializedName("title")
    val title : String = ""
    @SerializedName("courses")
    val courses : ArrayList<CourseTypeCourseClass> = ArrayList()
    override fun toString(): String {
        return "CourseTypeClass(title='$title', courses=$courses)"
    }
}
class CourseTypeCourseClass{
    @SerializedName("name")
    val name : String = ""
    @SerializedName("course_name")
    val course_name : ArrayList<String> = ArrayList()
    override fun toString(): String {
        return "CourseTypeCourseClass(name='$name', course_name=$course_name)"
    }
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
    override fun toString(): String {
        return "ExamAfterIntermediateClass(title='$title', streams=$streams)"
    }
}
class ExamAfterIntermediateStreamClass{
    @SerializedName("Name")
    val Name:String = ""
    @SerializedName("entrance_exams")
    val entrance_exams : ArrayList<ExamAfterIntermediateExamClass> = ArrayList()
    override fun toString(): String {
        return "ExamAfterIntermediateStreamClass(Name='$Name', entrance_exams=$entrance_exams)"
    }
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
    override fun toString(): String {
        return "ExamAfterIntermediateExamClass(test_name='$test_name', Purpose='$Purpose', Eligibility='$Eligibility', Application_mode='$Application_mode', Source='$Source', Conducted_By='$Conducted_By', Application_Invited_For='$Application_Invited_For', Notification_Month='$Notification_Month', Mode_of_Selection='$Mode_of_Selection')"
    }
}
//After Intermediate Page Ends

//After Intermediate Starts
class AfterIntermediateListClass{
    @SerializedName("data")
    val data : ArrayList<AfterIntermediateClass> = ArrayList()
    override fun toString(): String {
        return "AfterIntermediateListClass(data=$data)"
    }
}
class AfterIntermediateClass{
    @SerializedName("title")
    val title : String = ""
    @SerializedName("streams")
    val streams : ArrayList<AfterIntermediateStreamClass> = ArrayList()
    override fun toString(): String {
        return "AfterIntermediateClass(title='$title', streams=$streams)"
    }
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
    override fun toString(): String {
        return "AfterIntermediateStreamClass(name='$name', duration='$duration', eligible='$eligible', course=$course)"
    }
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
    override fun toString(): String {
        return "AfterIntermediateCourseClass(degree_name='$degree_name', course_duration='$course_duration', type='$type', sub_course=$sub_course)"
    }
}
//After Intermediate Ends

//After Graduation
class AfterGraduationListClass{
    @SerializedName("data")
    val data : ArrayList<AfterGraduationClass> = ArrayList()
    override fun toString(): String {
        return "AfterGraduationListClass(data=$data)"
    }
}
class AfterGraduationClass{
    @SerializedName("title")
    val title : String = ""
    @SerializedName("streams")
    val streams: ArrayList<AfterGraduationStreamClass> = ArrayList()
    override fun toString(): String {
        return "AfterGraduationClass(title='$title', streams=$streams)"
    }
}
class AfterGraduationStreamClass{
    @SerializedName("student_type")
    val student_type :String = ""
    @SerializedName("future_options")
    val future_options : ArrayList<String> = ArrayList()
    override fun toString(): String {
        return "AfterGraduationStreamClass(student_type='$student_type', future_options=$future_options)"
    }
}
//After Graduation Ends

//After Tenth Starts
class AfterTenListClass{
    @SerializedName("data")
    val data : ArrayList<AfterTenClass> = ArrayList()
    override fun toString(): String {
        return "AfterTenListClass(data=$data)"
    }
}
class AfterTenClass{
    @SerializedName("title")
    val title : String = ""
    @SerializedName("streams")
    val streams : ArrayList<AfterTenStreamClass> = ArrayList()
    override fun toString(): String {
        return "AfterTenClass(title='$title', streams=$streams)"
    }
}
class AfterTenStreamClass{
    @SerializedName("name")
    var name :String = ""
    @SerializedName("duration")
    var duration :String = ""
    @SerializedName("course")
    val course : ArrayList<AfterTenCourseClass> = ArrayList()
    override fun toString(): String {
        return "AfterTenStreamClass(name='$name', duration='$duration', course=$course)"
    }
}
class AfterTenCourseClass{
    @SerializedName("name")
    var name : String = ""
    @SerializedName("sub_course")
    var sub_course : ArrayList<String> = ArrayList()
    override fun toString(): String {
        return "AfterTenCourseClass(name='$name', sub_course=$sub_course)"
    }
}
//After Tenth Ends

class FirstPage {
    var title: String = ""
    var img_icon: Int = 0
}