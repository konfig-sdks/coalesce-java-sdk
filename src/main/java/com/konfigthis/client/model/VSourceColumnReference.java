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
import com.konfigthis.client.model.ColumnReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * VSourceColumnReference
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VSourceColumnReference {
  public static final String SERIALIZED_NAME_COLUMN_REFERENCES = "columnReferences";
  @SerializedName(SERIALIZED_NAME_COLUMN_REFERENCES)
  private List<ColumnReference> columnReferences = null;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private String transform;

  public VSourceColumnReference() {
  }

  public VSourceColumnReference columnReferences(List<ColumnReference> columnReferences) {
    
    
    
    
    this.columnReferences = columnReferences;
    return this;
  }

  public VSourceColumnReference addColumnReferencesItem(ColumnReference columnReferencesItem) {
    if (this.columnReferences == null) {
      this.columnReferences = new ArrayList<>();
    }
    this.columnReferences.add(columnReferencesItem);
    return this;
  }

   /**
   * Get columnReferences
   * @return columnReferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ColumnReference> getColumnReferences() {
    return columnReferences;
  }


  public void setColumnReferences(List<ColumnReference> columnReferences) {
    
    
    
    this.columnReferences = columnReferences;
  }


  public VSourceColumnReference transform(String transform) {
    
    
    
    
    this.transform = transform;
    return this;
  }

   /**
   * Get transform
   * @return transform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTransform() {
    return transform;
  }


  public void setTransform(String transform) {
    
    
    
    this.transform = transform;
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
   * @return the VSourceColumnReference instance itself
   */
  public VSourceColumnReference putAdditionalProperty(String key, Object value) {
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
    VSourceColumnReference vsourceColumnReference = (VSourceColumnReference) o;
    return Objects.equals(this.columnReferences, vsourceColumnReference.columnReferences) &&
        Objects.equals(this.transform, vsourceColumnReference.transform)&&
        Objects.equals(this.additionalProperties, vsourceColumnReference.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnReferences, transform, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VSourceColumnReference {\n");
    sb.append("    columnReferences: ").append(toIndentedString(columnReferences)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
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
    openapiFields.add("columnReferences");
    openapiFields.add("transform");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transform");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VSourceColumnReference
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VSourceColumnReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VSourceColumnReference is not found in the empty JSON string", VSourceColumnReference.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VSourceColumnReference.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("columnReferences") != null && !jsonObj.get("columnReferences").isJsonNull()) {
        JsonArray jsonArraycolumnReferences = jsonObj.getAsJsonArray("columnReferences");
        if (jsonArraycolumnReferences != null) {
          // ensure the json data is an array
          if (!jsonObj.get("columnReferences").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `columnReferences` to be an array in the JSON string but got `%s`", jsonObj.get("columnReferences").toString()));
          }

          // validate the optional field `columnReferences` (array)
          for (int i = 0; i < jsonArraycolumnReferences.size(); i++) {
            ColumnReference.validateJsonObject(jsonArraycolumnReferences.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("transform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transform").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VSourceColumnReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VSourceColumnReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VSourceColumnReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VSourceColumnReference.class));

       return (TypeAdapter<T>) new TypeAdapter<VSourceColumnReference>() {
           @Override
           public void write(JsonWriter out, VSourceColumnReference value) throws IOException {
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
           public VSourceColumnReference read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VSourceColumnReference instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VSourceColumnReference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VSourceColumnReference
  * @throws IOException if the JSON string is invalid with respect to VSourceColumnReference
  */
  public static VSourceColumnReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VSourceColumnReference.class);
  }

 /**
  * Convert an instance of VSourceColumnReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
