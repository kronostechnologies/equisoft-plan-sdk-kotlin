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

import com.equisoft.plan.sdk.models.UsersUser

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param userType 
 * @param name 
 * @param email 
 * @param isAdmin 
 * @param isActive 
 */

data class UsersUserContext (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "userType")
    val userType: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "email")
    val email: kotlin.String,

    @Json(name = "isAdmin")
    val isAdmin: kotlin.Boolean,

    @Json(name = "isActive")
    val isActive: kotlin.Boolean

)
