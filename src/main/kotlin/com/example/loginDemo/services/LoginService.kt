package com.example.loginDemo.services

import com.example.loginDemo.entity.User
import com.example.loginDemo.repository.LoginRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class LoginService {

    @Autowired
    private lateinit var loginRepository: LoginRepository

    fun login(userEmail: String, userPassword: String): Optional<User>? {
        val user = loginRepository.findByEmail(userEmail)
        if (user.isPresent) {
            if (user.get().password.toString() == userPassword)
                return user

        }
        return null
    }
}