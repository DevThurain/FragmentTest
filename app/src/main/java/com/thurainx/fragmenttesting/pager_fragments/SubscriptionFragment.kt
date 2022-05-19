package com.thurainx.fragmenttesting.pager_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thurainx.fragmenttesting.R
import kotlinx.android.synthetic.main.fragment_subscription.*

class SubscriptionFragment : Fragment() {

    companion object{
        const val KEY_SUBSCRIPTION_DESC = "KEY_SUBSCRIPTION_DESC"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_subscription, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = arguments.takeIf {  bundle -> bundle?.containsKey(KEY_SUBSCRIPTION_DESC) ?: false }

        bundle?.let {
            tvSubscriptionDescription.text = it.getString(KEY_SUBSCRIPTION_DESC )
        }
    }

}