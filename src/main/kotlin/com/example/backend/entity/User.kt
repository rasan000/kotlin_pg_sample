package com.example.backend.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.Date


@Entity
@Table(name = "USERS")
data class User(
    @Id
    val id: String,
    val name: String,
    val birthday: Date,
    val sex: Boolean,
    val createDatetime: Date,
    val updateDatetime: Date,
)