package com.maku.navigationpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation

import com.maku.navigationpractice.R
import com.maku.navigationpractice.databinding.FragmentHumanBinding

/**
 * A simple [Fragment] subclass.
 */
class HumanFragment : Fragment() {

    private lateinit var binding: FragmentHumanBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_human, container, false)

        //The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.devButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_humanFragment_to_devFragment))

        binding.otherButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_humanFragment_to_otherFragment))

        setHasOptionsMenu(true)

        (activity as MainActivity).getSupportActionBar()!!.setTitle("Human Being")

        return binding.root
    }


}
