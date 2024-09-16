package com.example.flavourfusionkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform