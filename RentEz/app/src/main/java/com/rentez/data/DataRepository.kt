package com.rentez.data

import com.rentez.data.cache.CacheDataSource
import com.rentez.models.User
import javax.inject.Inject

class DataRepository @Inject constructor(
    private val cacheDataSource: CacheDataSource,
    private val mockDataSource: MockDataSource
) {
    fun setUser(user: User) = cacheDataSource.setUser(user)

    fun getUserCache() = cacheDataSource.getUserCache()
}