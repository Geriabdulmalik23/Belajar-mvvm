package com.github.geriabdulmalik23.belajarmvvm.viewmodel

import com.github.geriabdulmalik23.belajarmvvm.repository.AccountRepository
import javax.inject.Inject

class AccountViewModel @Inject constructor(private val accountRepository: AccountRepository) {
    fun getUser(username: String, password: String): String {
        if (username == accountRepository.getUserAndPass().username && password == accountRepository.getUserAndPass().password) return "Berhasil Login"
        else return "LOgin Gagal"
    }
}