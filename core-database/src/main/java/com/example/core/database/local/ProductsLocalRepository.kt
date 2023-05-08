package com.example.core.database.local

import com.example.core.database.ProductsLocalDataSource
import com.example.core.database.dto.LocalResult
import com.example.core.database.dto.ProductDTO
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductsLocalRepository(
    private val productsDao: ProductsDao, private val ioDispatcher: CoroutineDispatcher =
        Dispatchers.IO
) : ProductsLocalDataSource {
    override suspend fun getProducts(): LocalResult<List<ProductDTO>> = withContext(ioDispatcher) {
        return@withContext try {
            LocalResult.Success(productsDao.getProdcuts())
        } catch (ex: Exception) {
            LocalResult.Error(ex.localizedMessage)
        }
    }

    override suspend fun saveProducts(products: List<ProductDTO>) = withContext(ioDispatcher) {
        productsDao.saveProducts(products)
    }

    override suspend fun getProductsLikeName(productName: String): LocalResult<List<ProductDTO>> =
        withContext(ioDispatcher) {
            try {
                val products = productsDao.getProductsLikeName(productName = productName)
                if (!products.isNullOrEmpty()) {
                    return@withContext LocalResult.Success(products)
                } else {
                    return@withContext LocalResult.Error("Product not found")
                }
            } catch (e: Exception) {
                return@withContext LocalResult.Error(e.localizedMessage)
            }
        }
}