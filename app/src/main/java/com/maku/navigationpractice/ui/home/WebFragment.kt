package com.maku.navigationpractice.ui.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.maku.navigationpractice.MainActivity

import com.maku.navigationpractice.R
import com.maku.navigationpractice.databinding.FragmentWebBinding

/**
 * A simple [Fragment] subclass.
 */
class WebFragment : Fragment() {

    private lateinit var binding: FragmentWebBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_web, container, false)

        //The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.buttonWebGanster.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_webFragment_to_nav_home))

        setHasOptionsMenu(true)

        (activity as MainActivity).getSupportActionBar()!!.setTitle("Web developer")

        return binding.root
    }


}
