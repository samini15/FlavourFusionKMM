package com.example.flavourfusionkmm.recipe.data.local

import androidx.room.Entity

@Entity
data class Recipe(
    val id: String,
    val name: String
)
