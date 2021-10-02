package com.example.calendar.controller

import com.example.calendar.model.User
import com.example.calendar.repository.UserRepository
import io.swagger.v3.oas.annotations.Operation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(
    @Autowired val userRepository: UserRepository,
) {
    @Operation(summary = "Create new user")
    @PostMapping("/create")
    fun createUser(@RequestBody user: User): User = userRepository.save(user)


    @Operation(summary = "Get all user")
    @GetMapping("/get/all")
    fun getAllUsers(): Iterable<User> = userRepository.findAll()
}