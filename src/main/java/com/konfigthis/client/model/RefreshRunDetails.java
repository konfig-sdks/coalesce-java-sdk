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
 * RefreshRunDetails
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RefreshRunDetails {
  public static final String SERIALIZED_NAME_CANCELED = "canceled";
  @SerializedName(SERIALIZED_NAME_CANCELED)
  private Boolean canceled;

  public static final String SERIALIZED_NAME_ENVIRONMENT_I_D = "environmentID";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_I_D)
  private String environmentID;

  public static final String SERIALIZED_NAME_EXCLUDE_NODES_SELECTOR = "excludeNodesSelector";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_NODES_SELECTOR)
  private String excludeNodesSelector;

  public static final String SERIALIZED_NAME_FORCE_IGNORE_ENVIRONMENT_STATUS = "forceIgnoreEnvironmentStatus";
  @SerializedName(SERIALIZED_NAME_FORCE_IGNORE_ENVIRONMENT_STATUS)
  private Boolean forceIgnoreEnvironmentStatus;

  public static final String SERIALIZED_NAME_INCLUDE_NODES_SELECTOR = "includeNodesSelector";
  @SerializedName(SERIALIZED_NAME_INCLUDE_NODES_SELECTOR)
  private String includeNodesSelector;

  public static final String SERIALIZED_NAME_JOB_I_D = "jobID";
  @SerializedName(SERIALIZED_NAME_JOB_I_D)
  private Integer jobID;

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";
  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  private Integer parallelism;

  public static final String SERIALIZED_NAME_REFRESH_DESCRIPTION = "refreshDescription";
  @SerializedName(SERIALIZED_NAME_REFRESH_DESCRIPTION)
  private String refreshDescription;

  public static final String SERIALIZED_NAME_NODES_FOR_REFRESH = "nodesForRefresh";
  @SerializedName(SERIALIZED_NAME_NODES_FOR_REFRESH)
  private Integer nodesForRefresh;

  public static final String SERIALIZED_NAME_NODES_IN_RUN = "nodesInRun";
  @SerializedName(SERIALIZED_NAME_NODES_IN_RUN)
  private Integer nodesInRun;

  public RefreshRunDetails() {
  }

  public RefreshRunDetails canceled(Boolean canceled) {
    
    
    
    
    this.canceled = canceled;
    return this;
  }

   /**
   * Get canceled
   * @return canceled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanceled() {
    return canceled;
  }


  public void setCanceled(Boolean canceled) {
    
    
    
    this.canceled = canceled;
  }


  public RefreshRunDetails environmentID(String environmentID) {
    
    
    
    
    this.environmentID = environmentID;
    return this;
  }

   /**
   * Get environmentID
   * @return environmentID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEnvironmentID() {
    return environmentID;
  }


  public void setEnvironmentID(String environmentID) {
    
    
    
    this.environmentID = environmentID;
  }


  public RefreshRunDetails excludeNodesSelector(String excludeNodesSelector) {
    
    
    
    
    this.excludeNodesSelector = excludeNodesSelector;
    return this;
  }

   /**
   * Get excludeNodesSelector
   * @return excludeNodesSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExcludeNodesSelector() {
    return excludeNodesSelector;
  }


  public void setExcludeNodesSelector(String excludeNodesSelector) {
    
    
    
    this.excludeNodesSelector = excludeNodesSelector;
  }


  public RefreshRunDetails forceIgnoreEnvironmentStatus(Boolean forceIgnoreEnvironmentStatus) {
    
    
    
    
    this.forceIgnoreEnvironmentStatus = forceIgnoreEnvironmentStatus;
    return this;
  }

   /**
   * Get forceIgnoreEnvironmentStatus
   * @return forceIgnoreEnvironmentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getForceIgnoreEnvironmentStatus() {
    return forceIgnoreEnvironmentStatus;
  }


  public void setForceIgnoreEnvironmentStatus(Boolean forceIgnoreEnvironmentStatus) {
    
    
    
    this.forceIgnoreEnvironmentStatus = forceIgnoreEnvironmentStatus;
  }


  public RefreshRunDetails includeNodesSelector(String includeNodesSelector) {
    
    
    
    
    this.includeNodesSelector = includeNodesSelector;
    return this;
  }

   /**
   * Get includeNodesSelector
   * @return includeNodesSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIncludeNodesSelector() {
    return includeNodesSelector;
  }


  public void setIncludeNodesSelector(String includeNodesSelector) {
    
    
    
    this.includeNodesSelector = includeNodesSelector;
  }


  public RefreshRunDetails jobID(Integer jobID) {
    
    
    
    
    this.jobID = jobID;
    return this;
  }

   /**
   * Get jobID
   * @return jobID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getJobID() {
    return jobID;
  }


  public void setJobID(Integer jobID) {
    
    
    
    this.jobID = jobID;
  }


  public RefreshRunDetails parallelism(Integer parallelism) {
    
    
    
    
    this.parallelism = parallelism;
    return this;
  }

   /**
   * Get parallelism
   * @return parallelism
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getParallelism() {
    return parallelism;
  }


  public void setParallelism(Integer parallelism) {
    
    
    
    this.parallelism = parallelism;
  }


  public RefreshRunDetails refreshDescription(String refreshDescription) {
    
    
    
    
    this.refreshDescription = refreshDescription;
    return this;
  }

   /**
   * Get refreshDescription
   * @return refreshDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefreshDescription() {
    return refreshDescription;
  }


  public void setRefreshDescription(String refreshDescription) {
    
    
    
    this.refreshDescription = refreshDescription;
  }


  public RefreshRunDetails nodesForRefresh(Integer nodesForRefresh) {
    
    
    
    
    this.nodesForRefresh = nodesForRefresh;
    return this;
  }

   /**
   * Get nodesForRefresh
   * @return nodesForRefresh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNodesForRefresh() {
    return nodesForRefresh;
  }


  public void setNodesForRefresh(Integer nodesForRefresh) {
    
    
    
    this.nodesForRefresh = nodesForRefresh;
  }


  public RefreshRunDetails nodesInRun(Integer nodesInRun) {
    
    
    
    
    this.nodesInRun = nodesInRun;
    return this;
  }

   /**
   * Get nodesInRun
   * @return nodesInRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNodesInRun() {
    return nodesInRun;
  }


  public void setNodesInRun(Integer nodesInRun) {
    
    
    
    this.nodesInRun = nodesInRun;
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
   * @return the RefreshRunDetails instance itself
   */
  public RefreshRunDetails putAdditionalProperty(String key, Object value) {
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
    RefreshRunDetails refreshRunDetails = (RefreshRunDetails) o;
    return Objects.equals(this.canceled, refreshRunDetails.canceled) &&
        Objects.equals(this.environmentID, refreshRunDetails.environmentID) &&
        Objects.equals(this.excludeNodesSelector, refreshRunDetails.excludeNodesSelector) &&
        Objects.equals(this.forceIgnoreEnvironmentStatus, refreshRunDetails.forceIgnoreEnvironmentStatus) &&
        Objects.equals(this.includeNodesSelector, refreshRunDetails.includeNodesSelector) &&
        Objects.equals(this.jobID, refreshRunDetails.jobID) &&
        Objects.equals(this.parallelism, refreshRunDetails.parallelism) &&
        Objects.equals(this.refreshDescription, refreshRunDetails.refreshDescription) &&
        Objects.equals(this.nodesForRefresh, refreshRunDetails.nodesForRefresh) &&
        Objects.equals(this.nodesInRun, refreshRunDetails.nodesInRun)&&
        Objects.equals(this.additionalProperties, refreshRunDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canceled, environmentID, excludeNodesSelector, forceIgnoreEnvironmentStatus, includeNodesSelector, jobID, parallelism, refreshDescription, nodesForRefresh, nodesInRun, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshRunDetails {\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    environmentID: ").append(toIndentedString(environmentID)).append("\n");
    sb.append("    excludeNodesSelector: ").append(toIndentedString(excludeNodesSelector)).append("\n");
    sb.append("    forceIgnoreEnvironmentStatus: ").append(toIndentedString(forceIgnoreEnvironmentStatus)).append("\n");
    sb.append("    includeNodesSelector: ").append(toIndentedString(includeNodesSelector)).append("\n");
    sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    refreshDescription: ").append(toIndentedString(refreshDescription)).append("\n");
    sb.append("    nodesForRefresh: ").append(toIndentedString(nodesForRefresh)).append("\n");
    sb.append("    nodesInRun: ").append(toIndentedString(nodesInRun)).append("\n");
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
    openapiFields.add("canceled");
    openapiFields.add("environmentID");
    openapiFields.add("excludeNodesSelector");
    openapiFields.add("forceIgnoreEnvironmentStatus");
    openapiFields.add("includeNodesSelector");
    openapiFields.add("jobID");
    openapiFields.add("parallelism");
    openapiFields.add("refreshDescription");
    openapiFields.add("nodesForRefresh");
    openapiFields.add("nodesInRun");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("environmentID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RefreshRunDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RefreshRunDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RefreshRunDetails is not found in the empty JSON string", RefreshRunDetails.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RefreshRunDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("environmentID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environmentID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environmentID").toString()));
      }
      if ((jsonObj.get("excludeNodesSelector") != null && !jsonObj.get("excludeNodesSelector").isJsonNull()) && !jsonObj.get("excludeNodesSelector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludeNodesSelector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("excludeNodesSelector").toString()));
      }
      if ((jsonObj.get("includeNodesSelector") != null && !jsonObj.get("includeNodesSelector").isJsonNull()) && !jsonObj.get("includeNodesSelector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeNodesSelector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("includeNodesSelector").toString()));
      }
      if ((jsonObj.get("refreshDescription") != null && !jsonObj.get("refreshDescription").isJsonNull()) && !jsonObj.get("refreshDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refreshDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refreshDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RefreshRunDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RefreshRunDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RefreshRunDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RefreshRunDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<RefreshRunDetails>() {
           @Override
           public void write(JsonWriter out, RefreshRunDetails value) throws IOException {
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
           public RefreshRunDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RefreshRunDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RefreshRunDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RefreshRunDetails
  * @throws IOException if the JSON string is invalid with respect to RefreshRunDetails
  */
  public static RefreshRunDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RefreshRunDetails.class);
  }

 /**
  * Convert an instance of RefreshRunDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

