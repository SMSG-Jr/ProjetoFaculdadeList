package com.sergio.projetofacullistagame

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.widget.ImageViewCompat
import com.bumptech.glide.Glide
import com.sergio.projetofacullistagame.fragment.FragmentList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.linearLayoutFragment, FragmentList()).commit()
        val logoPokemon = findViewById<AppCompatImageView>(R.id.imageViewPokeLogo)
        Glide.with(this).load("https://logodownload.org/wp-content/uploads/2017/08/pokemon-logo.png").into(logoPokemon)

    }
}