package ru.caravanlabs.elephants.feature.randomizer.data.domain.repository

import ru.caravanlabs.elephants.feature.randomizer.data.domain.model.Elephant

interface ElephantRepository {
    suspend fun getElephant(): Elephant
}