package com.example.hexagonal.application.ports.inbound

import com.example.hexagonal.application.core.domain.product.Product
import com.example.hexagonal.application.core.domain.product.command.ChangeProductCommand

interface ProductModificationPort {

    fun changeBy(cmd: ChangeProductCommand): Product

}