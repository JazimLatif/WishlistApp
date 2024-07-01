package com.example.wishlistapp.data

data class Wish(
    val title: String = "",
    val description: String = ""
)


object DummyWish {
    val wishList = listOf(
        Wish("Google Watch 2", "A smart watch for fitness"),
        Wish("Farenheight 451", "A good book (apparently)"),
        Wish("CK one", "Perfume")
    )
}