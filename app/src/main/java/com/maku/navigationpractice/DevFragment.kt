package com.maku.navigationpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.maku.navigationpractice.databinding.FragmentDevBinding

/**
 * A simple [Fragment] subclass.
 */
class DevFragment : Fragment() {

    private lateinit var binding: FragmentDevBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_dev, container, false)

        //The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.mobileButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_devFragment_to_mobileFragment))
        binding.webButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_devFragment_to_webFragment))

        setHasOptionsMenu(true)

        (activity as MainActivity).getSupportActionBar()!!.setTitle("Software developer")


        return binding.root
    }


}
