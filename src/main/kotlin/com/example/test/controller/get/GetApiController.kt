package com.example.test.controller.get

import com.example.test.data.UserRequest
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class GetApiController {

    @GetMapping("/hello")
    fun hello(): String{
        return "hello kotlin"
    }

    @GetMapping("/get-mapping/path-variable/{name}")
    fun pathVariable(@PathVariable name : String): String {
        println(name)
        return name;
    }


    @GetMapping("/get-mapping/query-param")
    fun query(@RequestParam name: String,@RequestParam age:Int): String {
        return "$name $age"
    }

    @GetMapping("/object")
    fun paramObject(userRequest: UserRequest): UserRequest {
        return userRequest
    }

    @GetMapping("/map")
    fun queryMap(@RequestParam map:Map<String,Any>): Map<String, Any> {
        return map
    }


}