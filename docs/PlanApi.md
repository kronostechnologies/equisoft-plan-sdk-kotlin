# PlanApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyPlan**](PlanApi.md#copyPlan) | **POST** /fna/api/cmd/fna/copy | Copy a plan
[**getPlan**](PlanApi.md#getPlan) | **GET** /fna/api/fna/{id} | Returns the plan
[**updatePlanExternalId**](PlanApi.md#updatePlanExternalId) | **PUT** /fna/{fna-uuid}/client/{client-uuid}/external-id | Update client UUID id of an FNA


<a name="copyPlan"></a>
# **copyPlan**
> CopyFnaResponse copyPlan(fnaUuid, userEmail, newParticipantUuids)

Copy a plan

### Example
```kotlin
// Import classes:
//import com.equisoft.plan.sdk.infrastructure.*
//import com.equisoft.plan.sdk.models.*

val apiInstance = PlanApi()
val fnaUuid : kotlin.String = 8a135829-0d9a-4104-9a95-1fe2871cb82f // kotlin.String | UUID of the FNA to copy
val userEmail : kotlin.String = plan@equisoft.com // kotlin.String | Email of the user to which the FNA copy should be assigned.
val newParticipantUuids : kotlin.Any = {"participant-old-uuid":"participant-new-uuid","5fe2ce28-9834-4f8a-811e-1192b91cf18c":"444e03d3-ad35-4824-97cc-6c5558d2ea7e"} // kotlin.Any | Assign specific uuids to participants of the new fna
try {
    val result : CopyFnaResponse = apiInstance.copyPlan(fnaUuid, userEmail, newParticipantUuids)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlanApi#copyPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlanApi#copyPlan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fnaUuid** | **kotlin.String**| UUID of the FNA to copy |
 **userEmail** | **kotlin.String**| Email of the user to which the FNA copy should be assigned. | [optional]
 **newParticipantUuids** | [**kotlin.Any**](.md)| Assign specific uuids to participants of the new fna | [optional]

### Return type

[**CopyFnaResponse**](CopyFnaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPlan"></a>
# **getPlan**
> getPlan(id)

Returns the plan

### Example
```kotlin
// Import classes:
//import com.equisoft.plan.sdk.infrastructure.*
//import com.equisoft.plan.sdk.models.*

val apiInstance = PlanApi()
val id : kotlin.Int = 56 // kotlin.Int | Fna id
try {
    apiInstance.getPlan(id)
} catch (e: ClientException) {
    println("4xx response calling PlanApi#getPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlanApi#getPlan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Fna id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePlanExternalId"></a>
# **updatePlanExternalId**
> updatePlanExternalId(fnaUuid, clientUuid, body)

Update client UUID id of an FNA

### Example
```kotlin
// Import classes:
//import com.equisoft.plan.sdk.infrastructure.*
//import com.equisoft.plan.sdk.models.*

val apiInstance = PlanApi()
val fnaUuid : kotlin.String = 8a135829-0d9a-4104-9a95-1fe2871cb82f // kotlin.String | UUID of the FNA
val clientUuid : kotlin.String = ca59ed78-b35b-4390-98f9-309d421e5bb0 // kotlin.String | UUID of the client to update
val body : kotlin.String = 99048189-1b66-428f-9a0b-e0996c959f72 // kotlin.String | New UUID of the client
try {
    apiInstance.updatePlanExternalId(fnaUuid, clientUuid, body)
} catch (e: ClientException) {
    println("4xx response calling PlanApi#updatePlanExternalId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlanApi#updatePlanExternalId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fnaUuid** | **kotlin.String**| UUID of the FNA |
 **clientUuid** | **kotlin.String**| UUID of the client to update |
 **body** | **kotlin.String**| New UUID of the client |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json

