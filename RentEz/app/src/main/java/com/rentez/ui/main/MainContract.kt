package com.rentez.ui.main

import com.rentez.ui.base.BaseContract

interface MainContract {

    interface View : BaseContract.View {
        fun initUi()

    }

    interface Presenter : BaseContract.Presenter<View> {

    }
}