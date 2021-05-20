package com.sergio.projetofacullistagame.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Pokemon (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name : String,
    @ColumnInfo(name = "type_one") val type1 : String,
    @ColumnInfo(name = "type_two") val type2 : String,
    @ColumnInfo (name = "number" ) val number : String
)



