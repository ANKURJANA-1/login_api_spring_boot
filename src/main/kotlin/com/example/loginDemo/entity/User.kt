package com.example.loginDemo.entity

import javax.persistence.*


@Entity
@Table(name = "user_db")
data class User(
    @Id
    @SequenceGenerator(
        name = "user_sequence",
        sequenceName = "user_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "user_sequence"
    )
    val id: Long? = null,

    val firstName: String,
    val lastName: String,

    @Column(
        name = "email_address",
        unique = true,
        nullable = false
    )
    val email: String,
    val password: String
)
