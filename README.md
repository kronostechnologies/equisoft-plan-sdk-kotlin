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
*PlanApi* | [**copyPlan**](docs/PlanApi.md#copyplan) | **POST** /fna/api/cmd/fna/copy | Copy a plan
*PlanApi* | [**getPlan**](docs/PlanApi.md#getplan) | **GET** /fna/api/fna/{id} | Returns the plan
*PlanApi* | [**updatePlanExternalId**](docs/PlanApi.md#updateplanexternalid) | **PUT** /fna/{fna-uuid}/client/{client-uuid}/external-id | Update client UUID id of an FNA


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.equisoft.plan.sdk.models.CopyFnaResponse](docs/CopyFnaResponse.md)
 - [com.equisoft.plan.sdk.models.CopyFnaResponseData](docs/CopyFnaResponseData.md)
 - [com.equisoft.plan.sdk.models.ErrorResponse](docs/ErrorResponse.md)
 - [com.equisoft.plan.sdk.models.ErrorResponseData](docs/ErrorResponseData.md)


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

