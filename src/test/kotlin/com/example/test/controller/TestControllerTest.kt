package com.example.test.controller

import com.example.test.entity.User
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import java.util.Collections.list

@SpringBootTest
@AutoConfigureMockMvc
class TestControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun read(){
        mockMvc.perform(
            MockMvcRequestBuilders.get("/read")
        ).andExpect{
            MockMvcResultMatchers.status().isOk
        }.andDo(MockMvcResultHandlers.print())

    }

}