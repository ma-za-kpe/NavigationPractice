package com.maku.navigationpractice.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.maku.navigationpractice.MainActivity
import com.maku.navigationpractice.R
import com.maku.navigationpractice.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container, false)

        //The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.robotButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nav_home_to_robotFragment))

        binding.humanButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nav_home_to_humanFragment))

        setHasOptionsMenu(true)

        (activity as MainActivity).getSupportActionBar()!!.setTitle("Home")

        return binding.root
    }
}