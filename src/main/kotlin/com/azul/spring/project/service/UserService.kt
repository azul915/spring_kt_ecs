package com.azul.spring.project.service

import com.azul.spring.project.domain.User
import com.azul.spring.project.domain.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService @Autowired constructor(private val userRepository: UserRepository) {

    fun findAllUser(): MutableList<User> = userRepository.findAll()

    fun findById(id: Int) = userRepository.findById(id)

    fun save(user: User) = userRepository.save(user)

    fun destroy(user: User) = userRepository.delete(user)
}