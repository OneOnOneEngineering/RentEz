package com.rentez.ext

import com.google.firebase.auth.FirebaseUser
import com.rentez.models.User

object ModelExt {
    fun FirebaseUser.toUser():User{
        return User()
    }
}