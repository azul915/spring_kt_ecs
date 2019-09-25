package com.azul.spring.project.entity

import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * UserテーブルのEntity
 * @param id 主キー
 * @param name 名前
 * @param age 年齢
 */
data class User(@Id @GeneratedValue var id: Int? = 0,
                @Column(name = "name", nullable = false) var name: String = "",
                @Column(name = "age", nullable = false) var age: Int? = 0) {
}