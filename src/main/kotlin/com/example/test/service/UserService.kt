package com.example.test.service

import com.example.test.entity.User
import com.example.test.repository.UserRepository
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    private lateinit var userRepository : UserRepository

    fun read(): MutableList<User> {
        return userRepository.findAll()
    }


}