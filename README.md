# com.equisoft.plan.sdk - Kotlin client library for Equisoft /plan API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CommandApi* | [**cmdCopyFNA**](docs/CommandApi.md#cmdcopyfna) | **POST** /fna/api/v2/cmd/copy/fna | 
*OrganizationsApi* | [**getOrganization**](docs/OrganizationsApi.md#getorganization) | **GET** /fna/api/v2/organizations/{id} | 
*OrganizationsApi* | [**listOrganizationUsers**](docs/OrganizationsApi.md#listorganizationusers) | **GET** /fna/api/v2/organizations/{id}/users | 
*OrganizationsApi* | [**listOrganizations**](docs/OrganizationsApi.md#listorganizations) | **GET** /fna/api/v2/organizations | 
*PlansV1Api* | [**getPlan**](docs/PlansV1Api.md#getplan) | **GET** /fna/api/fna/{id} | Returns the plan
*PlansV1Api* | [**updatePlanExternalId**](docs/PlansV1Api.md#updateplanexternalid) | **PUT** /fna/{fna-uuid}/client/{client-uuid}/external-id | Update client UUID id of an FNA
*UsersApi* | [**getUser**](docs/UsersApi.md#getuser) | **GET** /fna/api/v2/users/{id} | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.equisoft.plan.sdk.models.CmdCopyFNA](docs/CmdCopyFNA.md)
 - [com.equisoft.plan.sdk.models.CmdCopyFNAResponse](docs/CmdCopyFNAResponse.md)
 - [com.equisoft.plan.sdk.models.ErrorResponse](docs/ErrorResponse.md)
 - [com.equisoft.plan.sdk.models.OrganizationsListOrganizationsResponse](docs/OrganizationsListOrganizationsResponse.md)
 - [com.equisoft.plan.sdk.models.OrganizationsOrganization](docs/OrganizationsOrganization.md)
 - [com.equisoft.plan.sdk.models.UsersListUsersResponse](docs/UsersListUsersResponse.md)
 - [com.equisoft.plan.sdk.models.UsersUser](docs/UsersUser.md)
 - [com.equisoft.plan.sdk.models.V1ErrorResponse](docs/V1ErrorResponse.md)
 - [com.equisoft.plan.sdk.models.V1ErrorResponseData](docs/V1ErrorResponseData.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="OAuth2"></a>
### OAuth2

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://secure.kronos-web.com/oauth/authorize
- **Scopes**: 
  - fna:fna: Grants all access to plan/fna (deprecated)
  - plan:plan: Grants all access to plan/fna
  - plan:plan:create: Creation access on plan
  - plan:organization: Grants all access to plan/organizations
  - plan:user: Grants all access to plan/users

