package com.example.datastoreservice.config;

import com.example.datastoreservice.model.MeasurementType;

public class RedisSchema {
  // set
  public static String sensorKeys() {
    return KeyHelper.getKey("sensors");
  }

  // hash with summary type
  public static String summaryKey(long sensorId, MeasurementType measurementType) {
    return KeyHelper.getKey("sensors:" + sensorId + ":" + measurementType.name().toLowerCase());
  }
}
