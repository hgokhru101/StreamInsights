package com.example.educationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
//import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout
import com.google.gson.Gson

class exams_after_intermediate_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exams_after_intermediate)

        val pageadapter: Exams_AfterInt_PageAdapter

        val actionBar=supportActionBar

        if (actionBar!=null){
            actionBar.title="Exams After Intermediate" //title for actionbar
        }
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        var gson = Gson()
        val main = MainActivity()

        val jsonString = main.getJSONFromAssets(this,"ExamsAfterIntermediate.json")
        val exam_after_Intermediate_Model = gson.fromJson(
            jsonString,
            AfterIntermediateListClass::class.java
        )
        val data = exam_after_Intermediate_Model.data[0].streams

//        b1.setOnClickListener()
//        val tab_1=findViewById<TabItem>(R.id.tab_1)
//        val tab_2=findViewById<TabItem>(R.id.tab_2)
        val tabLayout=findViewById<TabLayout>(R.id.tablayout2)

        val viewpager=findViewById<ViewPager>(R.id.viewpager2)

        pageadapter= Exams_AfterInt_PageAdapter(supportFragmentManager,tabLayout.tabCount)
        viewpager.adapter=pageadapter

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewpager.setCurrentItem(tab!!.position)

                if (tab.position==0 || tab.position==1 ||tab.position==2 || tab.position==3 ||tab.position==4)
                {
                    pageadapter.notifyDataSetChanged()
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
