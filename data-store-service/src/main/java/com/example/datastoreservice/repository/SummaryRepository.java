package com.example.datastoreservice.repository;

import com.example.datastoreservice.model.MeasurementType;
import com.example.datastoreservice.model.Summary;
import com.example.datastoreservice.model.SummaryType;

import java.util.Optional;
import java.util.Set;

public interface SummaryRepository {
  Optional<Summary> findBySensorId(
          long sensorId,
          Set<MeasurementType> measurementTypes,
          Set<SummaryType> summaryTypes
  );
}
