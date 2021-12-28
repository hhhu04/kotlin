package com.example.test.controller

import com.example.test.repository.UserRepository
import com.example.test.service.UserService
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
class TestController {

    lateinit var userService: UserService





}