package com.example.educationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import java.io.IOException

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [exams_after_intermediate_law.newInstance] factory method to
 * create an instance of this fragment.
 */
class exams_after_intermediate_law : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val gson = Gson()
        val main = MainActivity()
        val jsonString = main.getJSONFromAssets(activity!!,"ExamsAfterIntermediate.json")
        val exam_after_Intermediate_Model = gson.fromJson(
            jsonString,
            ExamAfterIntermediateListClass::class.java
        )
        val view=inflater.inflate(R.layout.fragment_exams_after_intermediate_law, container, false)
        val entrance_list:ArrayList<ExamAfterIntermediateExamClass> =ArrayList<ExamAfterIntermediateExamClass>()
        val recyler_view_exams=view.findViewById<RecyclerView>(R.id.recycler_view_exams)

        try{
//            var i:Int=0
            for(i in 0 until exam_after_Intermediate_Model.data[0].streams[3].entrance_exams.size) {
                entrance_list.add(exam_after_Intermediate_Model.data[0].streams[3].entrance_exams[i])
            }
        }catch (ex: IOException){
            ex.printStackTrace()
        }
        recyler_view_exams.adapter=exam_after_intermediate_adapter(activity!!,entrance_list)
        recyler_view_exams.layoutManager = LinearLayoutManager(context)
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment exams_after_intermediate_law.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            exams_after_intermediate_law().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
