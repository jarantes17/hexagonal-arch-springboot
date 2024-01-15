package com.example.hexagonal.application.core.domain.product

@JvmRecord
data class Sku(val value: String?) {
    init {
        require(!value.isNullOrEmpty()) { "Sku cannot be null!" }
    }

    fun get(): String? {
        return value
    }

    fun digit(): String {
        return value?.substring(value.indexOf("-"), value.length) ?: ""
    }

    companion object {
        fun from(value: String?): Sku {
            return Sku(value)
        }
    }
}