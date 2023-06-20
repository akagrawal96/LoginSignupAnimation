package com.softtech.kotlincomplete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout

class LoginActivity : AppCompatActivity() {

    val tabLayout:TabLayout
    get() = findViewById(R.id.tab_layout)

    val viewPager: ViewPager
    get() = findViewById(R.id.view_pager)

    val fabSupport : FloatingActionButton
        get() = findViewById(R.id.fab_support)

    var v = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tabLayout.addTab(tabLayout.newTab().setText("Login"))
        tabLayout.addTab(tabLayout.newTab().setText("SignUp"))

        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = LoginAdapters(supportFragmentManager,this,tabLayout.tabCount);
        viewPager.adapter = adapter

        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        fabSupport.translationY = 300f
       tabLayout.translationX = 800f

        fabSupport.alpha = v
        tabLayout.alpha = v

        fabSupport.animate()
            .translationY(0f)
            .alpha(1f)
            .setDuration(1000)
            .setStartDelay(400)
            .start()

        tabLayout.animate().translationX(0f).alpha(1f).setDuration(1000).setStartDelay(300).start()
       /* tabLayout.animate()
            .translationY(0f)
            .alpha(1f)
            .setDuration(1000)
            .setStartDelay(400)
            .start()*/

        // Set TabLayout.OnTabSelectedListener
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                // Update the ViewPager's current item when a tab is selected
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                // Not used in this case
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
                // Not used in this case
            }


        })

     /*   // Create and set custom view for each tab
        for (i in 0 until tabLayout.tabCount) {
            val tab = tabLayout.getTabAt(i)
            tab?.customView = createTabView(i)
        }*/




    }

   /* private fun createTabView(position: Int): View {
        val tabView = LayoutInflater.from(this).inflate(R.layout.custom_tab_view, null)
        val textViewTitle: TextView = tabView.findViewById(R.id.tabText)

        // Customize the appearance of each tab's view here

        textViewTitle.text = tabLayout.getTabAt(position)?.text

        return tabView
    }*/
}