package com.example.hexagonal.application.ports.inbound

import com.example.hexagonal.application.core.domain.product.Product
import com.example.hexagonal.application.core.domain.product.ProductId
import com.example.hexagonal.application.core.domain.product.query.FilterCriteriaQuery
import java.util.*

interface ProductDisplayPort {

    fun displayAllBy(criteria: FilterCriteriaQuery): List<Product>

    fun displayBy(productId: ProductId): Optional<Product>

}