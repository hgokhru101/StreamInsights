package com.example.educationapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.educationapp.AfterIntFragment1

class PageAdapter(fm: FragmentManager, var tabcount: Int) : FragmentPagerAdapter(fm, tabcount) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return AfterIntFragment1()
            1 -> return BlankFragment()
        }
        return AfterIntFragment1()
    }

    override fun getCount(): Int {
        return tabcount
    }
}