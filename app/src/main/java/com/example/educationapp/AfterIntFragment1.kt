package com.example.educationapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import android.widget.TextView
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_after_int1.*
import java.io.IOException

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AfterIntFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class AfterIntFragment1 : Fragment() {
    // TODO: Rename and change types of parameters
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
//        var gson = Gson()
//        val main = MainActivity()
//
//        val jsonString = main.getJSONFromAssets("AfterIntermediate","AfterIntermediate.json")
//        val after_Intermediate_Model = gson.fromJson(
//            jsonString,
//            AfterIntermediateListClass::class.java
//        )

//        var l1:ArrayList<String> =ArrayList<String>()
//        var l2:ArrayList<String> = ArrayList<String>()
//        var l2_1:ArrayList<String> = ArrayList<String>()
//        var l2_2:ArrayList<String> = ArrayList<String>()
//        var l3:HashMap<String,ArrayList<String>> =HashMap()
//        l1.add("Animals")
//        l1.add("Birds")
//        l1.add("fishes")
//        l2.add("Dog")
//        l2.add("cat")
//        l2.add("tiger")
//        l2_1.add("peacock")
//        l2_1.add("Ostrich")
//        l2_1.add("pegion")
//        l3[l1[0]]=l2
//        l3[l1[1]]=l2_1
//        l2_2.add("Bombayduck")
//        l2_2.add("prompet")
//        l3[l1[2]]=l2_2
//        val afInt=AfterIntermediate()
//        listadapter= Course_Type_Adapter(this as AfterIntermediate,l1,l3)
//        elistFrag1.setAdapter(listadapter)


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var gson = Gson()
        val main = MainActivity()
        val jsonString = main.getJSONFromAssets(activity!!,"AfterIntermediate.json")
        val after_Intermediate_Model = gson.fromJson(
            jsonString,
            AfterIntermediateListClass::class.java
        )

        val view=inflater.inflate(R.layout.fragment_after_int1, container, false)



        var Flist:ArrayList<String> =ArrayList<String>()
        var Slist:ArrayList<String> = ArrayList<String>()
        var Tlist:HashMap<String,ArrayList<String>> = HashMap()



        try{
            var i:Int=0
            for(i in 0 until after_Intermediate_Model.data[0].streams[0].course.size) {
                Flist.add(after_Intermediate_Model.data[0].streams[0].course[i].degree_name)
                var Slist:ArrayList<String> = after_Intermediate_Model.data[0].streams[0].course[i].sub_course
                Tlist[Flist[i]]=Slist
            }


        }catch (ex: IOException){
            ex.printStackTrace()
        }

        listadapter= Course_Type_Adapter(activity!!,Flist,Tlist)

        view.findViewById<TextView>(R.id.text1_frag1).text="Duration: "+after_Intermediate_Model.data[0].streams[0].duration
        view.findViewById<TextView>(R.id.text2_frag1).text="Eligibility: "+after_Intermediate_Model.data[0].streams[0].eligible

        view.findViewById<ExpandableListView>(R.id.elistFrag1).setAdapter(listadapter)

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AfterIntFragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AfterIntFragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}