package com.rentez.ui.main

import com.rentez.R
import com.rentez.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(), MainContract.View {

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun initUi() {

    }

    override fun initPresenter() = mainPresenter

    override fun injectDependencies() = getApplicationComponent().inject(this)

    override fun getLayoutResourceId() = R.layout.activity_main
}