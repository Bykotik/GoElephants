package ru.caravanlabs.elephants.feature.randomizer.data.presentation

data class RandomizerState(
    val isLoading: Boolean,
    val urlImage: String? = null,
    val name: String? = null,
    val description: String? = null
)
