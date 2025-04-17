package com.example.pokedex_interview.network.repository

import com.example.pokedex_interview.model.PokemonDetail
import com.example.pokedex_interview.model.PokemonListItem

class PokemonRepoImp(private val repository: PokemonRepository): PokemonRepository {
    override suspend fun getPokemonList(
        limit: Int,
        offset: Int
    ): List<PokemonListItem> {
        return repository.getPokemonList(limit, offset)
    }

    override suspend fun getPokemonDetail(name: String): PokemonDetail {
        return repository.getPokemonDetail(name)
    }
}