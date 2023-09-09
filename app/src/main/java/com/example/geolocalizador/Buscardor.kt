package com.example.geolocalizador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Buscardor : AppCompatActivity() {
    val refri= listOf<Refris>(Refris(-1, "Refri pro","Wrande","Verde",
    "C. Sanhedun, 110, 29006 Málaga, España",
        "https://i5.walmartimages.com.mx/mg/gm/1p/images/product-images/img_large/00801770909660l.jpg?odnHeight=612&odnWidth=612&odnBg=FFFFFF"));
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscardor)
    }
}