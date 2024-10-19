package com.example.wishlistapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.wishlistapp.domain.model.Wish

@Entity(tableName="wish-table")
data class WishEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name="wish-title")
    val title: String= "",
    @ColumnInfo(name="wish-desc")
    val description: String= ""
)
