package com.example.mvp_login.model

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

class User(override val email: String, override val password: String) : IUser {
    override fun isDataValid(): Int {
        return if (TextUtils.isEmpty(email))
            0
        else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
            1
        else if (password.length <= 6)
            2
        else
            -1

    }
}