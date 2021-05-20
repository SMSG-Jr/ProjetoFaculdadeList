package com.sergio.projetofacullistagame.db

import com.sergio.projetofacullistagame.model.entity.Pokemon
import androidx.room.Database
import androidx.room.RoomDatabase
import com.sergio.projetofacullistagame.dao.PokemonDAO

@Database(entities = [Pokemon::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun pokemonDao(): PokemonDAO
}