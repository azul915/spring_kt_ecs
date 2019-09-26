package com.azul.spring.project.domain

import com.azul.spring.project.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long> {
    fun findById(id: Int): User
}