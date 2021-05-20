package com.sergio.projetofacullistagame.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sergio.projetofacullistagame.R
import com.sergio.projetofacullistagame.model.entity.Pokemon

class PokemonListAdapter(private val list: List<Pokemon>) : RecyclerView.Adapter<PokemonListAdapter.PokemonListHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonListHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_pokemon, parent, false)
        return PokemonListHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PokemonListHolder, position: Int) {
        val pokemon = list[position]
        holder.set(pokemon)
    }

    class PokemonListHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val imagePokemon = itemView.findViewById<AppCompatImageView>(R.id.imageViewSprite)
        val numberPokemon = itemView.findViewById<AppCompatTextView>(R.id.textViewPokemonNumber)
        val namePokemon = itemView.findViewById<AppCompatTextView>(R.id.textViewPokemonName)
        val pokemonType1 = itemView.findViewById<AppCompatTextView>(R.id.textViewType1)
        val pokemonType2 = itemView.findViewById<AppCompatTextView>(R.id.textViewType2)

        fun set(pokemon: Pokemon) {
            Glide.with(itemView.context).load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${pokemon.number}.png").into(imagePokemon)
            numberPokemon.text = "#${pokemon.number}"
            namePokemon.text = pokemon.name
            pokemonType1.text = pokemon.type1
            pokemonType2.text = pokemon.type2
        }


    }
}