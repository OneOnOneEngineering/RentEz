package com.rentez.usecases

import com.rentez.data.DataRepository
import com.rentez.data.cache.UserCache
import com.rentez.usecases.base.UseCase
import javax.inject.Inject

class GetUserCacheUseCase @Inject constructor(private val dataRepository: DataRepository) :
    UseCase<Unit, UserCache>() {
    override fun execute(parameters: Unit) = dataRepository.getUserCache()
}