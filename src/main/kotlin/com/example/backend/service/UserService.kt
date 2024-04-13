package com.example.backend.service

import com.example.backend.repository.UserRepository
import com.example.backend.entity.User
import org.springframework.stereotype.Service



@Service
class GetUserService(private val userRepository: UserRepository) {
    fun getUser(): List<User> {
        return userRepository.findAll()
    }
}