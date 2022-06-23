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
import com.equisoft.plan.sdk.models.UsersUser
import com.equisoft.plan.sdk.models.UsersUserContext

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

class UsersApi(
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
    * @return UsersUser
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getUser(id: kotlin.Int) : UsersUser {
        val localVariableConfig = getUserRequestConfig(id = id)

        val localVarResponse = request<Unit, UsersUser>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsersUser
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
    * To obtain the request config of the operation getUser
    *
    * @param id  
    * @return RequestConfig
    */
    fun getUserRequestConfig(id: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/fna/api/v2/users/{id}".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * 
    * 
    * @return UsersUserContext
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getUserContext() : UsersUserContext {
        val localVariableConfig = getUserContextRequestConfig()

        val localVarResponse = request<Unit, UsersUserContext>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsersUserContext
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
    * To obtain the request config of the operation getUserContext
    *
    * @return RequestConfig
    */
    fun getUserContextRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/fna/api/v2/userContext",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
