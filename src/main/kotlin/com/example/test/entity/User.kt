package com.example.test.entity

import lombok.Data
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
@Data
class User {

    @Id
    @GeneratedValue
    var id:Long?=null

    var email:String?=null

    var password : String? = null


}