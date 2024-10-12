package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name="wish-title")
    val title: String= "",
    @ColumnInfo(name="wish-desc")
    val description: String= ""
)


object DummyWish {
    val wishList=listOf(
        Wish(title="Google Watch 2", description="A smart watch for fitness"),
        Wish(title="Farenheight 451", description="A good book (apparently)"),
        Wish(title="CK one", description="Perfume")
    )
}