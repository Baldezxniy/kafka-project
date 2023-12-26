package com.example.datastoreservice.model.exception;

public class SensorNotFoundException extends RuntimeException {
  public SensorNotFoundException() {
  }

  public SensorNotFoundException(String message) {
    super(message);
  }

  public SensorNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public SensorNotFoundException(Throwable cause) {
    super(cause);
  }
}
