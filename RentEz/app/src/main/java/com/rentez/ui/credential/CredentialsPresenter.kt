package com.rentez.ui.credential

import com.rentez.ui.base.BasePresenter

class CredentialsPresenter : BasePresenter<CredentialsContract.View>(),
    CredentialsContract.Presenter {

    override fun onCreated() {
        getView()?.initUi()
    }
}