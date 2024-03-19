# NodesApi

All URIs are relative to *https://app.coalescesoftware.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInformation**](NodesApi.md#getInformation) | **GET** /api/v1/environments/{environmentID}/nodes/{nodeID} | Get Node |
| [**list**](NodesApi.md#list) | **GET** /api/v1/environments/{environmentID}/nodes | List Nodes |


<a name="getInformation"></a>
# **getInformation**
> Object getInformation(environmentID, nodeID).execute();

Get Node

Get information about a node in an environment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Coalesce;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NodesApi;
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
    String nodeID = "nodeID_example"; // The node ID.
    try {
      Object result = client
              .nodes
              .getInformation(environmentID, nodeID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NodesApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .nodes
              .getInformation(environmentID, nodeID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NodesApi#getInformation");
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
| **nodeID** | **String**| The node ID. | |

### Return type

**Object**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A node for an environment. |  -  |
| **401** | User lacks authorization to perform this action. |  -  |

<a name="list"></a>
# **list**
> NodesResponse list(environmentID).detail(detail).execute();

List Nodes

Get a collection of nodes for an environment

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Coalesce;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NodesApi;
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
    Boolean detail = false; // Include the full detail of the nodes.
    try {
      NodesResponse result = client
              .nodes
              .list(environmentID)
              .detail(detail)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling NodesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NodesResponse> response = client
              .nodes
              .list(environmentID)
              .detail(detail)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NodesApi#list");
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
| **detail** | **Boolean**| Include the full detail of the nodes. | [optional] [default to false] |

### Return type

[**NodesResponse**](NodesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of nodes for an environment. |  -  |
| **401** | User lacks authorization to perform this action. |  -  |

