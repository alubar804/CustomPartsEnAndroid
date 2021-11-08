package com.example.customparts

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.*

class ControladorVoto : LinearLayout {
    private var votar: Button? = null
    private var estrellas: RatingBar? = null
    private var barra: SeekBar? = null
    private var list_peliculas: Spinner? = null
    val _datos = arrayOf("Scarface", "Titanic", "Pretty Woman", "Star Wars", "El rey León", "E.T")

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    private fun init(context: Context) {
        val infService = Context.LAYOUT_INFLATER_SERVICE
        val mi_li = getContext().getSystemService(infService) as LayoutInflater
        mi_li.inflate(R.layout.compost_voto, this, true)
        votar = findViewById<View>(R.id.votar) as Button
        estrellas = findViewById<View>(R.id.estrellas) as RatingBar
        barra = findViewById<View>(R.id.barra) as SeekBar
        list_peliculas = findViewById<View>(R.id.list_peliculas) as Spinner
        barra!!.max = 100
        val adaptador = ArrayAdapter(context, android.R.layout.simple_spinner_item, _datos)
        list_peliculas!!.adapter = adaptador
    }
}