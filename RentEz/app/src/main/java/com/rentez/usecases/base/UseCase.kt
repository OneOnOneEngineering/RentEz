package com.rentez.usecases.base

import java.lang.RuntimeException

abstract class UseCase<in P,R> {

    @Throws(RuntimeException::class)
    abstract fun execute(parameters:P):R
}