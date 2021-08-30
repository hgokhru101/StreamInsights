package com.example.educationapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_after_int1.*

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
        var gson = Gson()
        val main = MainActivity()

//        val jsonString = main.getJSONFromAssets(this,"AfterIntermediate.json")
//        val after_Intermediate_Model = gson.fromJson(
//            jsonString,
//            AfterIntermediateListClass::class.java
//        )

        var l1:ArrayList<String> =ArrayList<String>()
        var l2:ArrayList<String> = ArrayList<String>()
        var l2_1:ArrayList<String> = ArrayList<String>()
        var l2_2:ArrayList<String> = ArrayList<String>()
        var l3:HashMap<String,ArrayList<String>> =HashMap()
        l1.add("Animals")
        l1.add("Birds")
        l1.add("fishes")
        l2.add("Dog")
        l2.add("cat")
        l2.add("tiger")
        l2_1.add("peacock")
        l2_1.add("Ostrich")
        l2_1.add("pegion")
        l3[l1[0]]=l2
        l3[l1[1]]=l2_1
        l2_2.add("Bombayduck")
        l2_2.add("prompet")
        l3[l1[2]]=l2_2
        val afInt=AfterIntermediate()
//        listadapter= Course_Type_Adapter(activity!!,l1,l3)
//        elistFrag1.setAdapter(listadapter)


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_after_int1, container, false)
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