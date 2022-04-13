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

package com.equisoft.plan.sdk.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param fnaUuid Uuid of the fna to copy
 * @param userEmail Email of the user to which the new FNA should be assigned, default to owner of the FNA
 * @param newParticipantUuids Array of participant UUIDs to modify
 */

data class CmdCopyFNA (

    /* Uuid of the fna to copy */
    @Json(name = "fnaUuid")
    val fnaUuid: kotlin.String,

    /* Email of the user to which the new FNA should be assigned, default to owner of the FNA */
    @Json(name = "userEmail")
    val userEmail: kotlin.String? = null,

    /* Array of participant UUIDs to modify */
    @Json(name = "newParticipantUuids")
    val newParticipantUuids: kotlin.collections.Map<kotlin.String, kotlin.String>? = null

)

