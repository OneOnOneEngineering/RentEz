package com.rentez.ui.main

import com.rentez.ui.base.BasePresenter

class MainPresenter : BasePresenter<MainContract.View>(), MainContract.Presenter {

    override fun onCreated() {
        super.onCreated()
        getView()?.initUi()
    }
}