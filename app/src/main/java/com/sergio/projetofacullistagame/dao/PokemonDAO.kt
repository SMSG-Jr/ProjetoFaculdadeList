package com.sergio.projetofacullistagame.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.sergio.projetofacullistagame.model.entity.Pokemon

@Dao
interface PokemonDAO {

    @Query("SELECT * FROM Pokemon")
    fun getAll(): List<Pokemon>

    @Insert
    fun insertAll(vararg pokemons: Pokemon)
}