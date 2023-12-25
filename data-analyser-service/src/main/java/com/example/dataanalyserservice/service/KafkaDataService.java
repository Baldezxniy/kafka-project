package com.example.dataanalyserservice.service;

import com.example.dataanalyserservice.model.Data;

public interface KafkaDataService {
  void handle(Data data);
}
