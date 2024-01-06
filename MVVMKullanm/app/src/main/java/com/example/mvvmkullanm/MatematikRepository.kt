package com.example.mvvmkullanm

class MatematikRepository {

    var MDS = MatematikDataSource()



    suspend fun toplamaYap(alinansayi1 : String , alinansayi2: String) : String = MDS.toplamaYap(alinansayi1,alinansayi2)


    suspend fun carpmaYap(alinansayi1 : String , alinansayi2: String) : String =  MDS.carpmaYap(alinansayi1,alinansayi2)

}