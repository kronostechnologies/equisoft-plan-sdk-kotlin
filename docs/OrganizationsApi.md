# OrganizationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrganization**](OrganizationsApi.md#getOrganization) | **GET** /fna/api/v2/organizations/{id} | 
[**listOrganizationUsers**](OrganizationsApi.md#listOrganizationUsers) | **GET** /fna/api/v2/organizations/{id}/users | 
[**listOrganizations**](OrganizationsApi.md#listOrganizations) | **GET** /fna/api/v2/organizations | 


<a name="getOrganization"></a>
# **getOrganization**
> OrganizationsOrganization getOrganization(id)



### Example
```kotlin
// Import classes:
//import com.equisoft.plan.sdk.infrastructure.*
//import com.equisoft.plan.sdk.models.*

val apiInstance = OrganizationsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OrganizationsOrganization = apiInstance.getOrganization(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#getOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#getOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

[**OrganizationsOrganization**](OrganizationsOrganization.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrganizationUsers"></a>
# **listOrganizationUsers**
> UsersListUsersResponse listOrganizationUsers(id)



### Example
```kotlin
// Import classes:
//import com.equisoft.plan.sdk.infrastructure.*
//import com.equisoft.plan.sdk.models.*

val apiInstance = OrganizationsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsersListUsersResponse = apiInstance.listOrganizationUsers(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#listOrganizationUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#listOrganizationUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

[**UsersListUsersResponse**](UsersListUsersResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrganizations"></a>
# **listOrganizations**
> OrganizationsListOrganizationsResponse listOrganizations(organizationUuid)



### Example
```kotlin
// Import classes:
//import com.equisoft.plan.sdk.infrastructure.*
//import com.equisoft.plan.sdk.models.*

val apiInstance = OrganizationsApi()
val organizationUuid : kotlin.String = organizationUuid_example // kotlin.String | 
try {
    val result : OrganizationsListOrganizationsResponse = apiInstance.listOrganizations(organizationUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#listOrganizations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#listOrganizations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationUuid** | **kotlin.String**|  |

### Return type

[**OrganizationsListOrganizationsResponse**](OrganizationsListOrganizationsResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

