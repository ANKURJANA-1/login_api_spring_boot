package com.example.loginDemo.repository

import com.example.loginDemo.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*


interface LoginRepository : JpaRepository<User, Long> {

    fun findByEmail(email:String): Optional<User>

}