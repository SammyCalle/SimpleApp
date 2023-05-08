package com.example.core.database.local

import android.content.Context
import androidx.room.Room

object LocalDB {
    fun createProductsDao(context: Context): ProductsDao {
        return Room.databaseBuilder(
            context.applicationContext,
            ProductsDatabase::class.java, "products.db"
        ).build().productDao()
    }
}