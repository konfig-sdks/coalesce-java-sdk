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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets NodeType
 */
@JsonAdapter(NodeType.Adapter.class)public enum NodeType {
  
  DIMENSION("Dimension"),
  
  FACT("Fact"),
  
  HUB("Hub"),
  
  LINK("Link"),
  
  SATELLITE("Satellite"),
  
  SOURCE("Source"),
  
  STAGE("Stage"),
  
  VIEW("View"),
  
  PERSISTENTSTAGE("persistentStage");

  private String value;

  NodeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NodeType fromValue(String value) {
    for (NodeType b : NodeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NodeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NodeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NodeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NodeType.fromValue(value);
    }
  }
}
