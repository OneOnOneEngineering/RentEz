package com.rentez.ui.credential

import com.rentez.R
import com.rentez.ext.addFragment
import com.rentez.ui.base.BaseActivity
import com.rentez.ui.login.LoginFragment
import kotlinx.android.synthetic.main.activity_credentail.*

class CredentialsActivity : BaseActivity<CredentialsContract.View, CredentialsContract.Presenter>(),
    CredentialsContract.View {
    lateinit var credentialsPresenter: CredentialsPresenter

    override fun initUi() {
        addFragment(LoginFragment(),fl_credential_container.id)
    }

    override fun initPresenter() = credentialsPresenter

    override fun injectDependencies() = getApplicationComponent().inject(this)

    override fun getLayoutResourceId() = R.layout.activity_credentail
}