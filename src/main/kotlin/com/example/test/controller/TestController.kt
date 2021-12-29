package com.example.test.controller

import com.example.test.entity.User
import com.example.test.repository.UserRepository
import com.example.test.service.UserService
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
class TestController {

    @Autowired
    private lateinit var userService:UserService

    @GetMapping("/read")
    fun read(): MutableList<User> {
        return userService.read()

    }



}