package com.thurainx.fragmenttesting.pager_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thurainx.fragmenttesting.R
import kotlinx.android.synthetic.main.fragment_short.*

class ShortFragment : Fragment() {

    companion object{
        const val KEY_SHORT_DESC = "KEY_SHORT_DESC"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_short, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = arguments.takeIf { bundle -> bundle?.containsKey(KEY_SHORT_DESC) ?: false }

        bundle?.let {
            tvShortDescription.text = bundle.getString(KEY_SHORT_DESC)
        }
    }

}