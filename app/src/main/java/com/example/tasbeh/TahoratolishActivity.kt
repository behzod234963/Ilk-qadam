package com.example.tasbeh

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tasbeh.adapter.TahoratAdapter
import com.example.tasbeh.model.TahoratModel

class TahoratolishActivity: AppCompatActivity() {

    lateinit var tahoratList:ArrayList<TahoratModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahoratolish)

        initView()

    }

    private fun initView() {
        loadItem()
        val rvTahorat=findViewById<RecyclerView>(R.id.rv_Tahorat_Olish)
        rvTahorat.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvTahorat.adapter=TahoratAdapter(tahoratList)

    }

    private fun loadItem() {

        tahoratList=ArrayList()
        tahoratList.add(TahoratModel("1.Niyat qilish",
            R.drawable.pic_itemimage1_tahorat,
            "Tahorat qilish uchun,iloji bo'lsa qiblaga yuzlaniladi.\"Bismillahir rohmanir rohiym\"deb,niyat qilinadi"))
        tahoratList.add(TahoratModel("2.Qo'llarni yuvish",
            R.drawable.pic_itemimage2_tahorat,
            "Qo'llar bandigacha uch marta yuviladi.Barmog'ida uzugi borlar uni qimirlatib ostiga suv yetkazadi.Barmoqlarni bir-biriga kirgiziladi."))
        tahoratList.add(TahoratModel("3.Og'iz chayish",
            R.drawable.pic_itemimage3_tahorat,
            "Tishlar misvoq yoki tish yuvish pastasi bilan yoki qo'l bilan ishqalab yuviladi.O'ng qo'lga suv olib og'iz uch marta g'ar-g'ara qilib chayiladi."))
        tahoratList.add(TahoratModel("4.Burunni chayish",
            R.drawable.pic_itemimage4_tahorat,
            "O'ng qo'lga suv olib,burunga uch marta tortib,chap qo'l bilan qoqib tozalanadi."))
        tahoratList.add(TahoratModel("5.Yuzni yuvish",
            R.drawable.pic_itemimage5_tahorat,
            "Yuz uch marta yuviladi.Yuzning chegarasi uzunasiga soch chiqqan joydan jag'ning ostigacha,kengligi esa ikki quloq yumshog'ining orasigacha bo'lgan o'rindir."))
        tahoratList.add(TahoratModel("6.Qo'llarni tirsakgacha yuvish",
            R.drawable.pic_itemimage6_tahorat,
            "Avval o'ng qo'l keyin chap qo'l tirsak bilan qo'shib yuviladi."))
        tahoratList.add(TahoratModel("7.Masx tortish",
            R.drawable.pic_itemimage7_tahorat,
            "Xovuchga suv olib to'kib tashlab,qo'l bilan boshning hamma qismiga masx tortiladi.\nKo'rsatkich barmoq bilan quloqning ichiga masx tortib,bosh barmoq bilan esa quloq tashqarisiga masx tortiladi."))
        tahoratList.add(TahoratModel("8.Oyoqlarni yuvish",
            R.drawable.pic_itemimage8_tahorat,
            "Chap qo'l bilan o'ng oyoqni oshiq (to'piq) bilan qo'shib va barmoqlar orasini (ishqalab) uch marta yuviladi.\nChap oyoq ham shu tarzda uch marta yuviladi."))
        tahoratList.add(TahoratModel("9.Duo",
            R.drawable.pic_itemimage9_tahorat,
            "Tahorat qilib bo'lgandan keyin shahodat kalimasini va rivoyatda kelgan duo o'qiladi:\nAshhadu allaa ilaaha illallohu vahdahu laa shariyka lahu.Va ashhadu anna Muhammadan abduhu va Rasuluhu.\nDuo: Allohummaj'alnii minat-tavvabiyna vaj'alnii minal mutatohhiriyn."))

    }
}