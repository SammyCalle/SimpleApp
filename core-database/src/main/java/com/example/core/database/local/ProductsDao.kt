package com.example.core.database.local

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.core.database.dto.ProductDTO

interface ProductsDao {
    @Query("SELECT * FROM products")
    suspend fun getProdcuts(): List<ProductDTO>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveProducts(products: List<ProductDTO>)

    @Query("SELECT * FROM products where name LIKE %:productName%")
    suspend fun getProductsLikeName(productName: String): List<ProductDTO>

}