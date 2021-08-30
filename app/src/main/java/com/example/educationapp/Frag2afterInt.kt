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
private lateinit var listadapter:Course_Type_Adapter

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
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
        val view= inflater.inflate(R.layout.frag_after_int2, container, false)

        var gson = Gson()
        val main = MainActivity()
        val jsonString = main.getJSONFromAssets(activity!!,"AfterIntermediate.json")
        val after_Intermediate_Model = gson.fromJson(
            jsonString,
            AfterIntermediateListClass::class.java
        )

        var F_list:ArrayList<String> =ArrayList<String>()
        var S_list:ArrayList<String> = ArrayList<String>()
        var T_list:HashMap<String,ArrayList<String>> = HashMap()

        try{
            var i:Int=0
            for(i in 0 until after_Intermediate_Model.data[0].streams[1].course.size) {
                F_list.add(after_Intermediate_Model.data[0].streams[1].course[i].degree_name)
                var S_list:ArrayList<String> = after_Intermediate_Model.data[0].streams[1].course[i].sub_course
                T_list[F_list[i]]=S_list
            }


        }catch (ex: IOException){
            ex.printStackTrace()
        }

        listadapter= Course_Type_Adapter(activity!!,F_list,T_list)

        view.findViewById<TextView>(R.id.text1_frag2).text="Duration: "+after_Intermediate_Model.data[0].streams[1].duration
        view.findViewById<TextView>(R.id.text2_frag2).text="Eligibility: "+after_Intermediate_Model.data[0].streams[1].eligible

        view.findViewById<ExpandableListView>(R.id.elistFrag2).setAdapter(listadapter)

        // Inflate the layout for this fragment
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}