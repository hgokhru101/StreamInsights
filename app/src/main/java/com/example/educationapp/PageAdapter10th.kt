package com.example.educationapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter10th(fm: FragmentManager, var tabcount: Int) : FragmentPagerAdapter(fm, tabcount) {
    override fun getItem(position: Int): Fragment {
        when (position) {
//            0 -> return after_intermediate_engg()
//            1 -> return after_intermediate_medical()
//            2 -> return after_intermediate_degree()
//            3 -> return after_intermediate_nda()
//            4 -> return after_intermediate_teach()
//            5 -> return after_intermediate_diploma()
            0 -> return after_10th_intermediate()
            1 -> return after_10th_polytechnic()
        }
        return after_10th_intermediate()
    }
    override fun getCount(): Int {
        return tabcount
    }
}