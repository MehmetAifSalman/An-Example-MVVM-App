package com.example.mvvmkullanm

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MatematikDataSource {


    suspend fun toplamaYap(alinansayi1 : String , alinansayi2: String) : String =
        withContext(Dispatchers.IO){
            val sayi1 = alinansayi1.toInt()
            val sayi2 = alinansayi2.toInt()
            val toplam = sayi1 + sayi2

            return@withContext toplam.toString()
        }

    suspend fun carpmaYap(alinansayi1 : String , alinansayi2: String) : String =

        withContext(Dispatchers.IO){
            val sayi1 = alinansayi1.toInt()
            val sayi2 = alinansayi2.toInt()
            val toplam = sayi1 * sayi2
            Log.e("carpa" , toplam.toString())

            return@withContext toplam.toString()

        }

}