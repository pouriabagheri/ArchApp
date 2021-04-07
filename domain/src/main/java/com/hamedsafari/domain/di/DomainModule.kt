package com.hamedsafari.domain.di

import com.hamedsafari.domain.usecase.detail.GetUserDetailUseCase
import com.hamedsafari.domain.usecase.home.GetTopUsersUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { GetTopUsersUseCase(get()) }
    factory { GetUserDetailUseCase(get()) }
}