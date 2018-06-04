package com.kit.kirirom.materialtabs.activity.adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.kit.kirirom.materialtabs.activity.fragments.PageFragment
import com.kit.kirirom.materialtabs.activity.models.Flow

class CustomFragmentPageAdapter(fm: FragmentManager, context: Context): FragmentPagerAdapter(fm) {

//    private val tabTitles = arrayOf("Morning Preparation", "Night Preparation", "Standby", "While Activity", "After Activity", "Tab6", "Tab7")
    private val tabTitles: ArrayList<Flow> = arrayListOf()
    private var context: Context? = null

    init {
        this.context = context
        tabTitles.add(Flow("1000", "Morning Preparation"))
        tabTitles.add(Flow("1001", "Night Preparation"))
        tabTitles.add(Flow("1002", "Standby"))
        tabTitles.add(Flow("1003", "While Activity"))
        tabTitles.add(Flow("1004", "After Activity"))
    }

    override fun getCount(): Int {
        return tabTitles.count()
    }

    override fun getItem(position: Int): Fragment {
        return PageFragment.newInstance(tabTitles[position].id)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position].name
    }

}