package com.jimmy.seedersapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.seedersapp.adapter.ItemAdapterAbout
import com.jimmy.seedersapp.data.Datasource
import com.jimmy.seedersapp.databinding.FragmentAboutBinding


class AboutFragment : Fragment() {

    private lateinit var binding: FragmentAboutBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false)

        val myDataset = Datasource().loadAbout()

        val recyclerView = binding.recyclerViewAbout
        recyclerView.adapter = ItemAdapterAbout(this, myDataset)

        recyclerView.setHasFixedSize(true)

        return binding.root
    }


}