package com.example.wishlistapp.presentation.navigation

import android.content.Context
import androidx.room.Room
import com.example.wishlistapp.data.db.WishDatabase
import com.example.wishlistapp.data.mapper.WishMapper
import com.example.wishlistapp.data.repository.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao(), wishMapper = WishMapper())
    }

    fun provide(context: Context) {
        database = Room.databaseBuilder(context, WishDatabase::class.java, "wishlist.db").build()
    }
}