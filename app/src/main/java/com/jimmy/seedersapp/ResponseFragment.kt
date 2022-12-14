package com.jimmy.seedersapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.seedersapp.databinding.FragmentResponseBinding


class ResponseFragment : Fragment() {

    private lateinit var binding: FragmentResponseBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_response, container, false)

        return binding.root
    }


}