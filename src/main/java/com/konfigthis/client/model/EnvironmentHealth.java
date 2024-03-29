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
 * Gets or Sets EnvironmentHealth
 */
@JsonAdapter(EnvironmentHealth.Adapter.class)public enum EnvironmentHealth {
  
  DELETING("Deleting"),
  
  DEPLOYING("Deploying"),
  
  FAILED_DEPLOY("Failed Deploy"),
  
  FAILED_DEV_RUN("Failed Dev Run"),
  
  FAILED_REFRESH("Failed Refresh"),
  
  INITIALIZING("Initializing"),
  
  REFRESHING("Refreshing"),
  
  RUNNING_DEV_RUN("Running Dev Run"),
  
  WAITING("Waiting");

  private String value;

  EnvironmentHealth(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnvironmentHealth fromValue(String value) {
    for (EnvironmentHealth b : EnvironmentHealth.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnvironmentHealth> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnvironmentHealth enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnvironmentHealth read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnvironmentHealth.fromValue(value);
    }
  }
}

