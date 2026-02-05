package ru.caravanlabs.elephants.feature.randomizer.data.presentation

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class RandomizerViewModel {
    private val mutableState = MutableStateFlow( value = RandomizerState(isLoading = false))
    val state = mutableState.asStateFlow()
}