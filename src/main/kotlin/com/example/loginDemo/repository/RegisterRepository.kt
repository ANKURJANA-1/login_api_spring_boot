package com.example.loginDemo.repository

import com.example.loginDemo.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface RegisterRepository : JpaRepository<User, Long> {
}