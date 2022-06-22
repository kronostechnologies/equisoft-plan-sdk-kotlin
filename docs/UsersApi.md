# UsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUser**](UsersApi.md#getUser) | **GET** /fna/api/v2/users/{id} | 
[**getUserContext**](UsersApi.md#getUserContext) | **GET** /fna/api/v2/userContext | 


<a name="getUser"></a>
# **getUser**
> UsersUser getUser(id)



### Example
```kotlin
// Import classes:
//import com.equisoft.plan.sdk.infrastructure.*
//import com.equisoft.plan.sdk.models.*

val apiInstance = UsersApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsersUser = apiInstance.getUser(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

[**UsersUser**](UsersUser.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserContext"></a>
# **getUserContext**
> UsersUserContext getUserContext()



### Example
```kotlin
// Import classes:
//import com.equisoft.plan.sdk.infrastructure.*
//import com.equisoft.plan.sdk.models.*

val apiInstance = UsersApi()
try {
    val result : UsersUserContext = apiInstance.getUserContext()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserContext")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserContext")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UsersUserContext**](UsersUserContext.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

