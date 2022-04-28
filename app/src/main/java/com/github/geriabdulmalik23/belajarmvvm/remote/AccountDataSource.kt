package com.github.geriabdulmalik23.belajarmvvm.remote

import com.github.geriabdulmalik23.belajarmvvm.entity.Account

object AccountDataSource {
    fun getUser() = Account(username = "geri", password = "123",name = "Geri Abdul Malik")
}