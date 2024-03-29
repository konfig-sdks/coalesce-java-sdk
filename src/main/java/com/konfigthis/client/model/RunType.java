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
 * Gets or Sets RunType
 */
@JsonAdapter(RunType.Adapter.class)public enum RunType {
  
  DEPLOY("deploy"),
  
  REFRESH("refresh");

  private String value;

  RunType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RunType fromValue(String value) {
    for (RunType b : RunType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RunType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RunType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RunType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RunType.fromValue(value);
    }
  }
}

