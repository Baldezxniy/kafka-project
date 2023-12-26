package com.example.datastoreservice.service;

import com.example.datastoreservice.model.MeasurementType;
import com.example.datastoreservice.model.Summary;
import com.example.datastoreservice.model.SummaryType;

import java.util.Set;

public interface SummaryService {

  Summary get(
          long sensorId,
          Set<MeasurementType> measurementTypes,
          Set<SummaryType> summaryTypes
  );
}
