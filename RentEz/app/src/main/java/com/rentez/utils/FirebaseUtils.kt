package com.rentez.utils

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.PhoneAuthCredential
import com.rentez.ui.main.MainActivity
import java.lang.Exception


object FirebaseUtils {

    val auth = FirebaseAuth.getInstance()
    fun loginWithMobileNumber(
        mobileNumber: String,
        onCompleted: () -> Unit = { },
        onVerificationFailed: () -> Unit = {},
        onCodeSend: () -> Unit = {},
        onSuccess: (FirebaseUser) -> Unit = {},
        onError: (Exception) -> Unit = {}
    ) {

    }

    private fun signInWithPhoneAuthCredential(
        credential: PhoneAuthCredential,
        context: MainActivity,
        onSuccess: (FirebaseUser?) -> Unit,
        onError: (Exception) -> Unit
    ) {
        auth.signInWithCredential(credential)
            .addOnCompleteListener(context) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val user = task.result?.user
                    onSuccess(user)
                } else {
                    // Sign in failed, display a message and update the UI
                    if (task.exception is FirebaseAuthInvalidCredentialsException) {
                        onError(task.exception as FirebaseAuthInvalidCredentialsException)
                    }
                    // Update UI
                }
            }
    }
}