package com.azul.spring.project.domain

import javax.persistence.*

/**
 * UserテーブルのEntity
 * @param id 主キー
 * @param name 名前
 * @param age 年齢
 */
@Entity
@Table(name = "user")
data class User(@Id @GeneratedValue var id: Int? = 0,
                @Column(name = "name", nullable = false) var name: String = "",
                @Column(name = "age", nullable = false) var age: Int? = 0)