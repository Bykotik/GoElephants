package ru.caravanlabs.elephants.feature.randomizer.data.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ElephantDto(
    @SerialName("id") val id:Int,
    @SerialName("name") val name:String,
    @SerialName("description") val description:String,
    @SerialName("image_url") val imageUrl:String
)
