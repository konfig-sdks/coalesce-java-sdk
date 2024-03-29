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
import com.konfigthis.client.model.HashMetadata;
import com.konfigthis.client.model.IntermediateColumnRefResult;
import com.konfigthis.client.model.VSourceColumnReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * ColumnMetadata
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ColumnMetadata {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_APPLIED_COLUMN_TESTS = "appliedColumnTests";
  @SerializedName(SERIALIZED_NAME_APPLIED_COLUMN_TESTS)
  private Map<String, Boolean> appliedColumnTests = null;

  public static final String SERIALIZED_NAME_COLUMN_I_D = "columnID";
  @SerializedName(SERIALIZED_NAME_COLUMN_I_D)
  private String columnID;

  public static final String SERIALIZED_NAME_COLUMN_REFERENCES = "columnReferences";
  @SerializedName(SERIALIZED_NAME_COLUMN_REFERENCES)
  private List<IntermediateColumnRefResult> columnReferences = null;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Map<String, Object> config = null;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_HASH_DETAILS = "hashDetails";
  @SerializedName(SERIALIZED_NAME_HASH_DETAILS)
  private HashMetadata hashDetails;

  public static final String SERIALIZED_NAME_HASHED_COLUMNS = "hashedColumns";
  @SerializedName(SERIALIZED_NAME_HASHED_COLUMNS)
  private List<ColumnReference> hashedColumns = null;

  public static final String SERIALIZED_NAME_IS_BUSINESS_KEY = "isBusinessKey";
  @SerializedName(SERIALIZED_NAME_IS_BUSINESS_KEY)
  private Boolean isBusinessKey;

  public static final String SERIALIZED_NAME_IS_CHANGE_TRACKING = "isChangeTracking";
  @SerializedName(SERIALIZED_NAME_IS_CHANGE_TRACKING)
  private Boolean isChangeTracking;

  public static final String SERIALIZED_NAME_IS_SURROGATE_KEY = "isSurrogateKey";
  @SerializedName(SERIALIZED_NAME_IS_SURROGATE_KEY)
  private Boolean isSurrogateKey;

  /**
   * Gets or Sets keyColumnType
   */
  @JsonAdapter(KeyColumnTypeEnum.Adapter.class)
 public enum KeyColumnTypeEnum {
    NONE("None"),
    
    PRIMARYBUSINESSKEY("primaryBusinessKey"),
    
    SURROGATEKEY("surrogateKey");

    private String value;

    KeyColumnTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyColumnTypeEnum fromValue(String value) {
      for (KeyColumnTypeEnum b : KeyColumnTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KeyColumnTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyColumnTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyColumnTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KeyColumnTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KEY_COLUMN_TYPE = "keyColumnType";
  @SerializedName(SERIALIZED_NAME_KEY_COLUMN_TYPE)
  private KeyColumnTypeEnum keyColumnType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NULLABLE = "nullable";
  @SerializedName(SERIALIZED_NAME_NULLABLE)
  private Boolean nullable;

  public static final String SERIALIZED_NAME_PRIMARY_KEY = "primaryKey";
  @SerializedName(SERIALIZED_NAME_PRIMARY_KEY)
  private Boolean primaryKey;

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<VSourceColumnReference> sources = null;

  /**
   * Gets or Sets systemColumnType
   */
  @JsonAdapter(SystemColumnTypeEnum.Adapter.class)
 public enum SystemColumnTypeEnum {
    NONE("None"),
    
    SYSCREATEDATE("sysCreateDate"),
    
    SYSCURRENTFLAG("sysCurrentFlag"),
    
    SYSENDDATE("sysEndDate"),
    
    SYSSTARTDATE("sysStartDate"),
    
    SYSUPDATEDATE("sysUpdateDate"),
    
    SYSVERSION("sysVersion");

    private String value;

    SystemColumnTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SystemColumnTypeEnum fromValue(String value) {
      for (SystemColumnTypeEnum b : SystemColumnTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SystemColumnTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SystemColumnTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SystemColumnTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SystemColumnTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SYSTEM_COLUMN_TYPE = "systemColumnType";
  @SerializedName(SERIALIZED_NAME_SYSTEM_COLUMN_TYPE)
  private SystemColumnTypeEnum systemColumnType;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private String transform;

  public static final String SERIALIZED_NAME_UNIQUE_KEY = "uniqueKey";
  @SerializedName(SERIALIZED_NAME_UNIQUE_KEY)
  private Boolean uniqueKey;

  public ColumnMetadata() {
  }

  public ColumnMetadata description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ColumnMetadata appliedColumnTests(Map<String, Boolean> appliedColumnTests) {
    
    
    
    
    this.appliedColumnTests = appliedColumnTests;
    return this;
  }

  public ColumnMetadata putAppliedColumnTestsItem(String key, Boolean appliedColumnTestsItem) {
    if (this.appliedColumnTests == null) {
      this.appliedColumnTests = new HashMap<>();
    }
    this.appliedColumnTests.put(key, appliedColumnTestsItem);
    return this;
  }

   /**
   * Get appliedColumnTests
   * @return appliedColumnTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Boolean> getAppliedColumnTests() {
    return appliedColumnTests;
  }


  public void setAppliedColumnTests(Map<String, Boolean> appliedColumnTests) {
    
    
    
    this.appliedColumnTests = appliedColumnTests;
  }


  public ColumnMetadata columnID(String columnID) {
    
    
    
    
    this.columnID = columnID;
    return this;
  }

   /**
   * Get columnID
   * @return columnID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getColumnID() {
    return columnID;
  }


  public void setColumnID(String columnID) {
    
    
    
    this.columnID = columnID;
  }


  public ColumnMetadata columnReferences(List<IntermediateColumnRefResult> columnReferences) {
    
    
    
    
    this.columnReferences = columnReferences;
    return this;
  }

  public ColumnMetadata addColumnReferencesItem(IntermediateColumnRefResult columnReferencesItem) {
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

  public List<IntermediateColumnRefResult> getColumnReferences() {
    return columnReferences;
  }


  public void setColumnReferences(List<IntermediateColumnRefResult> columnReferences) {
    
    
    
    this.columnReferences = columnReferences;
  }


  public ColumnMetadata config(Map<String, Object> config) {
    
    
    
    
    this.config = config;
    return this;
  }

  public ColumnMetadata putConfigItem(String key, Object configItem) {
    if (this.config == null) {
      this.config = new HashMap<>();
    }
    this.config.put(key, configItem);
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getConfig() {
    return config;
  }


  public void setConfig(Map<String, Object> config) {
    
    
    
    this.config = config;
  }


  public ColumnMetadata dataType(String dataType) {
    
    
    
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    
    
    
    this.dataType = dataType;
  }


  public ColumnMetadata defaultValue(String defaultValue) {
    
    
    
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(String defaultValue) {
    
    
    
    this.defaultValue = defaultValue;
  }


  public ColumnMetadata hashDetails(HashMetadata hashDetails) {
    
    
    
    
    this.hashDetails = hashDetails;
    return this;
  }

   /**
   * Get hashDetails
   * @return hashDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HashMetadata getHashDetails() {
    return hashDetails;
  }


  public void setHashDetails(HashMetadata hashDetails) {
    
    
    
    this.hashDetails = hashDetails;
  }


  public ColumnMetadata hashedColumns(List<ColumnReference> hashedColumns) {
    
    
    
    
    this.hashedColumns = hashedColumns;
    return this;
  }

  public ColumnMetadata addHashedColumnsItem(ColumnReference hashedColumnsItem) {
    if (this.hashedColumns == null) {
      this.hashedColumns = new ArrayList<>();
    }
    this.hashedColumns.add(hashedColumnsItem);
    return this;
  }

   /**
   * Get hashedColumns
   * @return hashedColumns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ColumnReference> getHashedColumns() {
    return hashedColumns;
  }


  public void setHashedColumns(List<ColumnReference> hashedColumns) {
    
    
    
    this.hashedColumns = hashedColumns;
  }


  public ColumnMetadata isBusinessKey(Boolean isBusinessKey) {
    
    
    
    
    this.isBusinessKey = isBusinessKey;
    return this;
  }

   /**
   * Tags the column as a business key.
   * @return isBusinessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags the column as a business key.")

  public Boolean getIsBusinessKey() {
    return isBusinessKey;
  }


  public void setIsBusinessKey(Boolean isBusinessKey) {
    
    
    
    this.isBusinessKey = isBusinessKey;
  }


  public ColumnMetadata isChangeTracking(Boolean isChangeTracking) {
    
    
    
    
    this.isChangeTracking = isChangeTracking;
    return this;
  }

   /**
   * Tags the column as a change tracking column in type 2 dimensions.
   * @return isChangeTracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags the column as a change tracking column in type 2 dimensions.")

  public Boolean getIsChangeTracking() {
    return isChangeTracking;
  }


  public void setIsChangeTracking(Boolean isChangeTracking) {
    
    
    
    this.isChangeTracking = isChangeTracking;
  }


  public ColumnMetadata isSurrogateKey(Boolean isSurrogateKey) {
    
    
    
    
    this.isSurrogateKey = isSurrogateKey;
    return this;
  }

   /**
   * Tags the column as a surrogate key, e.g. DIM_CUSTOMER_KEY.
   * @return isSurrogateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags the column as a surrogate key, e.g. DIM_CUSTOMER_KEY.")

  public Boolean getIsSurrogateKey() {
    return isSurrogateKey;
  }


  public void setIsSurrogateKey(Boolean isSurrogateKey) {
    
    
    
    this.isSurrogateKey = isSurrogateKey;
  }


  public ColumnMetadata keyColumnType(KeyColumnTypeEnum keyColumnType) {
    
    
    
    
    this.keyColumnType = keyColumnType;
    return this;
  }

   /**
   * Get keyColumnType
   * @return keyColumnType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyColumnTypeEnum getKeyColumnType() {
    return keyColumnType;
  }


  public void setKeyColumnType(KeyColumnTypeEnum keyColumnType) {
    
    
    
    this.keyColumnType = keyColumnType;
  }


  public ColumnMetadata name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ColumnMetadata nullable(Boolean nullable) {
    
    
    
    
    this.nullable = nullable;
    return this;
  }

   /**
   * Get nullable
   * @return nullable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getNullable() {
    return nullable;
  }


  public void setNullable(Boolean nullable) {
    
    
    
    this.nullable = nullable;
  }


  public ColumnMetadata primaryKey(Boolean primaryKey) {
    
    
    
    
    this.primaryKey = primaryKey;
    return this;
  }

   /**
   * Tags the column as a primary key.
   * @return primaryKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags the column as a primary key.")

  public Boolean getPrimaryKey() {
    return primaryKey;
  }


  public void setPrimaryKey(Boolean primaryKey) {
    
    
    
    this.primaryKey = primaryKey;
  }


  public ColumnMetadata sources(List<VSourceColumnReference> sources) {
    
    
    
    
    this.sources = sources;
    return this;
  }

  public ColumnMetadata addSourcesItem(VSourceColumnReference sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Get sources
   * @return sources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VSourceColumnReference> getSources() {
    return sources;
  }


  public void setSources(List<VSourceColumnReference> sources) {
    
    
    
    this.sources = sources;
  }


  public ColumnMetadata systemColumnType(SystemColumnTypeEnum systemColumnType) {
    
    
    
    
    this.systemColumnType = systemColumnType;
    return this;
  }

   /**
   * Get systemColumnType
   * @return systemColumnType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SystemColumnTypeEnum getSystemColumnType() {
    return systemColumnType;
  }


  public void setSystemColumnType(SystemColumnTypeEnum systemColumnType) {
    
    
    
    this.systemColumnType = systemColumnType;
  }


  public ColumnMetadata transform(String transform) {
    
    
    
    
    this.transform = transform;
    return this;
  }

   /**
   * Get transform
   * @return transform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransform() {
    return transform;
  }


  public void setTransform(String transform) {
    
    
    
    this.transform = transform;
  }


  public ColumnMetadata uniqueKey(Boolean uniqueKey) {
    
    
    
    
    this.uniqueKey = uniqueKey;
    return this;
  }

   /**
   * Get uniqueKey
   * @return uniqueKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUniqueKey() {
    return uniqueKey;
  }


  public void setUniqueKey(Boolean uniqueKey) {
    
    
    
    this.uniqueKey = uniqueKey;
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
   * @return the ColumnMetadata instance itself
   */
  public ColumnMetadata putAdditionalProperty(String key, Object value) {
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
    ColumnMetadata columnMetadata = (ColumnMetadata) o;
    return Objects.equals(this.description, columnMetadata.description) &&
        Objects.equals(this.appliedColumnTests, columnMetadata.appliedColumnTests) &&
        Objects.equals(this.columnID, columnMetadata.columnID) &&
        Objects.equals(this.columnReferences, columnMetadata.columnReferences) &&
        Objects.equals(this.config, columnMetadata.config) &&
        Objects.equals(this.dataType, columnMetadata.dataType) &&
        Objects.equals(this.defaultValue, columnMetadata.defaultValue) &&
        Objects.equals(this.hashDetails, columnMetadata.hashDetails) &&
        Objects.equals(this.hashedColumns, columnMetadata.hashedColumns) &&
        Objects.equals(this.isBusinessKey, columnMetadata.isBusinessKey) &&
        Objects.equals(this.isChangeTracking, columnMetadata.isChangeTracking) &&
        Objects.equals(this.isSurrogateKey, columnMetadata.isSurrogateKey) &&
        Objects.equals(this.keyColumnType, columnMetadata.keyColumnType) &&
        Objects.equals(this.name, columnMetadata.name) &&
        Objects.equals(this.nullable, columnMetadata.nullable) &&
        Objects.equals(this.primaryKey, columnMetadata.primaryKey) &&
        Objects.equals(this.sources, columnMetadata.sources) &&
        Objects.equals(this.systemColumnType, columnMetadata.systemColumnType) &&
        Objects.equals(this.transform, columnMetadata.transform) &&
        Objects.equals(this.uniqueKey, columnMetadata.uniqueKey)&&
        Objects.equals(this.additionalProperties, columnMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, appliedColumnTests, columnID, columnReferences, config, dataType, defaultValue, hashDetails, hashedColumns, isBusinessKey, isChangeTracking, isSurrogateKey, keyColumnType, name, nullable, primaryKey, sources, systemColumnType, transform, uniqueKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnMetadata {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    appliedColumnTests: ").append(toIndentedString(appliedColumnTests)).append("\n");
    sb.append("    columnID: ").append(toIndentedString(columnID)).append("\n");
    sb.append("    columnReferences: ").append(toIndentedString(columnReferences)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    hashDetails: ").append(toIndentedString(hashDetails)).append("\n");
    sb.append("    hashedColumns: ").append(toIndentedString(hashedColumns)).append("\n");
    sb.append("    isBusinessKey: ").append(toIndentedString(isBusinessKey)).append("\n");
    sb.append("    isChangeTracking: ").append(toIndentedString(isChangeTracking)).append("\n");
    sb.append("    isSurrogateKey: ").append(toIndentedString(isSurrogateKey)).append("\n");
    sb.append("    keyColumnType: ").append(toIndentedString(keyColumnType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
    sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    systemColumnType: ").append(toIndentedString(systemColumnType)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("appliedColumnTests");
    openapiFields.add("columnID");
    openapiFields.add("columnReferences");
    openapiFields.add("config");
    openapiFields.add("dataType");
    openapiFields.add("defaultValue");
    openapiFields.add("hashDetails");
    openapiFields.add("hashedColumns");
    openapiFields.add("isBusinessKey");
    openapiFields.add("isChangeTracking");
    openapiFields.add("isSurrogateKey");
    openapiFields.add("keyColumnType");
    openapiFields.add("name");
    openapiFields.add("nullable");
    openapiFields.add("primaryKey");
    openapiFields.add("sources");
    openapiFields.add("systemColumnType");
    openapiFields.add("transform");
    openapiFields.add("uniqueKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("columnID");
    openapiRequiredFields.add("dataType");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("nullable");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ColumnMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ColumnMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ColumnMetadata is not found in the empty JSON string", ColumnMetadata.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ColumnMetadata.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("columnID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("columnID").toString()));
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
            IntermediateColumnRefResult.validateJsonObject(jsonArraycolumnReferences.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
      if ((jsonObj.get("defaultValue") != null && !jsonObj.get("defaultValue").isJsonNull()) && !jsonObj.get("defaultValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultValue").toString()));
      }
      // validate the optional field `hashDetails`
      if (jsonObj.get("hashDetails") != null && !jsonObj.get("hashDetails").isJsonNull()) {
        HashMetadata.validateJsonObject(jsonObj.getAsJsonObject("hashDetails"));
      }
      if (jsonObj.get("hashedColumns") != null && !jsonObj.get("hashedColumns").isJsonNull()) {
        JsonArray jsonArrayhashedColumns = jsonObj.getAsJsonArray("hashedColumns");
        if (jsonArrayhashedColumns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hashedColumns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hashedColumns` to be an array in the JSON string but got `%s`", jsonObj.get("hashedColumns").toString()));
          }

          // validate the optional field `hashedColumns` (array)
          for (int i = 0; i < jsonArrayhashedColumns.size(); i++) {
            ColumnReference.validateJsonObject(jsonArrayhashedColumns.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("keyColumnType") != null && !jsonObj.get("keyColumnType").isJsonNull()) && !jsonObj.get("keyColumnType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyColumnType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyColumnType").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("sources") != null && !jsonObj.get("sources").isJsonNull()) {
        JsonArray jsonArraysources = jsonObj.getAsJsonArray("sources");
        if (jsonArraysources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sources` to be an array in the JSON string but got `%s`", jsonObj.get("sources").toString()));
          }

          // validate the optional field `sources` (array)
          for (int i = 0; i < jsonArraysources.size(); i++) {
            VSourceColumnReference.validateJsonObject(jsonArraysources.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("systemColumnType") != null && !jsonObj.get("systemColumnType").isJsonNull()) && !jsonObj.get("systemColumnType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `systemColumnType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("systemColumnType").toString()));
      }
      if ((jsonObj.get("transform") != null && !jsonObj.get("transform").isJsonNull()) && !jsonObj.get("transform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transform").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ColumnMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ColumnMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ColumnMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ColumnMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ColumnMetadata>() {
           @Override
           public void write(JsonWriter out, ColumnMetadata value) throws IOException {
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
           public ColumnMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ColumnMetadata instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ColumnMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ColumnMetadata
  * @throws IOException if the JSON string is invalid with respect to ColumnMetadata
  */
  public static ColumnMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ColumnMetadata.class);
  }

 /**
  * Convert an instance of ColumnMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

