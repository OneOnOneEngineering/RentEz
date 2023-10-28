package com.rentez.ui.login

import com.rentez.ui.base.BaseContract

interface LoginContract {
    interface View : BaseContract.View {
        fun initUi()
    }

    interface Presenter : BaseContract.Presenter<View> {

        fun onLoginButtonClicked(phoneNumber: Int)
    }
}