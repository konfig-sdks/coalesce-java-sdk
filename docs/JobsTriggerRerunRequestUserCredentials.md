

# JobsTriggerRerunRequestUserCredentials

userCredentials contains connection credentials for connecting to Snowflake. Currently only basic auth (username/password) may be specified. If however, an OAuth connection has been established for the given environment specified in runDetails.environmentID, you may ommit userCredentials. In that case, Coalesce will use the OAuth connection to connect with Snowflake.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**snowflakeUsername** | **String** | Snowflake Account Username. Required when snowflakeAuthType is Basic |  [optional] |
|**snowflakePassword** | **String** | Snowflake Account password. Required when snowflakeAuthType is Basic |  [optional] |
|**snowflakeKeyPairKey** | **String** | The PEM-encoded private key to use when authenticating to Snowflake. Required when using the KeyPair authentication type. Newlines must be encoded as \&quot;\\n\&quot; within the request. |  [optional] |
|**snowflakeKeyPairPass** | **String** | The password to use to decrypt the private key. This is only applicable when the authentication type is KeyPair and the private key is encrypted. |  [optional] |
|**snowflakeWarehouse** | **String** | Snowflake compute warehouse |  [optional] |
|**snowflakeRole** | **String** | Snowflake user role |  [optional] |
|**snowflakeAuthType** | **String** | Options: Basic | KeyPair | OAuth |  [optional] |



