

# RunSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The run ID. |  |
|**reRunID** | **String** | If this is a re-run, the ID of the original operation. |  [optional] |
|**runStartTime** | **OffsetDateTime** | The datetime at which the run started. |  [optional] |
|**runEndTime** | **OffsetDateTime** | The datetime at which the run ended. |  [optional] |
|**runType** | [**RunTypeEnum**](#RunTypeEnum) |  |  |
|**runStatus** | [**RunStatusEnum**](#RunStatusEnum) |  |  |
|**environmentID** | **String** | The environment in which the run operation was applied. |  [optional] |
|**runFailureReason** | **String** | Information about the cause of a run failure. |  [optional] |
|**version** | **Integer** |  |  [optional] |
|**runDetails** | [**DRRunDetails**](DRRunDetails.md) |  |  [optional] |
|**runHistory** | **List&lt;Integer&gt;** |  |  [optional] |
|**runTimeParameters** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**userCredentials** | [**SnowflakeUserCredentials**](SnowflakeUserCredentials.md) |  |  [optional] |
|**userID** | **String** |  |  [optional] |



## Enum: RunTypeEnum

| Name | Value |
|---- | -----|
| DEPLOY | &quot;deploy&quot; |
| REFRESH | &quot;refresh&quot; |



## Enum: RunStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;canceled&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |
| RUNNING | &quot;running&quot; |
| WAITINGTORUN | &quot;waitingToRun&quot; |



