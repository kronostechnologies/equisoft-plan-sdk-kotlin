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
package com.equisoft.plan.sdk.models


import com.squareup.moshi.Json

/**
 * 
 * @param newFnaUuid UUID of the newly created FNA
 */

data class InlineResponse200Data (
    /* UUID of the newly created FNA */
    @Json(name = "new_fna_uuid")
    val newFnaUuid: kotlin.String? = null
)

