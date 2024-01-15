package com.example.hexagonal.common.aggregate

import com.example.hexagonal.common.event.DomainEvent

interface AggregateRoot {

    fun clearEvents()
    fun listEvents(): List<DomainEvent?>?

}
