package com.example.wishlistapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.wishlistapp.data.model.WishEntity

@Database(
    entities = [WishEntity::class],
    version = 1,
    exportSchema = false
)
abstract class WishDatabase : RoomDatabase() {
    abstract fun wishDao(): WishDao
}
