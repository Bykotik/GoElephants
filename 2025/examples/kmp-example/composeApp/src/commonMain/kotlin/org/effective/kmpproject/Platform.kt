package org.effective.kmpproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
