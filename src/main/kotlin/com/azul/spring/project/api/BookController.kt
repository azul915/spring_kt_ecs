package com.azul.spring.project.api

import org.springframework.beans.factory.annotation.Autowired

class BookController @Autowired constructor(private val bookService: BookService) {

}