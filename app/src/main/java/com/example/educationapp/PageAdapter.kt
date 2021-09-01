package com.example.educationapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm: FragmentManager, var tabcount: Int) : FragmentPagerAdapter(fm, tabcount) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return after_intermediate_engg()
            1 -> return after_intermediate_medical()
            2 -> return after_intermediate_degree()
            3 -> return after_intermediate_nda()
            4 -> return after_intermediate_teach()
            5 -> return after_intermediate_diploma()
        }
        return after_intermediate_engg()
    }
    override fun getCount(): Int {
        return tabcount
    }
}


class Exams_AfterInt_PageAdapter(fm: FragmentManager, var tabcount: Int) : FragmentPagerAdapter(fm, tabcount) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return exams_after_intermediate_engg()
            1 -> return exams_after_intermediate_medical()
            2 -> return exams_after_intermediate_nda()
            3 -> return exams_after_intermediate_law()
            4 -> return exams_after_intermediate_management()
            5 -> return exams_after_intermediate_fashion()
        }
        return after_intermediate_engg()
    }
    override fun getCount(): Int {
        return tabcount
    }
}