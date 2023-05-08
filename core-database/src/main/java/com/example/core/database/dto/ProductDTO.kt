package com.example.core.database.dto

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class ProductDTO(
    @ColumnInfo(name = "name") var name: String?,
    @ColumnInfo(name = "type") var type: String?,
    @PrimaryKey @ColumnInfo(name = "id") var id: Int
)
