

# JobsGetStatusUpdatesResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runStatus** | [**RunStatusEnum**](#RunStatusEnum) |  |  [optional] |
|**runType** | [**RunTypeEnum**](#RunTypeEnum) |  |  [optional] |
|**runLink** | **String** |  |  [optional] |



## Enum: RunStatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |
| INITIALIZING | &quot;initializing&quot; |
| RENDERING | &quot;rendering&quot; |
| CANCELED | &quot;canceled&quot; |
| FAILED | &quot;failed&quot; |
| RUNNING | &quot;running&quot; |
| WAITINGTORUN | &quot;waitingToRun&quot; |



## Enum: RunTypeEnum

| Name | Value |
|---- | -----|
| DEPLOY | &quot;deploy&quot; |
| REFRESH | &quot;refresh&quot; |



