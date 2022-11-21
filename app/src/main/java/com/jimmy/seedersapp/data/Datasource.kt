package com.jimmy.seedersapp.data

import com.jimmy.seedersapp.R
import com.jimmy.seedersapp.model.About

class Datasource {

    fun loadAbout(): List<About>{
        return listOf<About>(
            About(R.drawable.ourstory),
            About(R.drawable.ourroots),
            About(R.drawable.globalpartner)
        )
    }
}