package com.example.pokedex_interview

import com.example.pokedex_interview.network.repository.PokemonRepoImp
import com.example.pokedex_interview.network.repository.PokemonRepository
import com.example.pokedex_interview.viewmodel.PokemonViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    single<PokemonRepository> { PokemonRepoImp(get()) }
    viewModel { PokemonViewModel(get()) }
}
