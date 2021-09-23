package com.example.loginDemo.controller

import com.example.loginDemo.entity.User
import com.example.loginDemo.services.LoginService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/api/v1/login")
class LoginController {

    @Autowired
    private lateinit var loginService: LoginService

    @GetMapping("/{email}/{password}")
    fun login(@PathVariable email: String, @PathVariable password: String): Optional<User>? {
        return try {
            loginService.login(email, password)
        } catch (e: Exception) {
            println(e)
            throw Exception()
        }
    }
}