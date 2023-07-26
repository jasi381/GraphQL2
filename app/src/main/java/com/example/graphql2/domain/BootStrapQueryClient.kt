package com.example.graphql2.domain

interface BootStrapQueryClient {
    suspend fun countryCode(
    ): String?
}