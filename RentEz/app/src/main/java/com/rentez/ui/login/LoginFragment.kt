package com.rentez.ui.login

import com.rentez.R
import com.rentez.ui.base.BaseFragment

class LoginFragment : BaseFragment<LoginContract.View, LoginContract.Presenter>(),
    LoginContract.View {

    lateinit var loginPresenter: LoginPresenter

    override fun initUi() {
        TODO("Not yet implemented")
    }

    override fun initPresenter() = loginPresenter

    override fun injectDependencies() = getApplicationComponent().inject(this)

    override fun getLayoutResourceId() = R.layout.fragment_login
}