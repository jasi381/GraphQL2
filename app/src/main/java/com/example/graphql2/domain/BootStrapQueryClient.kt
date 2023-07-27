package com.example.graphql2.domain

interface BootStrapQueryClient {
    suspend fun countryCode(
    ): String

//    suspend fun ErrorMessages(
//    ): List<ErrorMessage>
}