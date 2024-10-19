package com.example.wishlistapp.presentation.ui

import android.app.Application
import com.example.wishlistapp.presentation.navigation.Graph

class WishListApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}