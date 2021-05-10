package com.hllbr.datacollectionv2_lists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Dizilerden daha esnek çalışma koşullarına sahip olan Listeler =
        Array ve ArrayList farkları =
         */


        //Inıtialize %% Defining =
        val myM = ArrayList<String>()//yapımın içerisinde String verilerin depolandmasını istedğimi belirttim Listenin boyutu belirtilmedi bu şekilde eklemeler ve çıkarmalar düzenlemeler yapabilceğim bir esneklik sundu

        //Listemi boş olarak oluşturdum fakat dolu oluşturabilir ve sonradan değerler ekleyebilirim.

        //Listeme değer ekelemk için add metodundan yararlanıyorum

        myM.add("Hllbr")
         //Bu yöntemin dışında  =
        val mMyy = arrayListOf<String>("hllbr","Lars","james")//yöntemide kullanılabilir.
        //Direkt istediğim indexe istediğim veriyi ekleyebilirim
        println(mMyy.size)
        mMyy.add(3,"Kirk")//index ve elementi birlikte kullanıyorum.Bu tanımlamayla birlikte diğer indexlerim sağa doğru kaydırılmış oalcak

        println(mMyy[3])

        println(mMyy.size)//Liste boyutum büyüdü



        val myNumberArrayList = ArrayList<Int>()//Integer olarak ifade etmek bu alanda Kotlin için sıkıntı doğurdu fakat normalde Javada bunu yapmış olsaydım Integer olarak tanımlayacaktım.

        myNumberArrayList.add(1)
        myNumberArrayList.add(200)


        val myMixedList = ArrayList<Any>()

        myMixedList.add(58)
        myMixedList.add("Hllbr")
        myMixedList.add(true)
        println("ArrayList size : "+myMixedList.size)

        println("****************************")
        println(myMixedList[0])
        println("****************************")
        println(myMixedList[1])
        println("****************************")
        println(myMixedList[2])
    }
}