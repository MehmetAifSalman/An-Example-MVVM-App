package com.example.mvvmkullanm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.Log
import androidx.activity.viewModels
import androidx.constraintlayout.helper.widget.Layer
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStore
import com.example.mvvmkullanm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewmodel : MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainActivityNesnesi = this

        viewmodel.sonuc.observe(this)
        {
            binding.hesaplamaSonucu = it
        }


    }

    fun butonToplamaTikle(alinansayi1 : String , alinansayi2: String) {


            viewmodel.toplamaYap(alinansayi1 , alinansayi2)

    }

    fun ButonCarpmacarpma(alinansayi1 : String , alinansayi2: String)
    {
            viewmodel.carpmaYap(alinansayi1 , alinansayi2)

    }
}