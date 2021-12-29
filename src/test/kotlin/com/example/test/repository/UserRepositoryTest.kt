package com.example.test.repository

import com.example.test.entity.User
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private lateinit var userRepository : UserRepository

    var user=User()

    @Test
    fun test(){


        user.email="test@test"
        user.password="123456"


        userRepository.save(user)


    }


    @Test
    fun read(){
        println(userRepository.findAll())
    }



}