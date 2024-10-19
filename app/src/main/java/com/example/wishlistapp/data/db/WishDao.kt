package com.example.wishlistapp.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.wishlistapp.data.model.WishEntity
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun addWish(wishEntity: WishEntity)

    // Loads all wishes from wish-table
    @Query("SELECT * FROM `wish-table`")
    abstract fun getAllWishes(): Flow<List<WishEntity>>

    // Loads a wish from wish-table based on ID
    @Query("SELECT * FROM `wish-table` WHERE id=:id")
    abstract fun getWishById(id: Long): Flow<WishEntity>

    @Update
    abstract suspend fun updateWish(wishEntity: WishEntity)

    @Delete
    abstract suspend fun deleteWish(wishEntity: WishEntity)

}
