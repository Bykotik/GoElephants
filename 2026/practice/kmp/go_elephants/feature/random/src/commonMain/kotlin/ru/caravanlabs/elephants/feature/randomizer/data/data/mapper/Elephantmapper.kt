package ru.caravanlabs.elephants.feature.randomizer.data.data.mapper

import ru.caravanlabs.elephants.feature.randomizer.data.data.model.ElephantDto
import ru.caravanlabs.elephants.feature.randomizer.data.domain.model.Elephant

fun ElephantMapper(dto: ElephantDto): Elephant {
    return Elephant(
        name = dto.name,
        description = dto.description,
        url = dto.imageUrl
    )
}