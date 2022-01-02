package com.roach.studyspringbinding.dto

import com.roach.studyspringbinding.domain.Role

data class User(
    val name: String,
    val password: String,
    val role: Role
)
