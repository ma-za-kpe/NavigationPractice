package com.maku.navigationpractice


import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.maku.navigationpractice.databinding.FragmentRobotBinding
import android.view.KeyEvent.KEYCODE_ENTER



/**
 * A simple [Fragment] subclass.
 */
class RobotFragment : Fragment() {

    private lateinit var binding: FragmentRobotBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_robot, container, false)

        //hide failure text
        binding.textView6.visibility = View.GONE
        binding.buttonSubmit.visibility = View.GONE

        binding.editText2.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View, keyCode: Int, event: KeyEvent): Boolean {
                // If the event is a key-down event on the "enter" button
                if (event.getAction() === KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                    // Perform action on key press

                    //right answer
                    val answer: String = "i love tequila"

                    //extrace text from edittext
                    val editTextanswer = binding.editText2.text.toString()

                        if (editTextanswer == answer) {

                            //show submit button
                            binding.buttonSubmit.visibility = View.VISIBLE
                            //navigate to ganster poitns activity
                            binding.buttonSubmit.setOnClickListener(
                                Navigation.createNavigateOnClickListener(R.id.action_robotFragment_to_gansterPtsFragment))
                        } else {
                            Toast.makeText(context, "Its wrong " + editTextanswer, Toast.LENGTH_SHORT).show()
                            //show failere text
                           binding.textView6.visibility = View.VISIBLE

                            //hide other views
                            binding.proof.visibility = View.GONE
                            binding.textView3.visibility = View.GONE
                            binding.textView4.visibility = View.GONE
                            binding.textView5.visibility = View.GONE
                            binding.editText2.visibility = View.GONE
                            binding.buttonSubmit.visibility = View.GONE

                        }

                    return true
                }
                return false
            }
        })


        setHasOptionsMenu(true)

        (activity as MainActivity).getSupportActionBar()!!.setTitle("Robot")

        return binding.root
    }


}
