package com.konfigthis.client;

import com.konfigthis.client.api.EnvironmentsApi;
import com.konfigthis.client.api.JobsApi;
import com.konfigthis.client.api.NodesApi;
import com.konfigthis.client.api.RunsApi;

public class Coalesce {
    private ApiClient apiClient;
    public final EnvironmentsApi environments;
    public final JobsApi jobs;
    public final NodesApi nodes;
    public final RunsApi runs;

    public Coalesce() {
        this(null);
    }

    public Coalesce(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.environments = new EnvironmentsApi(this.apiClient);
        this.jobs = new JobsApi(this.apiClient);
        this.nodes = new NodesApi(this.apiClient);
        this.runs = new RunsApi(this.apiClient);
    }

}
