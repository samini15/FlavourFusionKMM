package com.example.flavourfusionkmm.recipe.data.remote

import io.ktor.client.HttpClient

expect class HttpClientFactory {
    fun create(): HttpClient
}