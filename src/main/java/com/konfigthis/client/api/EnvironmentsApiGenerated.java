/*
 * Coalesce API
 * REST API for performing operations with the Coalesce backend.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.BaseEnvironment;
import com.konfigthis.client.model.EnvironmentsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EnvironmentsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EnvironmentsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public EnvironmentsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getInformationCall(String environmentID, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/environments/{environmentID}"
            .replace("{" + "environmentID" + "}", localVarApiClient.escapeString(environmentID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInformationValidateBeforeCall(String environmentID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'environmentID' is set
        if (environmentID == null) {
            throw new ApiException("Missing the required parameter 'environmentID' when calling getInformation(Async)");
        }

        return getInformationCall(environmentID, _callback);

    }


    private ApiResponse<BaseEnvironment> getInformationWithHttpInfo(String environmentID) throws ApiException {
        okhttp3.Call localVarCall = getInformationValidateBeforeCall(environmentID, null);
        Type localVarReturnType = new TypeToken<BaseEnvironment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getInformationAsync(String environmentID, final ApiCallback<BaseEnvironment> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInformationValidateBeforeCall(environmentID, _callback);
        Type localVarReturnType = new TypeToken<BaseEnvironment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetInformationRequestBuilder {
        private final String environmentID;

        private GetInformationRequestBuilder(String environmentID) {
            this.environmentID = environmentID;
        }

        /**
         * Build call for getInformation
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Information about an environment. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> User lacks authorization to perform this action. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getInformationCall(environmentID, _callback);
        }


        /**
         * Execute getInformation request
         * @return BaseEnvironment
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Information about an environment. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> User lacks authorization to perform this action. </td><td>  -  </td></tr>
         </table>
         */
        public BaseEnvironment execute() throws ApiException {
            ApiResponse<BaseEnvironment> localVarResp = getInformationWithHttpInfo(environmentID);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getInformation request with HTTP info returned
         * @return ApiResponse&lt;BaseEnvironment&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Information about an environment. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> User lacks authorization to perform this action. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<BaseEnvironment> executeWithHttpInfo() throws ApiException {
            return getInformationWithHttpInfo(environmentID);
        }

        /**
         * Execute getInformation request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Information about an environment. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> User lacks authorization to perform this action. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<BaseEnvironment> _callback) throws ApiException {
            return getInformationAsync(environmentID, _callback);
        }
    }

    /**
     * Get Environment
     * Get information about an environment.
     * @param environmentID The environment ID. (required)
     * @return GetInformationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Information about an environment. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> User lacks authorization to perform this action. </td><td>  -  </td></tr>
     </table>
     */
    public GetInformationRequestBuilder getInformation(String environmentID) throws IllegalArgumentException {
        if (environmentID == null) throw new IllegalArgumentException("\"environmentID\" is required but got null");
            

        return new GetInformationRequestBuilder(environmentID);
    }
    private okhttp3.Call listInformationCall(Boolean detail, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/environments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (detail != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("detail", detail));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listInformationValidateBeforeCall(Boolean detail, final ApiCallback _callback) throws ApiException {
        return listInformationCall(detail, _callback);

    }


    private ApiResponse<EnvironmentsResponse> listInformationWithHttpInfo(Boolean detail) throws ApiException {
        okhttp3.Call localVarCall = listInformationValidateBeforeCall(detail, null);
        Type localVarReturnType = new TypeToken<EnvironmentsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listInformationAsync(Boolean detail, final ApiCallback<EnvironmentsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listInformationValidateBeforeCall(detail, _callback);
        Type localVarReturnType = new TypeToken<EnvironmentsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListInformationRequestBuilder {
        private Boolean detail;

        private ListInformationRequestBuilder() {
        }

        /**
         * Set detail
         * @param detail Include the full detail of the environments. (optional, default to false)
         * @return ListInformationRequestBuilder
         */
        public ListInformationRequestBuilder detail(Boolean detail) {
            this.detail = detail;
            return this;
        }
        
        /**
         * Build call for listInformation
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A collection of environment information. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> User lacks authorization to perform this action. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listInformationCall(detail, _callback);
        }


        /**
         * Execute listInformation request
         * @return EnvironmentsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A collection of environment information. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> User lacks authorization to perform this action. </td><td>  -  </td></tr>
         </table>
         */
        public EnvironmentsResponse execute() throws ApiException {
            ApiResponse<EnvironmentsResponse> localVarResp = listInformationWithHttpInfo(detail);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listInformation request with HTTP info returned
         * @return ApiResponse&lt;EnvironmentsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A collection of environment information. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> User lacks authorization to perform this action. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EnvironmentsResponse> executeWithHttpInfo() throws ApiException {
            return listInformationWithHttpInfo(detail);
        }

        /**
         * Execute listInformation request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A collection of environment information. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> User lacks authorization to perform this action. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EnvironmentsResponse> _callback) throws ApiException {
            return listInformationAsync(detail, _callback);
        }
    }

    /**
     * List Environments
     * Get a collection of environment information.
     * @return ListInformationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A collection of environment information. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> User lacks authorization to perform this action. </td><td>  -  </td></tr>
     </table>
     */
    public ListInformationRequestBuilder listInformation() throws IllegalArgumentException {
        return new ListInformationRequestBuilder();
    }
}
