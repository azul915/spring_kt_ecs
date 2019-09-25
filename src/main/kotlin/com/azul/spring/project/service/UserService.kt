package com.azul.spring.project.service

import com.azul.spring.project.entity.User
import com.azul.spring.project.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService @Autowired constructor(private val userRepository: UserRepository) {

    fun findAllUser(): MutableList<User> = userRepository.findAll()

    fun findById(id: Long): User = userRepository.findById(id).orElse(null)

    fun save(user: User) = userRepository.save(user)

    fun destroy(user: User) = userRepository.delete(user)
}