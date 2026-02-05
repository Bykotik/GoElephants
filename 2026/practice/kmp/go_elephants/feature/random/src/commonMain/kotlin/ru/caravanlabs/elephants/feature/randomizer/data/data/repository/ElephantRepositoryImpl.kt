package ru.caravanlabs.elephants.feature.randomizer.data.data.repository

import ru.caravanlabs.elephants.feature.randomizer.data.domain.model.Elephant
import ru.caravanlabs.elephants.feature.randomizer.data.domain.repository.ElephantRepository

class ElephantRepositoryImpl (
):  ElephantRepository  {
    override suspend fun getElephant(): Elephant {
        TODO("Not yet implemented")
    }

    }
