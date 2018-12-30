package com.duygu.recyclerviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = Adapter(getModels())
    }

    fun getModels(): MutableList<CountryModel> {

        val models = mutableListOf(
            CountryModel(R.drawable.cin, "Çin", "Pekin"),
            CountryModel(R.drawable.misir, "Mısır", "Kahire"),
            CountryModel(R.drawable.almanya, "Almanya", "Berlin"),
            CountryModel(R.drawable.turkey, "Türkiye", "Ankara"),
            CountryModel(R.drawable.rusya, "Rusya", "Moskova"),
            CountryModel(R.drawable.ingiltere, "İngiltere", "Londra"),
            CountryModel(R.drawable.ukrayna, "Ukrayna", "Kiev"),
            CountryModel(R.drawable.japonya, "Japonya", "Tokyo")

        )


        return models


    }


}

