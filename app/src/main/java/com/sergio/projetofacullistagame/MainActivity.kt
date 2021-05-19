package com.sergio.projetofacullistagame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide
import com.sergio.projetofacullistagame.fragment.FragmentList

class MainActivity : AppCompatActivity() {
    private val HEADER_IMAGE: String = "https://logodownload.org/wp-content/uploads/2017/08/pokemon-logo.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.linearLayoutFragment, FragmentList()).commit()
        val logoPokemon = findViewById<AppCompatImageView>(R.id.imageViewPokeLogo)
        Glide.with(this).load(HEADER_IMAGE).into(logoPokemon)

    }
}