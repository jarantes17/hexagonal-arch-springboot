package com.example.hexagonal.common.command

import java.util.*


@JvmRecord
data class CommandId(val value: UUID?) {
    init {
        requireNotNull(value) { "CommandId cannot be null!" }
    }

    companion object {
        fun from(value: String?): CommandId {
            return CommandId(UUID.fromString(value))
        }

        fun generate(): CommandId {
            return CommandId(UUID.randomUUID())
        }
    }
}
