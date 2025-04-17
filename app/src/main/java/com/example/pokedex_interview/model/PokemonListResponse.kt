package com.example.pokedex_interview.model

data class PokemonListResponse(
    val results: List<PokemonListItem>,
    val count: Int,
    val next: String?,
    val previous: String?
)

data class PokemonListItem(
    val name: String,
    val url: String
) {
    // Helper function to extract Pokemon ID from the URL
    fun getImageUrl(): String {
        val id = url.split("/").dropLast(1).last()
        return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$id.png"
    }
}