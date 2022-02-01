# PlansApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPlans**](PlansApi.md#listPlans) | **GET** /fna/api/v2/plans | 


<a name="listPlans"></a>
# **listPlans**
> PlansListPlansResponse listPlans(clientExternalUuid)



### Example
```kotlin
// Import classes:
//import com.equisoft.plan.sdk.infrastructure.*
//import com.equisoft.plan.sdk.models.*

val apiInstance = PlansApi()
val clientExternalUuid : kotlin.String = clientExternalUuid_example // kotlin.String | 
try {
    val result : PlansListPlansResponse = apiInstance.listPlans(clientExternalUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlansApi#listPlans")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlansApi#listPlans")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientExternalUuid** | **kotlin.String**|  | [optional]

### Return type

[**PlansListPlansResponse**](PlansListPlansResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

