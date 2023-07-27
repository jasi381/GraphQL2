package com.example.graphql2.data

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.Optional
import com.example.graphql2.domain.BootStrapQueryClient
import com.example.type.Device

class ApolloModuleClient(
    private val apolloClient: ApolloClient
) : BootStrapQueryClient {
    override suspend fun countryCode(): String {


        return apolloClient
            .query(com.example.BootStrapQuery(Device.ANDROID, siteId = Optional.present("msndev")))
            .execute()
            .data?.bootstrap?.countryCode.toString()
    }

}