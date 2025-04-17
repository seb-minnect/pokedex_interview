package com.example.pokedex_interview.model

// This is just a starting point - you'll need to expand this based on what you need
data class PokemonDetail(
    val id: Int,
    val name: String,
    val height: Int,
    val weight: Int,
    val types: List<TypeResponse>,
    val stats: List<StatResponse>,
    val sprites: Sprites
    // Add other fields you want to use
)

data class TypeResponse(
    val slot: Int,
    val type: Type
)

data class Type(
    val name: String,
    val url: String
)

data class StatResponse(
    val base_stat: Int,
    val effort: Int,
    val stat: Stat
)

data class Stat(
    val name: String,
    val url: String
)

data class Sprites(
    val front_default: String,
    val back_default: String?
    // Add other sprite fields as needed
)