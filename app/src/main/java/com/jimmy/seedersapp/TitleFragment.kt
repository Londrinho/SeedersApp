package com.jimmy.seedersapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jimmy.seedersapp.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {

    private lateinit var binding: FragmentTitleBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)

        return binding.root
    }

    fun goToAboutScreen(){
        findNavController().navigate(R.id.action_titleFragment_to_aboutFragment)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.titleFragment = this
    }
}