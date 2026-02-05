package ru.caravanlabs.elephants.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

/*
* Common configuration for HttpClient
*/
object HttpClientConfig {
    /*
    * Configures the HttpClient with common settings
    * @param httpClient The HttpClient to configure
    * @return Configured HttpClient
    */
    fun configureClient(httpClient: HttpClient): HttpClient {
        return httpClient.config {
            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }
            /*
            install(Logging) {
                logger = object : Logger {
                    override fun log(message: String) {
                        Napier.d(message = message, tag = "HttpClient")
                    }
                }
                level = LogLevel.ALL
            }
             */
        }
    }
}