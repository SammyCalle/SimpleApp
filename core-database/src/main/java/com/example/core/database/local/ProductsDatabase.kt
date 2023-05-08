package com.example.core.database.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.core.database.dto.ProductDTO

@Database(entities = [ProductDTO::class], version = 1, exportSchema = false)
abstract class ProductsDatabase : RoomDatabase() {

    abstract fun productDao(): ProductsDao
}