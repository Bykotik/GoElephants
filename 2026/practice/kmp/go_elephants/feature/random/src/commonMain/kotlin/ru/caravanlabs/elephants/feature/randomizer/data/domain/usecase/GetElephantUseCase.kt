package ru.caravanlabs.elephants.feature.randomizer.data.domain.usecase

import ru.caravanlabs.elephants.feature.randomizer.data.domain.model.Elephant

interface GetElephantUseCase {
    suspend fun invoke(): Elephant
}