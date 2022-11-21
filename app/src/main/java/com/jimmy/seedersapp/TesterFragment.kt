package com.jimmy.seedersapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.seedersapp.databinding.FragmentTesterBinding


class TesterFragment : Fragment() {

    private lateinit var binding: FragmentTesterBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tester, container, false)

        return binding.root
    }


}