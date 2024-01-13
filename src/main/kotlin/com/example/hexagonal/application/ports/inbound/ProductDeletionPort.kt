package com.example.hexagonal.application.ports.inbound

import com.example.hexagonal.application.core.domain.product.ProductId

interface ProductDeletionPort {

    fun deleteBy(productId: ProductId)

}