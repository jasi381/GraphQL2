package com.example.graphql2.domain

class GetBootstrapUseCase(
    private val pageQueryClient: BootStrapQueryClient
    ) {
    suspend fun execute(): String {
        return pageQueryClient.countryCode()

    }

}