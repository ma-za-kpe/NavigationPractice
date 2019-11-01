package com.maku.navigationpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.maku.navigationpractice.databinding.FragmentGansterPtsBinding

/**
 * A simple [Fragment] subclass.
 */
class GansterPtsFragment : Fragment() {

    private lateinit var binding: FragmentGansterPtsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_ganster_pts, container, false)

        binding.buttonGanster.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_gansterPtsFragment_to_nav_home))

        setHasOptionsMenu(true)

        (activity as MainActivity).getSupportActionBar()!!.setTitle("Ganster Points")

        return binding.root
    }


}
