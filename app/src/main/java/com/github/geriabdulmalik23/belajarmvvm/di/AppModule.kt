package com.github.geriabdulmalik23.belajarmvvm.di

import com.github.geriabdulmalik23.belajarmvvm.repository.AccountRepository
import com.github.geriabdulmalik23.belajarmvvm.viewmodel.AccountViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    fun accountRepository() = AccountRepository()

    @Provides
    fun accountViewModel() = AccountViewModel(accountRepository())
}