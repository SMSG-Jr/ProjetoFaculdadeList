package com.sergio.projetofacullistagame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sergio.projetofacullistagame.adapter.PokemonListAdapter
import com.sergio.projetofacullistagame.model.PokemonData


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //supportFragmentManager.beginTransaction().replace(R.id.list_fragment, FragmentList()).commit()

        val pokemons = arrayListOf<PokemonData>()
        pokemons.add(PokemonData("bulbasaur","Grass","Poison","1"))
        pokemons.add(PokemonData("ivysaur","Grass","Poison","2"))
        pokemons.add(PokemonData("venusaur","Grass","Poison","3"))
        pokemons.add(PokemonData("charmander","Fire","","4"))
        pokemons.add(PokemonData("charmeleon","Fire","","5"))
        pokemons.add(PokemonData("charizard","Fire","Flying","6"))
        pokemons.add(PokemonData("squirtle","Water","","7"))
        pokemons.add(PokemonData("wartortle","Water","","8"))
        pokemons.add(PokemonData("blastoise","Water","","9"))
        val pokemonList = findViewById<RecyclerView>(R.id.recyclerListPokemon)
        pokemonList.layoutManager = LinearLayoutManager(this)
        pokemonList.adapter = PokemonListAdapter(pokemons)

    }
}