package com.example.hexagonal.application.core.domain.product

import java.util.*

@JvmRecord
data class ProductId(val value: String?) {
    init {
        require(!value.isNullOrEmpty()) { "ProductId cannot be null!" }
    }

    companion object {

        fun from(value: String?): ProductId {
            return ProductId(value)
        }

        fun generate(): ProductId {
            return ProductId(UUID.randomUUID().toString())
        }

    }

}