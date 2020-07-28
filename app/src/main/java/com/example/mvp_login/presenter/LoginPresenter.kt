package com.example.mvp_login.presenter

import com.example.mvp_login.model.User
import com.example.mvp_login.view.ILoginView

class LoginPresenter(internal var iLoginView: ILoginView) : ILoginPresenter {
    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        val loginCode = user.isDataValid()
        if (loginCode == 0)
            iLoginView.onLoginError("Must enter email")
        else if (loginCode == 1)
            iLoginView.onLoginError("Email not valid")
        else if (loginCode == 2)
            iLoginView.onLoginError("Password must be greater then 6")
        else
            iLoginView.onLoginSuccess("Login Success :)")
    }
}