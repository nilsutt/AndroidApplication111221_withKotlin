package com.example.androidapplication111221_withkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        processIf()
        processArrayList()
        processMultiTypeList()

//        var sayi: String = "5"
//        var sonuc = sayi.toInt() * 10

        Log.i("Liste toplama sonucu", toplama(5, 1).toString())

        var name = "Murat Karabulut"
        Log.i("Liste string işlemleri", name.uppercase())
        Log.i("Liste string işlemleri", name.lowercase())
        Log.i("Liste string işlemleri", name.plus("Derste"))
        Log.i("Liste string işlemleri", name.get(3).toString())
        Log.i("Liste string işlemleri", name.substring(6, 8))

        var splitName = name.split(" ").toTypedArray()
        Log.i("Liste split", splitName.get(0) + " ---- " + splitName.get(1))
        var nameSplit = splitName.get(0).substring(0, 1) //splitName.get(0).get(0)
        var surnameSplit = splitName.get(1).substring(0, 1)

        Log.i("Liste adım", nameSplit + "****")
        Log.i("Liste soyadım", surnameSplit + "****")

        //bir sayı listesi olsun sayı listesini gezelim çift olanlara çift tek olanlara tek yazsın bir fonksiyon içinde yazalım
        findEvenOrOdd()
        filter()


    }



    fun processIf(){

        val dersVarmi: Boolean = true
        if(dersVarmi){
            Toast.makeText( this, "Ders var", Toast.LENGTH_LONG).show()

        }
        else{
            Toast.makeText( this, "Ders var mı yok mu belli değil", Toast.LENGTH_LONG).show()
        }

    }

    fun processArrayList() {
        var liste: ArrayList<String> = arrayListOf()
        liste.add("Ahmet")
        liste.add("Mehmet")
        liste.add("Ayse")

//            print(liste.get(1))
//
//            Log.i("Liste elemen", liste.last())
//            Log.i("Liste elemen", liste.first())
//            Log.i("Liste elemen", liste.size.toString())

        liste.forEach { isimler ->
            Log.i("liste x", isimler)
            //Toast.makeText(this, it, Toast.LENGTH_SHORT).show()}

        }
    }

    fun processMultiTypeList(){
        var allTypeList: ArrayList<Any> = arrayListOf()
        allTypeList.add("Ahmet")
        allTypeList.add(45)
        allTypeList.add(0.0)
    }

    fun toplama(ilkSayi: Any, ikinciSayi: Int) : Int{
        return ilkSayi as Int + ikinciSayi
    }

    fun findEvenOrOdd(){
        var liste: ArrayList<Int> = arrayListOf()
        for (x in 0..10){
            liste.add(x)
        }

        liste.forEach{
            when(it % 2){
                0 -> {
                    Log.i("Liste çifttir. ", it.toString())
                }
                1 -> {
                    Log.i("Liste tektir. ", it.toString())
                }
            }
        }

    }

    fun filter(){
        var cityList: ArrayList<String> = arrayListOf()
        cityList.add("İzmir")
        cityList.add("Malatya")
        cityList.add("Sivas")
        cityList.add("İstanbul")

        var cityTempList: ArrayList<String> = arrayListOf()
        cityList.filter { cityName -> cityName == "İstanbul" }.forEach{ filterlast ->
            cityTempList.add(filterlast)

        }
        Log.i("Liste size", cityList.filter {cityName -> cityName == "İstanbul"}.size.toString())
        cityTempList.forEach{
            Log.i("Liste Şehir", it)
        }

    }


}
