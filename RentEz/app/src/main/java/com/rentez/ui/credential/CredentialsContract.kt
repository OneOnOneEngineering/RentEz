package com.rentez.ui.credential

import com.rentez.ui.base.BaseContract

interface CredentialsContract {

    interface View:BaseContract.View{
        fun initUi()
    }

    interface Presenter:BaseContract.Presenter<View>{

    }
}