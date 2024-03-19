<div align="center">

[![Visit Coalesce](./header.png)](https://coalesce.io&#x2F;)

# [Coalesce](https://coalesce.io&#x2F;)

REST API for performing operations with the Coalesce backend.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Coalesce&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>coalesce-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:coalesce-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/coalesce-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Coalesce;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EnvironmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.coalescesoftware.io";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    Coalesce client = new Coalesce(configuration);
    String environmentID = "environmentID_example"; // The environment ID.
    try {
      BaseEnvironment result = client
              .environments
              .getInformation(environmentID)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getConnectionAccount());
      System.out.println(result.getDefaultStorageMapping());
      System.out.println(result.getName());
      System.out.println(result.getOauthEnabled());
      System.out.println(result.getRunTimeParameters());
      System.out.println(result.getTagColors());
      System.out.println(result.getProject());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BaseEnvironment> response = client
              .environments
              .getInformation(environmentID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://app.coalescesoftware.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EnvironmentsApi* | [**getInformation**](docs/EnvironmentsApi.md#getInformation) | **GET** /api/v1/environments/{environmentID} | Get Environment
*EnvironmentsApi* | [**listInformation**](docs/EnvironmentsApi.md#listInformation) | **GET** /api/v1/environments | List Environments
*JobsApi* | [**cancelJobRun**](docs/JobsApi.md#cancelJobRun) | **POST** /scheduler/cancelRun | Cancel Running Job
*JobsApi* | [**getStatusUpdates**](docs/JobsApi.md#getStatusUpdates) | **GET** /scheduler/runStatus | Get Job Status
*JobsApi* | [**initiateRun**](docs/JobsApi.md#initiateRun) | **POST** /scheduler/startRun | Trigger Job to Run
*JobsApi* | [**triggerRerun**](docs/JobsApi.md#triggerRerun) | **POST** /scheduler/rerun | Trigger Job to Re-Run
*NodesApi* | [**getInformation**](docs/NodesApi.md#getInformation) | **GET** /api/v1/environments/{environmentID}/nodes/{nodeID} | Get Node
*NodesApi* | [**list**](docs/NodesApi.md#list) | **GET** /api/v1/environments/{environmentID}/nodes | List Nodes
*RunsApi* | [**getRunDetails**](docs/RunsApi.md#getRunDetails) | **GET** /api/v1/runs/{runID} | Get Run
*RunsApi* | [**listInformation**](docs/RunsApi.md#listInformation) | **GET** /api/v1/runs | List Runs
*RunsApi* | [**listResults**](docs/RunsApi.md#listResults) | **GET** /api/v1/runs/{runID}/results | List Run Results


## Documentation for Models

 - [BaseEnvironment](docs/BaseEnvironment.md)
 - [BaseNode](docs/BaseNode.md)
 - [ColumnMetadata](docs/ColumnMetadata.md)
 - [ColumnReference](docs/ColumnReference.md)
 - [CustomSQL](docs/CustomSQL.md)
 - [DRRunDetails](docs/DRRunDetails.md)
 - [DeployRunDetails](docs/DeployRunDetails.md)
 - [EnvironmentHealth](docs/EnvironmentHealth.md)
 - [EnvironmentStorageLocationMappingsValue](docs/EnvironmentStorageLocationMappingsValue.md)
 - [EnvironmentSummary](docs/EnvironmentSummary.md)
 - [EnvironmentsResponse](docs/EnvironmentsResponse.md)
 - [EnvironmentsResponseDataInner](docs/EnvironmentsResponseDataInner.md)
 - [Error](docs/Error.md)
 - [HashAlgorithm](docs/HashAlgorithm.md)
 - [HashMetadata](docs/HashMetadata.md)
 - [IntermediateColumnRefResult](docs/IntermediateColumnRefResult.md)
 - [JobsCancelJobRunRequest](docs/JobsCancelJobRunRequest.md)
 - [JobsGetStatusUpdatesResponse](docs/JobsGetStatusUpdatesResponse.md)
 - [JobsInitiateRunRequest](docs/JobsInitiateRunRequest.md)
 - [JobsInitiateRunRequestRunDetails](docs/JobsInitiateRunRequestRunDetails.md)
 - [JobsInitiateRunRequestUserCredentials](docs/JobsInitiateRunRequestUserCredentials.md)
 - [JobsInitiateRunResponse](docs/JobsInitiateRunResponse.md)
 - [JobsTriggerRerunRequest](docs/JobsTriggerRerunRequest.md)
 - [JobsTriggerRerunRequestRunDetails](docs/JobsTriggerRerunRequestRunDetails.md)
 - [JobsTriggerRerunRequestUserCredentials](docs/JobsTriggerRerunRequestUserCredentials.md)
 - [JobsTriggerRerunResponse](docs/JobsTriggerRerunResponse.md)
 - [JoinCondition](docs/JoinCondition.md)
 - [MaterializationType](docs/MaterializationType.md)
 - [NodeSummary](docs/NodeSummary.md)
 - [NodeTest](docs/NodeTest.md)
 - [NodeType](docs/NodeType.md)
 - [NodesResponse](docs/NodesResponse.md)
 - [NodesResponseDataInner](docs/NodesResponseDataInner.md)
 - [OrderByDirection](docs/OrderByDirection.md)
 - [PackageUpdateReleaseInfo](docs/PackageUpdateReleaseInfo.md)
 - [QueryResult](docs/QueryResult.md)
 - [RefLink](docs/RefLink.md)
 - [RefreshRunDetails](docs/RefreshRunDetails.md)
 - [RegistryPackageReleaseResult](docs/RegistryPackageReleaseResult.md)
 - [RegistryPackageReleaseResultCreatedAt](docs/RegistryPackageReleaseResultCreatedAt.md)
 - [RegistryPackageResult](docs/RegistryPackageResult.md)
 - [RunInfo](docs/RunInfo.md)
 - [RunResult](docs/RunResult.md)
 - [RunResultsResponse](docs/RunResultsResponse.md)
 - [RunStatus](docs/RunStatus.md)
 - [RunSummary](docs/RunSummary.md)
 - [RunType](docs/RunType.md)
 - [RunsOrderBy](docs/RunsOrderBy.md)
 - [RunsResponse](docs/RunsResponse.md)
 - [RunsResponseDataInner](docs/RunsResponseDataInner.md)
 - [SQLNodeMetadata](docs/SQLNodeMetadata.md)
 - [SnowflakeUserCredentials](docs/SnowflakeUserCredentials.md)
 - [SourceColumnMetadata](docs/SourceColumnMetadata.md)
 - [SourceColumnMetadataJoin](docs/SourceColumnMetadataJoin.md)
 - [SourceColumnReferenceV1](docs/SourceColumnReferenceV1.md)
 - [SourceColumnReferenceV2](docs/SourceColumnReferenceV2.md)
 - [SourceMap](docs/SourceMap.md)
 - [TagColor](docs/TagColor.md)
 - [TestRunOrder](docs/TestRunOrder.md)
 - [UserConnectionType](docs/UserConnectionType.md)
 - [UserSummary](docs/UserSummary.md)
 - [VSourceColumnReference](docs/VSourceColumnReference.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
