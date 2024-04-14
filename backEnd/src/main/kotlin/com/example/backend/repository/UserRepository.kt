package com.example.backend.repository

import com.example.backend.entity.User
import org.springframework.data.jpa.repository.JpaRepository

//user table
interface UserRepository: JpaRepository<User, Int>