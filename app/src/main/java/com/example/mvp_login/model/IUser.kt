package com.example.mvp_login.model

interface IUser {
    val email: String
    val password: String
    fun isDataValid(): Int
}