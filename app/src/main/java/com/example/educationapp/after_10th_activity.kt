package com.example.educationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.gson.Gson

class after_10th_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after10th)

        val actionBar=supportActionBar

        if (actionBar!=null){
            actionBar.title="After 10th" //title for actionbar
        }
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        val pageadapter_10th: PageAdapter10th

        var gson = Gson()
        val main = MainActivity()

        val jsonString = main.getJSONFromAssets(this,"After10th.json")
        val after_10th_Model = gson.fromJson(
            jsonString,
            AfterTenListClass::class.java
        )

        val tablayout_10th=findViewById<TabLayout>(R.id.tablayout_10th)
        val viewpager_10th=findViewById<ViewPager>(R.id.viewpager_10th)

        pageadapter_10th= PageAdapter10th(supportFragmentManager,tablayout_10th.tabCount)
//        viewpager_10th.adapter=pageadapter_10th
        viewpager_10th.adapter=pageadapter_10th

        tablayout_10th.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewpager_10th.setCurrentItem(tab!!.position)

                if (tab.position==0 || tab.position==1 ||tab.position==2 || tab.position==3 ||tab.position==4 ||tab.position==5)
                {
                    pageadapter_10th.notifyDataSetChanged()
                }
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

        viewpager_10th.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tablayout_10th)) //will listen for scroll or page change

    }
}