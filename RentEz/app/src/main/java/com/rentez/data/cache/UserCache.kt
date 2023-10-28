package com.rentez.data.cache

import com.rentez.data.cache.base.MemoryCache
import com.rentez.models.User

class UserCache(user: User) : MemoryCache<User>(user)