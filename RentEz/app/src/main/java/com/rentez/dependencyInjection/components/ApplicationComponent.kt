package com.rentez.dependencyInjection.components

import com.rentez.dependencyInjection.modules.ApplicationModule
import com.rentez.dependencyInjection.modules.CacheModule
import com.rentez.dependencyInjection.modules.NetworkModule
import com.rentez.dependencyInjection.scope.ApplicationScope
import com.rentez.ui.credential.CredentialsActivity
import com.rentez.ui.login.LoginFragment
import com.rentez.ui.main.MainActivity
import dagger.Component

@ApplicationScope
@Component(modules = [ApplicationModule::class,NetworkModule::class,CacheModule::class])
interface ApplicationComponent {
    //Inject Activity
    fun inject(activity: MainActivity)
    fun inject(activity: CredentialsActivity)

    //Inject Fragment
    fun inject(fragment: LoginFragment)
}