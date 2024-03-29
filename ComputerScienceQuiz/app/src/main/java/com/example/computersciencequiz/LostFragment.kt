package com.example.computersciencequiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.computersciencequiz.databinding.FragmentLostBinding

/**
 * A simple [Fragment] subclass.
 */
class LostFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentLostBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_lost, container, false)
        binding.tryAgainButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_lostFragment_to_startFragment)
        }
        return binding.root
    }

}
