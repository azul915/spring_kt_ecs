package com.azul.spring.project.service

import org.springframework.beans.factory.annotation.Autowired

class BookService @Autowired constructor(private val bookRepository: BookRepository) {

    /**
     * 全ユーザーリストの取得
     * @return ユーザーリスト
     */
    fun findAllBook(): MutableList = bookRepository.findAll()

    fun findById(id: Int): Book {
        var book: Book = bookRepository.findById(id)
        return book
    }

    
}