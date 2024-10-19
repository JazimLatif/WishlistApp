package com.example.wishlistapp.data.repository

import com.example.wishlistapp.data.db.WishDao
import com.example.wishlistapp.data.mapper.WishMapper
import com.example.wishlistapp.data.model.WishEntity
import com.example.wishlistapp.domain.model.Wish
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class WishRepository(
    private val wishDao: WishDao,
    private val wishMapper: WishMapper) {

    suspend fun addWish(wish: Wish){
        val wishEntity = wishMapper.fromDomainToEntity(wish)
        wishDao.addWish(wishEntity)
    }

    fun getAllWishes(): Flow<List<Wish>> {
        return wishDao.getAllWishes().map { wishEntities: List<WishEntity> ->
            wishMapper.fromEntityListToDomainList(wishEntities)
        }
    }

    fun getWishById(id: Long): Flow<Wish> {
        return wishDao.getWishById(id).map { wishEntity: WishEntity->
            wishMapper.fromEntityToDomain(wishEntity)
        }
    }

    suspend fun updateWish(wish: Wish) {
        val wishEntity = wishMapper.fromDomainToEntity(wish)
        wishDao.updateWish(wishEntity)
    }

    suspend fun deleteWish(wish: Wish) {
        val wishEntity = wishMapper.fromDomainToEntity(wish)
        wishDao.deleteWish(wishEntity)
    }
}
