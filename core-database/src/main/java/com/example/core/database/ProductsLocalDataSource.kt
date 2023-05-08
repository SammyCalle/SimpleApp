package com.example.core.database

import com.example.core.database.dto.LocalResult
import com.example.core.database.dto.ProductDTO


interface ProductsLocalDataSource {
    suspend fun getProducts(): LocalResult<List<ProductDTO>>

    suspend fun saveProducts(products: List<ProductDTO>)

    suspend fun getProductsLikeName(productName: String): LocalResult<List<ProductDTO>>
}