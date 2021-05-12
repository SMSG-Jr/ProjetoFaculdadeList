package com.sergio.projetofacullistagame.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sergio.projetofacullistagame.R
import com.sergio.projetofacullistagame.adapter.PokemonListAdapter
import com.sergio.projetofacullistagame.model.PokemonData

class FragmentList : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

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

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = PokemonListAdapter(pokemons)
            }
        }
        return view
    }
}
