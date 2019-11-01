package com.maku.navigationpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.maku.navigationpractice.databinding.FragmentOtherBinding

/**
 * A simple [Fragment] subclass.
 */
class OtherFragment : Fragment() {

    private lateinit var binding: FragmentOtherBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_other, container, false)

        //The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.buttonother.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_otherFragment_to_nav_home))

        setHasOptionsMenu(true)

        (activity as MainActivity).getSupportActionBar()!!.setTitle("Other people")

        return binding.root
    }


}
