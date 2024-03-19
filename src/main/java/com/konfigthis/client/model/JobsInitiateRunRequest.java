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
import com.konfigthis.client.model.JobsInitiateRunRequestRunDetails;
import com.konfigthis.client.model.JobsInitiateRunRequestUserCredentials;
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
 * JobsInitiateRunRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobsInitiateRunRequest {
  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private String parameters;

  public static final String SERIALIZED_NAME_RUN_DETAILS = "runDetails";
  @SerializedName(SERIALIZED_NAME_RUN_DETAILS)
  private JobsInitiateRunRequestRunDetails runDetails;

  public static final String SERIALIZED_NAME_USER_CREDENTIALS = "userCredentials";
  @SerializedName(SERIALIZED_NAME_USER_CREDENTIALS)
  private JobsInitiateRunRequestUserCredentials userCredentials;

  public JobsInitiateRunRequest() {
  }

  public JobsInitiateRunRequest parameters(String parameters) {
    
    
    
    
    this.parameters = parameters;
    return this;
  }

   /**
   * Contains parameters to be used in the Refresh
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains parameters to be used in the Refresh")

  public String getParameters() {
    return parameters;
  }


  public void setParameters(String parameters) {
    
    
    
    this.parameters = parameters;
  }


  public JobsInitiateRunRequest runDetails(JobsInitiateRunRequestRunDetails runDetails) {
    
    
    
    
    this.runDetails = runDetails;
    return this;
  }

   /**
   * Get runDetails
   * @return runDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JobsInitiateRunRequestRunDetails getRunDetails() {
    return runDetails;
  }


  public void setRunDetails(JobsInitiateRunRequestRunDetails runDetails) {
    
    
    
    this.runDetails = runDetails;
  }


  public JobsInitiateRunRequest userCredentials(JobsInitiateRunRequestUserCredentials userCredentials) {
    
    
    
    
    this.userCredentials = userCredentials;
    return this;
  }

   /**
   * Get userCredentials
   * @return userCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobsInitiateRunRequestUserCredentials getUserCredentials() {
    return userCredentials;
  }


  public void setUserCredentials(JobsInitiateRunRequestUserCredentials userCredentials) {
    
    
    
    this.userCredentials = userCredentials;
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
   * @return the JobsInitiateRunRequest instance itself
   */
  public JobsInitiateRunRequest putAdditionalProperty(String key, Object value) {
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
    JobsInitiateRunRequest jobsInitiateRunRequest = (JobsInitiateRunRequest) o;
    return Objects.equals(this.parameters, jobsInitiateRunRequest.parameters) &&
        Objects.equals(this.runDetails, jobsInitiateRunRequest.runDetails) &&
        Objects.equals(this.userCredentials, jobsInitiateRunRequest.userCredentials)&&
        Objects.equals(this.additionalProperties, jobsInitiateRunRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, runDetails, userCredentials, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobsInitiateRunRequest {\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    runDetails: ").append(toIndentedString(runDetails)).append("\n");
    sb.append("    userCredentials: ").append(toIndentedString(userCredentials)).append("\n");
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
    openapiFields.add("parameters");
    openapiFields.add("runDetails");
    openapiFields.add("userCredentials");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("runDetails");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobsInitiateRunRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobsInitiateRunRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobsInitiateRunRequest is not found in the empty JSON string", JobsInitiateRunRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JobsInitiateRunRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) && !jsonObj.get("parameters").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameters` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
      }
      // validate the required field `runDetails`
      JobsInitiateRunRequestRunDetails.validateJsonObject(jsonObj.getAsJsonObject("runDetails"));
      // validate the optional field `userCredentials`
      if (jsonObj.get("userCredentials") != null && !jsonObj.get("userCredentials").isJsonNull()) {
        JobsInitiateRunRequestUserCredentials.validateJsonObject(jsonObj.getAsJsonObject("userCredentials"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobsInitiateRunRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobsInitiateRunRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobsInitiateRunRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobsInitiateRunRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<JobsInitiateRunRequest>() {
           @Override
           public void write(JsonWriter out, JobsInitiateRunRequest value) throws IOException {
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
           public JobsInitiateRunRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobsInitiateRunRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JobsInitiateRunRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobsInitiateRunRequest
  * @throws IOException if the JSON string is invalid with respect to JobsInitiateRunRequest
  */
  public static JobsInitiateRunRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobsInitiateRunRequest.class);
  }

 /**
  * Convert an instance of JobsInitiateRunRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

