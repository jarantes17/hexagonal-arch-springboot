package com.example.hexagonal.common.command

import java.time.Instant

interface Command {

    fun id(): CommandId?

    companion object {

        fun now(): Instant? {
            return Instant.now()
        }
    }
}
