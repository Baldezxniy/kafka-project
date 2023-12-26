package com.example.datastoreservice.web.controller;

import com.example.datastoreservice.model.exception.SensorNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {
  @ExceptionHandler(SensorNotFoundException.class)
  public String sensorNotFound(SensorNotFoundException e) {
    return "Sensor id nor found.";
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public String server(Exception e) {
    e.printStackTrace();
    return "Something happened.";
  }
}
