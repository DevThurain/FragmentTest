package com.thurainx.fragmenttesting

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.thurainx.fragmenttesting.pager_fragments.HomeFragment
import com.thurainx.fragmenttesting.pager_fragments.ShortFragment
import com.thurainx.fragmenttesting.pager_fragments.SubscriptionFragment

class YoutubeViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return  3;
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> {
                val bundle = Bundle().apply {
                    this.putString(HomeFragment.KEY_HOME_DESC,"This is Home Description.")
                }
                val homeFragment = HomeFragment()
                homeFragment.arguments = bundle

                return homeFragment
            }
            1 -> {
                val bundle = Bundle().apply {
                    this.putString(ShortFragment.KEY_SHORT_DESC, "This is Short Description.")
                }
                val shortFragment = ShortFragment()
                shortFragment.arguments = bundle
                return shortFragment
            }
            else -> {
                val bundle = Bundle().apply {
                    this.putString(SubscriptionFragment.KEY_SUBSCRIPTION_DESC, "This is Subscription Description.")
                }
                val subscriptionFragment = SubscriptionFragment()
                subscriptionFragment.arguments = bundle
                return subscriptionFragment
            }
        }
    }

}