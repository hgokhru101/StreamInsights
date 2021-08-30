package com.example.educationapp

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import android.widget.TextView
import com.google.gson.Gson
import java.io.IOException

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class after_intermediate_engg : Fragment() {

    private var param1: String? = null
    private var param2: String? = null
    private lateinit var listadapter:Course_Type_Adapter

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val gson = Gson()
        val main = MainActivity()
        val jsonString = main.getJSONFromAssets(activity!!,"AfterIntermediate.json")
        val after_Intermediate_Model = gson.fromJson(
            jsonString,
            AfterIntermediateListClass::class.java
        )

        val view=inflater.inflate(R.layout.fragment_after_intermediate_engg, container, false)
        val degree_name:ArrayList<String> =ArrayList<String>()
        val deg_cour_map:HashMap<String,ArrayList<String>> = HashMap()

        try{
            var i:Int=0
            for(i in 0 until after_Intermediate_Model.data[0].streams[0].course.size) {
                degree_name.add(after_Intermediate_Model.data[0].streams[0].course[i].degree_name)
                val sub_course:ArrayList<String> = after_Intermediate_Model.data[0].streams[0].course[i].sub_course
                deg_cour_map[degree_name[i]]=sub_course
            }
        }catch (ex: IOException){
            ex.printStackTrace()
        }

        listadapter= Course_Type_Adapter(activity!!,degree_name,deg_cour_map)

//        view.findViewById<TextView>(R.id.duration).text="Duration: "+after_Intermediate_Model.data[0].streams[0].duration
        view.findViewById<TextView>(R.id.eligibility).text="Eligibility: "+after_Intermediate_Model.data[0].streams[0].eligible
        view.findViewById<ExpandableListView>(R.id.elist_Int_Engg).setAdapter(listadapter)
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            after_intermediate_engg().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}