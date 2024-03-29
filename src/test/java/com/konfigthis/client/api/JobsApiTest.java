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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.JobsCancelJobRunRequest;
import com.konfigthis.client.model.JobsGetStatusUpdatesResponse;
import com.konfigthis.client.model.JobsInitiateRunRequest;
import com.konfigthis.client.model.JobsInitiateRunRequestRunDetails;
import com.konfigthis.client.model.JobsInitiateRunRequestUserCredentials;
import com.konfigthis.client.model.JobsInitiateRunResponse;
import com.konfigthis.client.model.JobsTriggerRerunRequest;
import com.konfigthis.client.model.JobsTriggerRerunRequestRunDetails;
import com.konfigthis.client.model.JobsTriggerRerunRequestUserCredentials;
import com.konfigthis.client.model.JobsTriggerRerunResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
@Disabled
public class JobsApiTest {

    private static JobsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new JobsApi(apiClient);
    }

    /**
     * Cancel Running Job
     *
     * Querying this endpoint will cancel a currently running job.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelJobRunTest() throws ApiException {
        Integer runID = null;
        String orgID = null;
        String environmentID = null;
        String response = api.cancelJobRun(runID)
                .orgID(orgID)
                .environmentID(environmentID)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Job Status
     *
     * Querying this endpoint will allow you to receive updates on the current status of a specific run.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatusUpdatesTest() throws ApiException {
        Integer runCounter = null;
        JobsGetStatusUpdatesResponse response = api.getStatusUpdates(runCounter)
                .execute();
        // TODO: test validations
    }

    /**
     * Trigger Job to Run
     *
     * Querying this endpoint will initiate a new run to refresh your data warehouse based on your specified details.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void initiateRunTest() throws ApiException {
        JobsInitiateRunRequestRunDetails runDetails = null;
        String parameters = null;
        JobsInitiateRunRequestUserCredentials userCredentials = null;
        JobsInitiateRunResponse response = api.initiateRun(runDetails)
                .parameters(parameters)
                .userCredentials(userCredentials)
                .execute();
        // TODO: test validations
    }

    /**
     * Trigger Job to Re-Run
     *
     * Querying this endpoint will initiate a new run to refresh your data warehouse based on your specified details.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void triggerRerunTest() throws ApiException {
        JobsTriggerRerunRequestRunDetails runDetails = null;
        JobsTriggerRerunRequestUserCredentials userCredentials = null;
        String parameters = null;
        JobsTriggerRerunResponse response = api.triggerRerun(runDetails, userCredentials)
                .parameters(parameters)
                .execute();
        // TODO: test validations
    }

}
