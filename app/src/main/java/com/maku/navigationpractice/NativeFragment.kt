package com.maku.navigationpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.maku.navigationpractice.databinding.FragmentNativeBinding

/**
 * A simple [Fragment] subclass.
 */
class NativeFragment : Fragment() {

    private lateinit var binding: FragmentNativeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_native, container, false)

        //The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.buttonnativeGanster.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nativeFragment_to_nav_home))

        setHasOptionsMenu(true)

        (activity as MainActivity).getSupportActionBar()!!.setTitle("Native developers")

        return binding.root
    }


}
