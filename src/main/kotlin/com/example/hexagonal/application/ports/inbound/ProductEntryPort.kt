package com.example.hexagonal.application.ports.inbound

import com.example.hexagonal.application.core.domain.product.Product
import com.example.hexagonal.application.core.domain.product.command.CreateProductCommand

interface ProductEntryPort {

    fun create(cmd: CreateProductCommand): Product

}