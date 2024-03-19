# RunsApi

All URIs are relative to *https://app.coalescesoftware.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRunDetails**](RunsApi.md#getRunDetails) | **GET** /api/v1/runs/{runID} | Get Run |
| [**listInformation**](RunsApi.md#listInformation) | **GET** /api/v1/runs | List Runs |
| [**listResults**](RunsApi.md#listResults) | **GET** /api/v1/runs/{runID}/results | List Run Results |


<a name="getRunDetails"></a>
# **getRunDetails**
> RunInfo getRunDetails(runID).execute();

Get Run

Gets a single run.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Coalesce;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RunsApi;
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
    Integer runID = 56; // The run ID.
    try {
      RunInfo result = client
              .runs
              .getRunDetails(runID)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getReRunID());
      System.out.println(result.getRunDetails());
      System.out.println(result.getRunEndTime());
      System.out.println(result.getRunHistory());
      System.out.println(result.getRunStartTime());
      System.out.println(result.getRunStatus());
      System.out.println(result.getRunTimeParameters());
      System.out.println(result.getRunType());
      System.out.println(result.getUserCredentials());
      System.out.println(result.getUserID());
    } catch (ApiException e) {
      System.err.println("Exception when calling RunsApi#getRunDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RunInfo> response = client
              .runs
              .getRunDetails(runID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RunsApi#getRunDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runID** | **Integer**| The run ID. | |

### Return type

[**RunInfo**](RunInfo.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A single run. |  -  |
| **401** | User lacks authorization to perform this action. |  -  |

<a name="listInformation"></a>
# **listInformation**
> RunsResponse listInformation().limit(limit).startingFrom(startingFrom).orderBy(orderBy).orderByDirection(orderByDirection).runType(runType).runStatus(runStatus).environmentID(environmentID).detail(detail).execute();

List Runs

Get a collection of information about runs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Coalesce;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RunsApi;
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
    Integer limit = 25; // The maximum number of runs to return.
    Object startingFrom = null; // The starting run ID, runStartTime, or runEndTime (exclusive) for paging the query results.
    RunsOrderBy orderBy = RunsOrderBy.fromValue("id"); // The field used to order results.
    String orderByDirection = "asc"; // The sort order for query results.
    RunType runType = RunType.fromValue("deploy"); // A run type to filter the query results.
    RunStatus runStatus = RunStatus.fromValue("canceled"); // A status value to filter the query results.
    String environmentID = "environmentID_example"; // An environment ID to filter the query results.
    Boolean detail = false; // Include the full detail of the run.
    try {
      RunsResponse result = client
              .runs
              .listInformation()
              .limit(limit)
              .startingFrom(startingFrom)
              .orderBy(orderBy)
              .orderByDirection(orderByDirection)
              .runType(runType)
              .runStatus(runStatus)
              .environmentID(environmentID)
              .detail(detail)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getOrderByDirection());
      System.out.println(result.getOrderBy());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RunsApi#listInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RunsResponse> response = client
              .runs
              .listInformation()
              .limit(limit)
              .startingFrom(startingFrom)
              .orderBy(orderBy)
              .orderByDirection(orderByDirection)
              .runType(runType)
              .runStatus(runStatus)
              .environmentID(environmentID)
              .detail(detail)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RunsApi#listInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| The maximum number of runs to return. | [optional] [default to 25] |
| **startingFrom** | [**Object**](.md)| The starting run ID, runStartTime, or runEndTime (exclusive) for paging the query results. | [optional] |
| **orderBy** | [**RunsOrderBy**](.md)| The field used to order results. | [optional] [default to id] [enum: id, runStartTime, runEndTime] |
| **orderByDirection** | **String**| The sort order for query results. | [optional] [default to desc] [enum: asc, desc] |
| **runType** | [**RunType**](.md)| A run type to filter the query results. | [optional] [enum: deploy, refresh] |
| **runStatus** | [**RunStatus**](.md)| A status value to filter the query results. | [optional] [enum: canceled, completed, failed, running, waitingToRun] |
| **environmentID** | **String**| An environment ID to filter the query results. | [optional] |
| **detail** | **Boolean**| Include the full detail of the run. | [optional] [default to false] |

### Return type

[**RunsResponse**](RunsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of runs. |  -  |
| **401** | User lacks authorization to perform this action. |  -  |

<a name="listResults"></a>
# **listResults**
> RunResultsResponse listResults(runID).execute();

List Run Results

Get a collection of the results of a deploy or refresh run

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Coalesce;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RunsApi;
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
    Integer runID = 56; // The run ID.
    try {
      RunResultsResponse result = client
              .runs
              .listResults(runID)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RunsApi#listResults");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RunResultsResponse> response = client
              .runs
              .listResults(runID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RunsApi#listResults");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **runID** | **Integer**| The run ID. | |

### Return type

[**RunResultsResponse**](RunResultsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of results for a deploy or refresh run. |  -  |
| **401** | User lacks authorization to perform this action. |  -  |

