package com.example.hexagonal.application.core.domain.product

@JvmRecord
data class Description(val value: String?) {
    init {
        require(!value.isNullOrEmpty()) { "Description cannot be null!" }
    }

    companion object {
        fun from(value: String?): Description {
            return Description(value)
        }
    }
}