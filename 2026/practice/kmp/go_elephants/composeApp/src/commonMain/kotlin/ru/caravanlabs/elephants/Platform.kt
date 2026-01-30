package ru.caravanlabs.elephants

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform