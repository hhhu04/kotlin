package com.example.test.service

import com.example.test.repository.UserRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class UserService {

    lateinit var userRepository : UserRepository



}