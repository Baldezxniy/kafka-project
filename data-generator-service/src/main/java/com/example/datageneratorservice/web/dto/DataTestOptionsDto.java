package com.example.datageneratorservice.web.dto;

import com.example.datageneratorservice.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataTestOptionsDto {
  private int delayInSeconds;

  private Data.MeasurementType[] measurementTypes;
}
