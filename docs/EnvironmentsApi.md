# EnvironmentsApi

All URIs are relative to *https://app.coalescesoftware.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInformation**](EnvironmentsApi.md#getInformation) | **GET** /api/v1/environments/{environmentID} | Get Environment |
| [**listInformation**](EnvironmentsApi.md#listInformation) | **GET** /api/v1/environments | List Environments |


<a name="getInformation"></a>
# **getInformation**
> BaseEnvironment getInformation(environmentID).execute();

Get Environment

Get information about an environment.

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **environmentID** | **String**| The environment ID. | |

### Return type

[**BaseEnvironment**](BaseEnvironment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information about an environment. |  -  |
| **401** | User lacks authorization to perform this action. |  -  |

<a name="listInformation"></a>
# **listInformation**
> EnvironmentsResponse listInformation().detail(detail).execute();

List Environments

Get a collection of environment information.

### Example
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
    Boolean detail = false; // Include the full detail of the environments.
    try {
      EnvironmentsResponse result = client
              .environments
              .listInformation()
              .detail(detail)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#listInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EnvironmentsResponse> response = client
              .environments
              .listInformation()
              .detail(detail)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#listInformation");
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
| **detail** | **Boolean**| Include the full detail of the environments. | [optional] [default to false] |

### Return type

[**EnvironmentsResponse**](EnvironmentsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of environment information. |  -  |
| **401** | User lacks authorization to perform this action. |  -  |

