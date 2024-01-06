package com.example.mvvmkullanm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    var sonuc = MutableLiveData("0")
    var mrepo = MatematikRepository()

    fun toplamaYap(alinansayi1 : String , alinansayi2: String) {

        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value = mrepo.toplamaYap(alinansayi1 , alinansayi2)
        }

    }

    fun carpmaYap(alinansayi1 : String , alinansayi2: String)
    {

        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value = mrepo.carpmaYap(alinansayi1 , alinansayi2)
        }

    }


}