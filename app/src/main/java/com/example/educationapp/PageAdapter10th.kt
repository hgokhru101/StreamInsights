package com.example.educationapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter10th(fm: FragmentManager, var tabcount: Int) : FragmentPagerAdapter(fm, tabcount) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return after_10th_intermediate()
            1 -> return after_10th_polytechnic()
            2 -> return after_10th_iiit()
            3 -> return after_10th_iti()
            4 -> return after_10th_paramedical()
            5 -> return after_10th_short_term()
            6 -> return after_10th_others()
        }
        return after_10th_intermediate()
    }
    override fun getCount(): Int {
        return tabcount
    }
}