package com.thurainx.fragmenttesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_pager.*

class PagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pager)


        vpYoutube.adapter = YoutubeViewPagerAdapter(this)

        TabLayoutMediator(tabLayoutYoutube,vpYoutube){ tab , position ->
            when(position){
                0 -> { tab.text = "Home"}
                1 -> { tab.text = "Short"}
                else -> { tab.text = "Subscription"}
            }
        }.attach()
    }
}