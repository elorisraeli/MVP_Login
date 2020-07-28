package com.example.mvp_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvp_login.presenter.ILoginPresenter
import com.example.mvp_login.presenter.LoginPresenter
import com.example.mvp_login.view.ILoginView
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ILoginView {

    override fun onLoginSuccess(message: String) {
        Toasty.success(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onLoginError(message: String) {
        Toasty.error(this, message, Toast.LENGTH_SHORT).show()
    }

    private lateinit var loginPresenter: ILoginPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)

        buttonLogin.setOnClickListener {
            loginPresenter.onLogin(editTextEmail.text.toString(), editTextPassword.text.toString())
        }


    }
}
