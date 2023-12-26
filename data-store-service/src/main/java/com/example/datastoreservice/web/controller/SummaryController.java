package com.example.datastoreservice.web.controller;

import com.example.datastoreservice.model.MeasurementType;
import com.example.datastoreservice.model.Summary;
import com.example.datastoreservice.model.SummaryType;
import com.example.datastoreservice.service.SummaryService;
import com.example.datastoreservice.web.dto.SummaryDto;
import com.example.datastoreservice.web.mapper.SummaryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/analytics")
public class SummaryController {

  public final SummaryService summaryService;
  public final SummaryMapper summaryMapper;

  @GetMapping("/summary/{sensorId}")
  public SummaryDto getSummary(
          @PathVariable long sensorId,
          @RequestParam(value = "mt", required = false) Set<MeasurementType> measurementTypes,
          @RequestParam(value = "st", required = false) Set<SummaryType> summaryTypes
  ) {
    Summary summary = summaryService.get(sensorId, measurementTypes, summaryTypes);

    return summaryMapper.toDto(summary);
  }
}
