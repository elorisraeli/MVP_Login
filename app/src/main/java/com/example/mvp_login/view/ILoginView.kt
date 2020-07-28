package com.example.mvp_login.view

interface ILoginView {
    fun onLoginSuccess(message:String)
    fun onLoginError(message:String)
}