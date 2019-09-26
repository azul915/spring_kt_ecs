package com.azul.spring.project.controller

import com.azul.spring.project.domain.User
import com.azul.spring.project.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
class UserController @Autowired constructor(private val userService: UserService){

    @RequestMapping("/api/user")
    fun api_index(): ResponseEntity<MutableList<User>> {
        return ResponseEntity.ok(userService.findAllUser())
    }
    
    @RequestMapping("/api/users/{id}")
    fun api_show(@PathVariable("id") id: Int): ResponseEntity<User> {
        return ResponseEntity.ok(userService.findById(id))
    }

    @RequestMapping("/api/users", method = arrayOf(RequestMethod.PUT))
    fun api_update(user: User): ResponseEntity<User> {
        return ResponseEntity.ok(userService.save(user))
    }

    @RequestMapping("/api/users", method = arrayOf(RequestMethod.POST))
    fun api_create(@RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity.ok(userService.save(User(user.id, user.name, user.age)))
    }

    @RequestMapping("/api/users/{id}", method = arrayOf(RequestMethod.DELETE))
    fun api_destroy(id: Int): ResponseEntity<User> {
        var user = userService.findById(id)
        userService.destroy(user)
        return ResponseEntity.ok(user)
    }

}