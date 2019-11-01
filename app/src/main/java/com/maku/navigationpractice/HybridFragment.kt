package com.maku.navigationpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.maku.navigationpractice.databinding.FragmentHybridBinding
import com.maku.navigationpractice.databinding.FragmentMobileBinding

/**
 * A simple [Fragment] subclass.
 */
class HybridFragment : Fragment() {

    private lateinit var binding: FragmentHybridBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_hybrid, container, false)

        //The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.buttonHybridGanster.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_hybridFragment_to_nav_home))

        setHasOptionsMenu(true)

        (activity as MainActivity).getSupportActionBar()!!.setTitle("Hybrid developers")

        return binding.root
    }


}
