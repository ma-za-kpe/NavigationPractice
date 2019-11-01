package com.maku.navigationpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.maku.navigationpractice.databinding.FragmentHomeBinding
import com.maku.navigationpractice.databinding.FragmentMobileBinding

/**
 * A simple [Fragment] subclass.
 */
class MobileFragment : Fragment() {

    private lateinit var binding: FragmentMobileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_mobile, container, false)

        //The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.nativeButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_mobileFragment_to_nativeFragment))

        binding.hybridButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_mobileFragment_to_hybridFragment))

        setHasOptionsMenu(true)

        (activity as MainActivity).getSupportActionBar()!!.setTitle("Mobile developer")

        return binding.root
    }


}
