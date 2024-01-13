package com.example.hexagonal.application.core.service

import com.example.hexagonal.application.core.domain.product.Product
import com.example.hexagonal.application.core.domain.product.ProductId
import com.example.hexagonal.application.core.domain.product.command.ChangeProductCommand
import com.example.hexagonal.application.core.domain.product.command.CreateProductCommand
import com.example.hexagonal.application.core.domain.product.query.FilterCriteriaQuery
import com.example.hexagonal.application.ports.inbound.ProductDeletionPort
import com.example.hexagonal.application.ports.inbound.ProductDisplayPort
import com.example.hexagonal.application.ports.inbound.ProductEntryPort
import com.example.hexagonal.application.ports.inbound.ProductModificationPort
import java.util.*

class ProductService :  ProductDisplayPort, ProductEntryPort, ProductModificationPort, ProductDeletionPort {

    override fun displayAllBy(criteria: FilterCriteriaQuery): List<Product> {
        TODO("Not yet implemented")
    }

    override fun displayBy(productId: ProductId): Optional<Product> {
        TODO("Not yet implemented")
    }

    override fun create(cmd: CreateProductCommand): Product {
        TODO("Not yet implemented")
    }

    override fun changeBy(cmd: ChangeProductCommand): Product {
        TODO("Not yet implemented")
    }

    override fun deleteBy(productId: ProductId) {
        TODO("Not yet implemented")
    }

}