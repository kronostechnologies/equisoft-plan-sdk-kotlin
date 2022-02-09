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

import com.equisoft.plan.sdk.models.PlansPlan

import com.squareup.moshi.Json

/**
 * 
 * @param plans 
 * @param createPlanUrl 
 */

data class PlansListPlansResponse (
    @Json(name = "plans")
    val plans: kotlin.collections.List<PlansPlan>,
    @Json(name = "createPlanUrl")
    val createPlanUrl: kotlin.String
)
