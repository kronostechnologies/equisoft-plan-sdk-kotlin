# PlansV1Api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlan**](PlansV1Api.md#getPlan) | **GET** /fna/api/fna/{id} | Returns the plan
[**updatePlanExternalId**](PlansV1Api.md#updatePlanExternalId) | **PUT** /fna/{fna-uuid}/client/{client-uuid}/external-id | Update client UUID id of an FNA


<a name="getPlan"></a>
# **getPlan**
> getPlan(id)

Returns the plan

### Example
```kotlin
// Import classes:
//import com.equisoft.plan.sdk.infrastructure.*
//import com.equisoft.plan.sdk.models.*

val apiInstance = PlansV1Api()
val id : kotlin.Int = 56 // kotlin.Int | Fna id
try {
    apiInstance.getPlan(id)
} catch (e: ClientException) {
    println("4xx response calling PlansV1Api#getPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlansV1Api#getPlan")
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

val apiInstance = PlansV1Api()
val fnaUuid : kotlin.String = 8a135829-0d9a-4104-9a95-1fe2871cb82f // kotlin.String | UUID of the FNA
val clientUuid : kotlin.String = ca59ed78-b35b-4390-98f9-309d421e5bb0 // kotlin.String | UUID of the client to update
val body : kotlin.String = 99048189-1b66-428f-9a0b-e0996c959f72 // kotlin.String | New UUID of the client
try {
    apiInstance.updatePlanExternalId(fnaUuid, clientUuid, body)
} catch (e: ClientException) {
    println("4xx response calling PlansV1Api#updatePlanExternalId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlansV1Api#updatePlanExternalId")
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

