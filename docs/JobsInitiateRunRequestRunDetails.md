

# JobsInitiateRunRequestRunDetails

Object containing the necessary target details required to successfully start a refresh.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**environmentID** | **String** | The environment being refreshed |  |
|**includeNodesSelector** | **String** | Nodes included for an ad-hoc job |  [optional] |
|**excludeNodesSelector** | **String** | Nodes excluded for an ad-hoc job. |  [optional] |
|**jobID** | **String** | The ID of a job being run. |  [optional] |
|**parallelism** | **Integer** | Maximum number of parallel nodes to run. |  [optional] |
|**forceIgnoreWorkspaceStatus** | **Boolean** | Allows refreshing an environment even if the last deployment on that environment failed. Use with caution as this can put your environment into an even worse state. |  [optional] |



