package com.example.hexagonal.application.core.domain.product

import com.example.hexagonal.application.core.domain.product.command.CreateProductCommand
import com.example.hexagonal.common.aggregate.AggregateRoot
import com.example.hexagonal.common.event.DomainEvent
import java.time.LocalDateTime

data class Product(
    val productId: ProductId,
    val sku: Sku,
    val description: Description,
    val status: Status,
    val createdAt: LocalDateTime
) : AggregateRoot {


    override fun clearEvents() {
        TODO("Not yet implemented")
    }

    override fun listEvents(): List<DomainEvent?>? {
        TODO("Not yet implemented")
    }

    companion object {
        fun from(
            productId: ProductId,
            sku: Sku,
            description: Description,
            status: Status,
            createdAt: LocalDateTime
        ): Product {
            return Product(productId, sku, description, status, createdAt)
        }

        fun create(
            cmd: CreateProductCommand
        ): Product {
            return Product(ProductId.generate(), cmd.sku, cmd.description, cmd.status, LocalDateTime.now())
        }
    }
}