package com.example.calendar.controller

import com.example.calendar.model.Event
import com.example.calendar.model.User
import com.example.calendar.repository.EventRepository
import com.example.calendar.repository.UserRepository
import io.swagger.v3.oas.annotations.Operation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/event")
class EventController(
    @Autowired val eventRepository: EventRepository,
    ) {

    @Operation(summary = "Create new event")
    @PostMapping("/create")
    fun createEvent(@RequestBody event: Event): Event = eventRepository.save(event)

    @Operation(summary = "Get all events")
    @GetMapping("/get/all")
    fun getAllEvents(): Iterable<Event> = eventRepository.findAll()
}