package com.github.geriabdulmalik23.belajarmvvm.repository

import com.github.geriabdulmalik23.belajarmvvm.entity.Account
import com.github.geriabdulmalik23.belajarmvvm.remote.AccountDataSource

class AccountRepository {
    fun getUserAndPass(): Account {
       return AccountDataSource.getUser()
    }


}