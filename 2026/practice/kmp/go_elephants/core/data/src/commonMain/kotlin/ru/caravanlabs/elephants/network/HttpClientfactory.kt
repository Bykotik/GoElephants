package ru.caravanlabs.elephants.network

import io.ktor.client.HttpClient

interface HttpClientFactory {
    override fun create(): HttpClient {
        return HttpClientConfig.configureClient(
            HttpClient(OkHttp) {
                engine {
                    config {
                        // Android-specific OkHttp configuration if needed
                        retryOnConnectionFailure(true)
                    }
                }
            }
        )
    }
}