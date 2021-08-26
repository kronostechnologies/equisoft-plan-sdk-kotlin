# CommandApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cmdCopyFNA**](CommandApi.md#cmdCopyFNA) | **POST** /fna/api/v2/cmd/copy/fna | 


<a name="cmdCopyFNA"></a>
# **cmdCopyFNA**
> CmdCopyFNAResponse cmdCopyFNA(cmdCopyFNA)



### Example
```kotlin
// Import classes:
//import com.equisoft.plan.sdk.infrastructure.*
//import com.equisoft.plan.sdk.models.*

val apiInstance = CommandApi()
val cmdCopyFNA : CmdCopyFNA =  // CmdCopyFNA | 
try {
    val result : CmdCopyFNAResponse = apiInstance.cmdCopyFNA(cmdCopyFNA)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommandApi#cmdCopyFNA")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommandApi#cmdCopyFNA")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmdCopyFNA** | [**CmdCopyFNA**](CmdCopyFNA.md)|  |

### Return type

[**CmdCopyFNAResponse**](CmdCopyFNAResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

