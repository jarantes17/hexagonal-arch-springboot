package com.example.hexagonal.common.event

import com.example.hexagonal.common.messaging.Message

interface Event : Message {

    fun id(): EventId?

    companion object {

        fun now(): java.time.Instant? {
            return java.time.Instant.now()
        }
    }
}
