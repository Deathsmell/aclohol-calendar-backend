package com.example.calendar.repository

import com.example.calendar.model.Event
import org.springframework.data.repository.CrudRepository
import java.util.*

interface EventRepository : CrudRepository<Event, UUID> {

}