/**
 * Equisoft /plan API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.equisoft.plan.sdk

import com.equisoft.plan.sdk.models.ErrorResponse
import com.equisoft.plan.sdk.models.OrganizationsListOrganizationsResponse
import com.equisoft.plan.sdk.models.OrganizationsOrganization
import com.equisoft.plan.sdk.models.UsersListUsersResponse

import com.equisoft.plan.sdk.infrastructure.ApiClient
import com.equisoft.plan.sdk.infrastructure.ClientException
import com.equisoft.plan.sdk.infrastructure.ClientError
import com.equisoft.plan.sdk.infrastructure.ServerException
import com.equisoft.plan.sdk.infrastructure.ServerError
import com.equisoft.plan.sdk.infrastructure.MultiValueMap
import com.equisoft.plan.sdk.infrastructure.RequestConfig
import com.equisoft.plan.sdk.infrastructure.RequestMethod
import com.equisoft.plan.sdk.infrastructure.ResponseType
import com.equisoft.plan.sdk.infrastructure.Success
import com.equisoft.plan.sdk.infrastructure.toMultiValue

class OrganizationsApi(
    basePath: kotlin.String = defaultBasePath,
    accessToken: String? = null
) : ApiClient(basePath, accessToken) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.equisoft.plan.sdk.baseUrl", "http://localhost")
        }
    }

    /**
    * 
    * 
    * @param id  
    * @return OrganizationsOrganization
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getOrganization(id: kotlin.Int) : OrganizationsOrganization {
        val localVariableConfig = getOrganizationRequestConfig(id = id)

        val localVarResponse = request<Unit, OrganizationsOrganization>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as OrganizationsOrganization
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation getOrganization
    *
    * @param id  
    * @return RequestConfig
    */
    fun getOrganizationRequestConfig(id: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/fna/api/v2/organizations/{id}".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * 
    * 
    * @param id  
    * @return UsersListUsersResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listOrganizationUsers(id: kotlin.Int) : UsersListUsersResponse {
        val localVariableConfig = listOrganizationUsersRequestConfig(id = id)

        val localVarResponse = request<Unit, UsersListUsersResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsersListUsersResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation listOrganizationUsers
    *
    * @param id  
    * @return RequestConfig
    */
    fun listOrganizationUsersRequestConfig(id: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/fna/api/v2/organizations/{id}/users".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * 
    * 
    * @param organizationUuid  
    * @return OrganizationsListOrganizationsResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listOrganizations(organizationUuid: kotlin.String) : OrganizationsListOrganizationsResponse {
        val localVariableConfig = listOrganizationsRequestConfig(organizationUuid = organizationUuid)

        val localVarResponse = request<Unit, OrganizationsListOrganizationsResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as OrganizationsListOrganizationsResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation listOrganizations
    *
    * @param organizationUuid  
    * @return RequestConfig
    */
    fun listOrganizationsRequestConfig(organizationUuid: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("organizationUuid", listOf(organizationUuid.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/fna/api/v2/organizations",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
