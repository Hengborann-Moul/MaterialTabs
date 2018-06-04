package com.kit.kirirom.materialtabs.activity

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kit.kirirom.materialtabs.R
import com.kit.kirirom.materialtabs.activity.adapter.CustomFragmentPageAdapter
import com.kit.kirirom.materialtabs.activity.fragments.PageFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PageFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        viewpager.adapter = CustomFragmentPageAdapter(supportFragmentManager, this@MainActivity)

        // Give the TabLayout the ViewPager
        sliding_tabs.setupWithViewPager(viewpager)
    }

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
