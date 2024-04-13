package com.example.backend.controller

import com.example.backend.entity.User
import com.example.backend.service.GetUserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val getUserService: GetUserService) {

    @GetMapping("/user")
    fun getUser(): List<User> {
        return getUserService.getUser()
    }

}