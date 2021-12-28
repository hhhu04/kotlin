package com.example.test.controller.post

import com.example.test.data.UserRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PostApiController {


    @PostMapping("/post")
    fun postMapping(): String{
        return "post"
    }


    @PostMapping("/post/object")
    fun postObject(@RequestBody userRequest: UserRequest): UserRequest {
        println(userRequest)
        return userRequest
    }




}