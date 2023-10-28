package com.rentez.usecases

import com.google.firebase.auth.FirebaseUser
import com.rentez.data.DataRepository
import com.rentez.ext.ModelExt.toUser
import com.rentez.usecases.base.UseCase
import com.rentez.utils.FirebaseUtils
import io.reactivex.Single
import javax.inject.Inject

class LogInWithMobileNumberUseCase @Inject constructor(private val dataRepository: DataRepository) :
    UseCase<Int, Single<Unit>>() {
    override fun execute(parameters: Int) = Single.create<Unit> { emitter ->
        try {
            FirebaseUtils.loginWithMobileNumber(
                parameters.toString(),
                onSuccess = { onSuccess(it) },
                onError = { onError(it) })
        } catch (e: Exception) {
            emitter.onError(e)
        }
    }

    private fun onSuccess(firebaseUser: FirebaseUser) {
        val user = firebaseUser.toUser()
        dataRepository.setUser(user)
    }

    private fun onError(e: Exception) {
        throw e
    }
}