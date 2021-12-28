package com.example.test.controller.put

import com.example.test.data.Result
import com.example.test.data.UserRequest
import com.example.test.data.UserResponse
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PutApiController {

    @PutMapping("/put")
    fun putMapping(): String {
        return "put"
    }



    @PutMapping("object")
    fun putObject(@RequestBody userRequest: UserRequest): UserResponse {

        return UserResponse().apply {
            this.result = Result().apply {
                this.resultCode = "ok"
                this.resultMassage = "---"
            }
        }.apply {
            this.description = "---"
        }.apply {
            var userList = mutableListOf<UserRequest>()



        }


    }






}