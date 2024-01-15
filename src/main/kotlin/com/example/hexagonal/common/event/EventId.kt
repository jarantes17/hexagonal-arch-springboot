package com.example.hexagonal.common.event

import java.util.*

@JvmRecord
data class EventId(val id: UUID?) {
    init {
        requireNotNull(id) { "EventId cannot be null!" }
    }

    companion object {

        fun from(value: String?): EventId {
            return EventId(UUID.fromString(value))
        }

        fun generate(): EventId {
            return EventId(UUID.randomUUID())
        }
    }
}
