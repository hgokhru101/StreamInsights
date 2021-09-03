package com.example.educationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import android.widget.TextView
import com.google.gson.Gson
import java.io.IOException

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [after_10th_iiit.newInstance] factory method to
 * create an instance of this fragment.
 */
class after_10th_iiit : Fragment() {
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
        // Inflate the layout for this fragment
        val gson = Gson()
        val main = MainActivity()
        val jsonString = main.getJSONFromAssets(activity!!,"After10th.json")
        val after_10th_Model = gson.fromJson(
            jsonString,
            AfterTenListClass::class.java
        )
        // Inflate the layout for this fragment

        val view= inflater.inflate(R.layout.fragment_after_10th_iiit, container, false)
        val course_name:ArrayList<String> =ArrayList<String>()
        val course_map:HashMap<String,ArrayList<String>> = HashMap()

        try{
            var i:Int=0
            for(i in 0 until after_10th_Model.data[0].streams[2].course.size) {
                course_name.add(after_10th_Model.data[0].streams[2].course[i].name)
                val sub_course:ArrayList<String> = after_10th_Model.data[0].streams[2].course[i].sub_course
                course_map[course_name[i]]=sub_course
            }
        }catch (ex: IOException){
            ex.printStackTrace()
        }

        val text_int=view.findViewById<TextView>(R.id.text_after10th)
        text_int.text=after_10th_Model.data[0].streams[2].duration


        listadapter= Course_Type_Adapter(activity!!,course_name,course_map)

        view.findViewById<ExpandableListView>(R.id.elist_10th_iiit).setAdapter(listadapter)

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment after_10th_iiit.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            after_10th_iiit().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}