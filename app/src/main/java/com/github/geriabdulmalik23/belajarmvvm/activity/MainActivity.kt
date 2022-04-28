package com.github.geriabdulmalik23.belajarmvvm.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.geriabdulmalik23.belajarmvvm.databinding.ActivityMainBinding
import com.github.geriabdulmalik23.belajarmvvm.viewmodel.AccountViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mViewModel: AccountViewModel
    private lateinit var mViewBinding: ActivityMainBinding
    val binding: ActivityMainBinding
        get() = mViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            Toast.makeText(
                this, mViewModel.getUser(
                    username = binding.etUsername.text.toString(),
                    password = binding.etPassword.text.toString()
                ), Toast.LENGTH_SHORT
            ).show()
        }
    }
}