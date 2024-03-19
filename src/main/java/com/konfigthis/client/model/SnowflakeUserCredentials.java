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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.UserConnectionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Information about the Snowflake account used to perform a run.
 */
@ApiModel(description = "Information about the Snowflake account used to perform a run.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SnowflakeUserCredentials {
  public static final String SERIALIZED_NAME_SNOWFLAKE_ACCOUNT = "snowflakeAccount";
  @SerializedName(SERIALIZED_NAME_SNOWFLAKE_ACCOUNT)
  private String snowflakeAccount;

  public static final String SERIALIZED_NAME_SNOWFLAKE_AUTH_TYPE = "snowflakeAuthType";
  @SerializedName(SERIALIZED_NAME_SNOWFLAKE_AUTH_TYPE)
  private UserConnectionType snowflakeAuthType;

  public static final String SERIALIZED_NAME_SNOWFLAKE_ROLE = "snowflakeRole";
  @SerializedName(SERIALIZED_NAME_SNOWFLAKE_ROLE)
  private String snowflakeRole;

  public static final String SERIALIZED_NAME_SNOWFLAKE_USERNAME = "snowflakeUsername";
  @SerializedName(SERIALIZED_NAME_SNOWFLAKE_USERNAME)
  private String snowflakeUsername;

  public static final String SERIALIZED_NAME_SNOWFLAKE_WAREHOUSE = "snowflakeWarehouse";
  @SerializedName(SERIALIZED_NAME_SNOWFLAKE_WAREHOUSE)
  private String snowflakeWarehouse;

  public SnowflakeUserCredentials() {
  }

  public SnowflakeUserCredentials snowflakeAccount(String snowflakeAccount) {
    
    
    
    
    this.snowflakeAccount = snowflakeAccount;
    return this;
  }

   /**
   * Get snowflakeAccount
   * @return snowflakeAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSnowflakeAccount() {
    return snowflakeAccount;
  }


  public void setSnowflakeAccount(String snowflakeAccount) {
    
    
    
    this.snowflakeAccount = snowflakeAccount;
  }


  public SnowflakeUserCredentials snowflakeAuthType(UserConnectionType snowflakeAuthType) {
    
    
    
    
    this.snowflakeAuthType = snowflakeAuthType;
    return this;
  }

   /**
   * Get snowflakeAuthType
   * @return snowflakeAuthType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserConnectionType getSnowflakeAuthType() {
    return snowflakeAuthType;
  }


  public void setSnowflakeAuthType(UserConnectionType snowflakeAuthType) {
    
    
    
    this.snowflakeAuthType = snowflakeAuthType;
  }


  public SnowflakeUserCredentials snowflakeRole(String snowflakeRole) {
    
    
    
    
    this.snowflakeRole = snowflakeRole;
    return this;
  }

   /**
   * Get snowflakeRole
   * @return snowflakeRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSnowflakeRole() {
    return snowflakeRole;
  }


  public void setSnowflakeRole(String snowflakeRole) {
    
    
    
    this.snowflakeRole = snowflakeRole;
  }


  public SnowflakeUserCredentials snowflakeUsername(String snowflakeUsername) {
    
    
    
    
    this.snowflakeUsername = snowflakeUsername;
    return this;
  }

   /**
   * Get snowflakeUsername
   * @return snowflakeUsername
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSnowflakeUsername() {
    return snowflakeUsername;
  }


  public void setSnowflakeUsername(String snowflakeUsername) {
    
    
    
    this.snowflakeUsername = snowflakeUsername;
  }


  public SnowflakeUserCredentials snowflakeWarehouse(String snowflakeWarehouse) {
    
    
    
    
    this.snowflakeWarehouse = snowflakeWarehouse;
    return this;
  }

   /**
   * Get snowflakeWarehouse
   * @return snowflakeWarehouse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSnowflakeWarehouse() {
    return snowflakeWarehouse;
  }


  public void setSnowflakeWarehouse(String snowflakeWarehouse) {
    
    
    
    this.snowflakeWarehouse = snowflakeWarehouse;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SnowflakeUserCredentials instance itself
   */
  public SnowflakeUserCredentials putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeUserCredentials snowflakeUserCredentials = (SnowflakeUserCredentials) o;
    return Objects.equals(this.snowflakeAccount, snowflakeUserCredentials.snowflakeAccount) &&
        Objects.equals(this.snowflakeAuthType, snowflakeUserCredentials.snowflakeAuthType) &&
        Objects.equals(this.snowflakeRole, snowflakeUserCredentials.snowflakeRole) &&
        Objects.equals(this.snowflakeUsername, snowflakeUserCredentials.snowflakeUsername) &&
        Objects.equals(this.snowflakeWarehouse, snowflakeUserCredentials.snowflakeWarehouse)&&
        Objects.equals(this.additionalProperties, snowflakeUserCredentials.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snowflakeAccount, snowflakeAuthType, snowflakeRole, snowflakeUsername, snowflakeWarehouse, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeUserCredentials {\n");
    sb.append("    snowflakeAccount: ").append(toIndentedString(snowflakeAccount)).append("\n");
    sb.append("    snowflakeAuthType: ").append(toIndentedString(snowflakeAuthType)).append("\n");
    sb.append("    snowflakeRole: ").append(toIndentedString(snowflakeRole)).append("\n");
    sb.append("    snowflakeUsername: ").append(toIndentedString(snowflakeUsername)).append("\n");
    sb.append("    snowflakeWarehouse: ").append(toIndentedString(snowflakeWarehouse)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("snowflakeAccount");
    openapiFields.add("snowflakeAuthType");
    openapiFields.add("snowflakeRole");
    openapiFields.add("snowflakeUsername");
    openapiFields.add("snowflakeWarehouse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("snowflakeAccount");
    openapiRequiredFields.add("snowflakeAuthType");
    openapiRequiredFields.add("snowflakeUsername");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SnowflakeUserCredentials
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SnowflakeUserCredentials.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SnowflakeUserCredentials is not found in the empty JSON string", SnowflakeUserCredentials.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SnowflakeUserCredentials.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("snowflakeAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snowflakeAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snowflakeAccount").toString()));
      }
      if ((jsonObj.get("snowflakeRole") != null && !jsonObj.get("snowflakeRole").isJsonNull()) && !jsonObj.get("snowflakeRole").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snowflakeRole` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snowflakeRole").toString()));
      }
      if (!jsonObj.get("snowflakeUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snowflakeUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snowflakeUsername").toString()));
      }
      if ((jsonObj.get("snowflakeWarehouse") != null && !jsonObj.get("snowflakeWarehouse").isJsonNull()) && !jsonObj.get("snowflakeWarehouse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snowflakeWarehouse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snowflakeWarehouse").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SnowflakeUserCredentials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SnowflakeUserCredentials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SnowflakeUserCredentials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SnowflakeUserCredentials.class));

       return (TypeAdapter<T>) new TypeAdapter<SnowflakeUserCredentials>() {
           @Override
           public void write(JsonWriter out, SnowflakeUserCredentials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SnowflakeUserCredentials read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SnowflakeUserCredentials instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SnowflakeUserCredentials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SnowflakeUserCredentials
  * @throws IOException if the JSON string is invalid with respect to SnowflakeUserCredentials
  */
  public static SnowflakeUserCredentials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SnowflakeUserCredentials.class);
  }

 /**
  * Convert an instance of SnowflakeUserCredentials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

