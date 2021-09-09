package com.example.educationapp

//import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
//import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout
//import com.google.gson.Gson
//import kotlinx.android.synthetic.main.activity_after_intermediate.*
//import java.io.IOException

class after_intermediate_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_intermediate)


        val pageadapter: PageAdapter //pageadapter variable

        val actionBar=supportActionBar

        if (actionBar!=null){
            actionBar.title="After Intermediate" //title for actionbar
        }
        actionBar!!.setDisplayHomeAsUpEnabled(true) //back to main activity enabled

//        var gson = Gson()
//        val main = MainActivity()
//
//        val jsonString = main.getJSONFromAssets(this,"AfterIntermediate.json")
//        val after_Intermediate_Model = gson.fromJson(
//            jsonString,
//            AfterIntermediateListClass::class.java
//        )
//        val data = after_Intermediate_Model.data[0].streams

//        b1.setOnClickListener()
        val tabLayout=findViewById<TabLayout>(R.id.tablayout)

        val viewpager=findViewById<ViewPager>(R.id.viewpager)

        pageadapter= PageAdapter(supportFragmentManager,tabLayout.tabCount) //sent tablayout to fragment manager
        viewpager.adapter=pageadapter //set adapter for viewpager

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewpager.setCurrentItem(tab!!.position)

                if (tab.position==0 || tab.position==1 ||tab.position==2 || tab.position==3 ||tab.position==4 ||tab.position==5)
                {
                    pageadapter.notifyDataSetChanged() //notify viewpager of state/fragment change
                }
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

        viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout)) //will listen for scroll or page change

    }
}