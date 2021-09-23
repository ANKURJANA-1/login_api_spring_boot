package com.example.loginDemo.services

import com.example.loginDemo.entity.User
import com.example.loginDemo.repository.RegisterRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RegisterService {

    @Autowired
    lateinit var registerRepository: RegisterRepository

    fun saveUser(user: User) {
        try {
            registerRepository.save(user)
        } catch (e: Exception) {
            println(e)
        }
    }
}