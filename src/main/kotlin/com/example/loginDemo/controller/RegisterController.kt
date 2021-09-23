package com.example.loginDemo.controller

import com.example.loginDemo.entity.User
import com.example.loginDemo.services.RegisterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
class RegisterController {

    @Autowired
    lateinit var registerService: RegisterService

    @PostMapping
    fun saveUser(@RequestBody user: User) {
        try {
            registerService.saveUser(user)
        } catch (e: Exception) {
            println(e)
        }
    }


}