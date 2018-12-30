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

    fun getModels(): MutableList<Model> {

        val models = mutableListOf(
            Model(R.drawable.cin, "Çin", "Pekin"),
            Model(R.drawable.misir, "Mısır", "Kahire"),
            Model(R.drawable.almanya, "Almanya", "Berlin"),
            Model(R.drawable.turkey, "Türkiye", "Ankara"),
            Model(R.drawable.rusya, "Rusya", "Moskova"),
            Model(R.drawable.ingiltere, "İngiltere", "Londra"),
            Model(R.drawable.ukrayna, "Ukrayna", "Kiev"),
         //   Model(R.drawable.abd, "ABD", "Washington DC"),
            Model(R.drawable.japonya, "Japonya", "Tokyo")

        )


        return models


    }


}

