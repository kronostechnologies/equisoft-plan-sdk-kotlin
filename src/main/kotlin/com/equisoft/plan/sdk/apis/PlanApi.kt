/**
* Equisoft /plan API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: latest
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.equisoft.plan.sdk.apis


import com.equisoft.plan.sdk.models.CopyFnaResponse
import com.equisoft.plan.sdk.models.ErrorResponse

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

class PlanApi(
    basePath: kotlin.String = defaultBasePath,
    accessToken: String? = null
) : ApiClient(
    basePath,
    accessToken
) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.equisoft.plan.sdk.baseUrl", "http://localhost")
        }
    }

    /**
    * Copy a plan
    * 
    * @param fnaUuid UUID of the FNA to copy 
    * @param userEmail Email of the user to which the FNA copy should be assigned. (optional)
    * @param newParticipantUuids Assign specific uuids to participants of the new fna (optional)
    * @return CopyFnaResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun copyPlan(fnaUuid: kotlin.String, userEmail: kotlin.String?, newParticipantUuids: kotlin.Any?) : CopyFnaResponse {
        val localVariableConfig = copyPlanRequestConfig(fnaUuid = fnaUuid, userEmail = userEmail, newParticipantUuids = newParticipantUuids)

        val localVarResponse = request<CopyFnaResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CopyFnaResponse
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
    * To obtain the request config of the operation copyPlan
    *
    * @param fnaUuid UUID of the FNA to copy 
    * @param userEmail Email of the user to which the FNA copy should be assigned. (optional)
    * @param newParticipantUuids Assign specific uuids to participants of the new fna (optional)
    * @return RequestConfig
    */
    fun copyPlanRequestConfig(fnaUuid: kotlin.String, userEmail: kotlin.String?, newParticipantUuids: kotlin.Any?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("fna-uuid", listOf(fnaUuid.toString()))
                if (userEmail != null) {
                    put("user-email", listOf(userEmail.toString()))
                }
                if (newParticipantUuids != null) {
                    put("new-participant-uuids", listOf(newParticipantUuids.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/fna/api/cmd/fna/copy",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Returns the plan
    * 
    * @param id Fna id 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getPlan(id: kotlin.Int) : Unit {
        val localVariableConfig = getPlanRequestConfig(id = id)

        val localVarResponse = request<Any?>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
    * To obtain the request config of the operation getPlan
    *
    * @param id Fna id 
    * @return RequestConfig
    */
    fun getPlanRequestConfig(id: kotlin.Int) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/fna/api/fna/{id}".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Update client UUID id of an FNA
    * 
    * @param fnaUuid UUID of the FNA 
    * @param clientUuid UUID of the client to update 
    * @param body New UUID of the client 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updatePlanExternalId(fnaUuid: kotlin.String, clientUuid: kotlin.String, body: kotlin.String) : Unit {
        val localVariableConfig = updatePlanExternalIdRequestConfig(fnaUuid = fnaUuid, clientUuid = clientUuid, body = body)

        val localVarResponse = request<Any?>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
    * To obtain the request config of the operation updatePlanExternalId
    *
    * @param fnaUuid UUID of the FNA 
    * @param clientUuid UUID of the client to update 
    * @param body New UUID of the client 
    * @return RequestConfig
    */
    fun updatePlanExternalIdRequestConfig(fnaUuid: kotlin.String, clientUuid: kotlin.String, body: kotlin.String) : RequestConfig {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        val localVariableConfig = RequestConfig(
            method = RequestMethod.PUT,
            path = "/fna/{fna-uuid}/client/{client-uuid}/external-id".replace("{"+"fna-uuid"+"}", "$fnaUuid").replace("{"+"client-uuid"+"}", "$clientUuid"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
