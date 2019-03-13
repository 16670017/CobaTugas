package kiki.com.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ogaclejapan.smarttablayout.SmartTabLayout
import android.support.v4.view.ViewPager
import android.view.View
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = FragmentPagerItemAdapter(
                supportFragmentManager, FragmentPagerItems.with(this)
                .add("First", FirstFragment::class.java)
                .add("Second", ScondFragment::class.java)
                .add("Third", ThirdFragment::class.java)
                .add("Four", FourFragment::class.java)
                .create())

        val viewPager = findViewById<View>(R.id.viewpager) as ViewPager
        viewPager.adapter = adapter

        val viewPagerTab = findViewById<View>(R.id.viewpagertab) as SmartTabLayout
        viewPagerTab.setViewPager(viewPager)
    }
}
