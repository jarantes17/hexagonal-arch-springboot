package com.example.hexagonal.application.core.domain.product.command

import com.example.hexagonal.application.core.domain.product.Description
import com.example.hexagonal.application.core.domain.product.Sku
import com.example.hexagonal.application.core.domain.product.Status
import com.example.hexagonal.common.command.CommandId

@JvmRecord
data class CreateProductCommand(
    val commandId: CommandId,
    val sku: Sku,
    val description: Description,
    val status: Status,
) {
}