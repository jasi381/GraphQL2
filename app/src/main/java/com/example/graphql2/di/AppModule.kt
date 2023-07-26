package com.example.graphql2.di

import com.apollographql.apollo3.ApolloClient
import com.example.graphql2.data.ApolloModuleClient
import com.example.graphql2.domain.BootStrapQueryClient
import com.example.graphql2.domain.GetBootstrapUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesApolloClient(): ApolloClient {
        return ApolloClient.Builder()
            .serverUrl("https://api.develop.monumentalsportsnetwork.com/graphql")
            .build()
    }

    @Provides
    @Singleton
    fun providesBootStrapQueryClient(apolloClient: ApolloClient): BootStrapQueryClient {
        return ApolloModuleClient(apolloClient)
    }

    @Provides
    @Singleton
    fun providesBootStrapQueryUseCase(bootStrapQueryClient: BootStrapQueryClient): GetBootstrapUseCase {
        return GetBootstrapUseCase(bootStrapQueryClient)
    }
}