package com.example.wishlistapp.data.mapper

import com.example.wishlistapp.data.model.WishEntity
import com.example.wishlistapp.domain.model.Wish

class WishMapper {

    fun fromEntityToDomain(wishEntity: WishEntity): Wish {
        return Wish(
            id = wishEntity.id,
            title = wishEntity.title,
            description = wishEntity.description
        )
    }

    fun fromDomainToEntity(wish: Wish): WishEntity {
        return WishEntity(
            id = wish.id,
            title = wish.title,
            description = wish.description
        )
    }

    fun fromEntityListToDomainList(wishEntities: List<WishEntity>): List<Wish> {
        return wishEntities.map { fromEntityToDomain(it) }
    }

    fun fromDomainListToEntityList(wishes: List<Wish>): List<WishEntity> {
        return wishes.map { fromDomainToEntity(it) }
    }
}
