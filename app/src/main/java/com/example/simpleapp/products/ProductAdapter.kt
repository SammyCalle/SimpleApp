package com.example.simpleapp.products

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.simpleapp.R
import com.example.simpleapp.databinding.ProductItemBinding
import com.example.simpleapp.domain.Product

class ProductAdapter() : RecyclerView.Adapter<ProductViewHolder>() {

    var products: List<Product> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val withDataBinding: ProductItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            ProductViewHolder.LAYOUT,
            parent,
            false)
        return ProductViewHolder(withDataBinding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.viewDataBinding.also {
            it.product = products[position]
        }
    }

    override fun getItemCount() = products.size
}

class ProductViewHolder(val viewDataBinding: ProductItemBinding) :
    RecyclerView.ViewHolder(viewDataBinding.root) {
    companion object {
        @LayoutRes
        val LAYOUT = R.layout.product_item
    }

}