package com.rentez.ui.login

import androidx.annotation.VisibleForTesting
import com.rentez.ext.applySchedulers
import com.rentez.ui.base.BasePresenter
import com.rentez.usecases.GetUserCacheUseCase
import com.rentez.usecases.LogInWithMobileNumberUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class LoginPresenter @Inject constructor(
    private val logInWithMobileNumberUseCase: LogInWithMobileNumberUseCase,
    private val getUserCacheUseCase: GetUserCacheUseCase
) : BasePresenter<LoginContract.View>(), LoginContract.Presenter {

    override fun onCreated() {
        super.onCreated()
        listenToUserCache()
    }

    @VisibleForTesting
    fun listenToUserCache() {
        disposabels?.add(
            getUserCacheUseCase.execute(Unit).listen()
                .applySchedulers()
                .subscribe({
                    //User cache is not empty use it for UI
                }, {

                })
        )
    }

    override fun onLoginButtonClicked(phoneNumber: Int) {
        disposabels?.add(logInWithMobileNumberUseCase.execute(phoneNumber)
            .subscribeOn(AndroidSchedulers.mainThread())
            .subscribe({
                //
            }, {
                //Update UI acc to throwable

            })
        )
    }
}