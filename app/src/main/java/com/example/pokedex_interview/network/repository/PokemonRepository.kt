package com.example.pokedex_interview.network.repository

import com.example.pokedex_interview.model.PokemonDetail
import com.example.pokedex_interview.model.PokemonListItem
import com.example.pokedex_interview.network.PokemonApiService

interface PokemonRepository {
    suspend fun getPokemonList(limit: Int, offset: Int): List<PokemonListItem>
    suspend fun getPokemonDetail(name: String): PokemonDetail
}