

# ColumnMetadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  |
|**appliedColumnTests** | **Map&lt;String, Boolean&gt;** |  |  [optional] |
|**columnID** | **String** |  |  |
|**columnReferences** | [**List&lt;IntermediateColumnRefResult&gt;**](IntermediateColumnRefResult.md) |  |  [optional] |
|**config** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**dataType** | **String** |  |  |
|**defaultValue** | **String** |  |  [optional] |
|**hashDetails** | [**HashMetadata**](HashMetadata.md) |  |  [optional] |
|**hashedColumns** | [**List&lt;ColumnReference&gt;**](ColumnReference.md) |  |  [optional] |
|**isBusinessKey** | **Boolean** | Tags the column as a business key. |  [optional] |
|**isChangeTracking** | **Boolean** | Tags the column as a change tracking column in type 2 dimensions. |  [optional] |
|**isSurrogateKey** | **Boolean** | Tags the column as a surrogate key, e.g. DIM_CUSTOMER_KEY. |  [optional] |
|**keyColumnType** | [**KeyColumnTypeEnum**](#KeyColumnTypeEnum) |  |  [optional] |
|**name** | **String** |  |  |
|**nullable** | **Boolean** |  |  |
|**primaryKey** | **Boolean** | Tags the column as a primary key. |  [optional] |
|**sources** | [**List&lt;VSourceColumnReference&gt;**](VSourceColumnReference.md) |  |  [optional] |
|**systemColumnType** | [**SystemColumnTypeEnum**](#SystemColumnTypeEnum) |  |  [optional] |
|**transform** | **String** |  |  [optional] |
|**uniqueKey** | **Boolean** |  |  [optional] |



## Enum: KeyColumnTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| PRIMARYBUSINESSKEY | &quot;primaryBusinessKey&quot; |
| SURROGATEKEY | &quot;surrogateKey&quot; |



## Enum: SystemColumnTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| SYSCREATEDATE | &quot;sysCreateDate&quot; |
| SYSCURRENTFLAG | &quot;sysCurrentFlag&quot; |
| SYSENDDATE | &quot;sysEndDate&quot; |
| SYSSTARTDATE | &quot;sysStartDate&quot; |
| SYSUPDATEDATE | &quot;sysUpdateDate&quot; |
| SYSVERSION | &quot;sysVersion&quot; |



