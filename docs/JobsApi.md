# JobsApi

All URIs are relative to *https://app.coalescesoftware.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelJobRun**](JobsApi.md#cancelJobRun) | **POST** /scheduler/cancelRun | Cancel Running Job |
| [**getStatusUpdates**](JobsApi.md#getStatusUpdates) | **GET** /scheduler/runStatus | Get Job Status |
| [**initiateRun**](JobsApi.md#initiateRun) | **POST** /scheduler/startRun | Trigger Job to Run |
| [**triggerRerun**](JobsApi.md#triggerRerun) | **POST** /scheduler/rerun | Trigger Job to Re-Run |


<a name="cancelJobRun"></a>
# **cancelJobRun**
> String cancelJobRun().jobsCancelJobRunRequest(jobsCancelJobRunRequest).execute();

Cancel Running Job

Querying this endpoint will cancel a currently running job.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Coalesce;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
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
    Integer runID = 56; // The ID of the run the user would like to cancel.
    String orgID = "orgID_example"; // The organization's ID of the run the user would like to cancel.
    String environmentID = "environmentID_example"; // The environment ID of the run the user would like to cancel.
    try {
      String result = client
              .jobs
              .cancelJobRun(runID)
              .orgID(orgID)
              .environmentID(environmentID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#cancelJobRun");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .jobs
              .cancelJobRun(runID)
              .orgID(orgID)
              .environmentID(environmentID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#cancelJobRun");
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
| **jobsCancelJobRunRequest** | [**JobsCancelJobRunRequest**](JobsCancelJobRunRequest.md)|  | [optional] |

### Return type

**String**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | 204 |  -  |

<a name="getStatusUpdates"></a>
# **getStatusUpdates**
> JobsGetStatusUpdatesResponse getStatusUpdates(runCounter).execute();

Get Job Status

Querying this endpoint will allow you to receive updates on the current status of a specific run.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Coalesce;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
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
    Integer runCounter = 56; // ID of the run to query
    try {
      JobsGetStatusUpdatesResponse result = client
              .jobs
              .getStatusUpdates(runCounter)
              .execute();
      System.out.println(result);
      System.out.println(result.getRunStatus());
      System.out.println(result.getRunType());
      System.out.println(result.getRunLink());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getStatusUpdates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobsGetStatusUpdatesResponse> response = client
              .jobs
              .getStatusUpdates(runCounter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getStatusUpdates");
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
| **runCounter** | **Integer**| ID of the run to query | |

### Return type

[**JobsGetStatusUpdatesResponse**](JobsGetStatusUpdatesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="initiateRun"></a>
# **initiateRun**
> JobsInitiateRunResponse initiateRun().jobsInitiateRunRequest(jobsInitiateRunRequest).execute();

Trigger Job to Run

Querying this endpoint will initiate a new run to refresh your data warehouse based on your specified details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Coalesce;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
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
    JobsInitiateRunRequestRunDetails runDetails = new JobsInitiateRunRequestRunDetails();
    String parameters = "parameters_example"; // Contains parameters to be used in the Refresh
    JobsInitiateRunRequestUserCredentials userCredentials = new JobsInitiateRunRequestUserCredentials();
    try {
      JobsInitiateRunResponse result = client
              .jobs
              .initiateRun(runDetails)
              .parameters(parameters)
              .userCredentials(userCredentials)
              .execute();
      System.out.println(result);
      System.out.println(result.getRunCounter());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#initiateRun");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobsInitiateRunResponse> response = client
              .jobs
              .initiateRun(runDetails)
              .parameters(parameters)
              .userCredentials(userCredentials)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#initiateRun");
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
| **jobsInitiateRunRequest** | [**JobsInitiateRunRequest**](JobsInitiateRunRequest.md)|  | [optional] |

### Return type

[**JobsInitiateRunResponse**](JobsInitiateRunResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="triggerRerun"></a>
# **triggerRerun**
> JobsTriggerRerunResponse triggerRerun().jobsTriggerRerunRequest(jobsTriggerRerunRequest).execute();

Trigger Job to Re-Run

Querying this endpoint will initiate a new run to refresh your data warehouse based on your specified details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Coalesce;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
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
    JobsTriggerRerunRequestRunDetails runDetails = new JobsTriggerRerunRequestRunDetails();
    JobsTriggerRerunRequestUserCredentials userCredentials = new JobsTriggerRerunRequestUserCredentials();
    String parameters = "parameters_example"; // Contains parameters to be used in the Refresh
    try {
      JobsTriggerRerunResponse result = client
              .jobs
              .triggerRerun(runDetails, userCredentials)
              .parameters(parameters)
              .execute();
      System.out.println(result);
      System.out.println(result.getRunCounter());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#triggerRerun");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobsTriggerRerunResponse> response = client
              .jobs
              .triggerRerun(runDetails, userCredentials)
              .parameters(parameters)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#triggerRerun");
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
| **jobsTriggerRerunRequest** | [**JobsTriggerRerunRequest**](JobsTriggerRerunRequest.md)|  | [optional] |

### Return type

[**JobsTriggerRerunResponse**](JobsTriggerRerunResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

