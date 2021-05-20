package com.sergio.projetofacullistagame.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.sergio.projetofacullistagame.R
import com.sergio.projetofacullistagame.adapter.PokemonListAdapter
import com.sergio.projetofacullistagame.db.AppDatabase
import com.sergio.projetofacullistagame.model.entity.Pokemon

class FragmentList : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val db = Room.databaseBuilder(
            requireContext(),
            AppDatabase::class.java, "pokemon"
        ).build()

        Thread {
            val pokemons = db.pokemonDao().getAll()
            if (view is RecyclerView) {
                with(view) {
                    layoutManager = LinearLayoutManager(context)
                    adapter = PokemonListAdapter(pokemons)
                }
            }
        }.start()

        // Set the adapter

        return view
    }

    private fun salvaPokemons(db: AppDatabase) {
        Thread {
            db.pokemonDao().insertAll(
                Pokemon(1, "bulbasaur", "Grass", "Poison", "1"),
                Pokemon(2, "ivysaur", "Grass", "Poison", "2"),
                Pokemon(3, "venusaur", "Grass", "Poison", "3"),
                Pokemon(4, "charmander", "Fire", "", "4"),
                Pokemon(5, "charmeleon", "Fire", "", "5"),
                Pokemon(6, "charizard", "Fire", "Flying", "6"),
                Pokemon(7, "squirtle", "Water", "", "7"),
                Pokemon(8, "wartortle", "Water", "", "8"),
                Pokemon(9, "blastoise", "Water", "", "9")
            )
        }.start()
    }
}
