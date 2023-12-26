package com.example.datastoreservice.service.impl;

import com.example.datastoreservice.model.MeasurementType;
import com.example.datastoreservice.model.Summary;
import com.example.datastoreservice.model.SummaryType;
import com.example.datastoreservice.model.exception.SensorNotFoundException;
import com.example.datastoreservice.repository.SummaryRepository;
import com.example.datastoreservice.service.SummaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class SummaryServiceImpl implements SummaryService {

  public final SummaryRepository summaryRepository;

  @Override
  public Summary get(
          long sensorId,
          Set<MeasurementType> measurementTypes,
          Set<SummaryType> summaryTypes
  ) {
    return summaryRepository.findBySensorId(
                    sensorId,
                    measurementTypes == null ? Set.of(MeasurementType.values()) : measurementTypes,
                    summaryTypes == null ? Set.of(SummaryType.values()) : summaryTypes
            )
            .orElseThrow(SensorNotFoundException::new);
  }
}
