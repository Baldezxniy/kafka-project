package com.example.datageneratorservice.model.test;

import com.example.datageneratorservice.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataTestOptions {
  private int delayInSeconds;

  private Data.MeasurementType[] measurementTypes;
}
