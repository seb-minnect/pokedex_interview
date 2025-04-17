package com.example.pokedex_interview.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedex_interview.model.PokemonDetail
import com.example.pokedex_interview.model.PokemonListItem
import com.example.pokedex_interview.network.repository.PokemonRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PokemonViewModel(private val repository: PokemonRepository) : ViewModel() {

    // State holders
    private val _pokemonList = MutableStateFlow<List<PokemonListItem>>(emptyList())
    val pokemonList: StateFlow<List<PokemonListItem>> = _pokemonList

    private val _selectedPokemon = MutableStateFlow<PokemonDetail?>(null)
    val selectedPokemon: StateFlow<PokemonDetail?> = _selectedPokemon

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error

    // Functions to implement:
    fun loadPokemonList(limit: Int = 20, offset: Int = 0) {
        // TODO: Implement this function to load the Pokemon list
    }

    fun getPokemonDetail(name: String) {
        // TODO: Implement this function to get details for a specific Pokemon
    }
}