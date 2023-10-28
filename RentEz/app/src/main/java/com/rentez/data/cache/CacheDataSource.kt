package com.rentez.data.cache

import com.rentez.models.User
import javax.inject.Inject

open class CacheDataSource  @Inject constructor(private val userCache: UserCache){

    fun setUser(user: User) = userCache.update(user)

    fun getUserCache() = userCache
}