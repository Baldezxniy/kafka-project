package com.example.dataanalyserservice.service.impl;

import com.example.dataanalyserservice.model.Data;
import com.example.dataanalyserservice.service.KafkaDataService;
import org.springframework.stereotype.Service;

@Service
public class KafkaDataServiceImpl implements KafkaDataService {

  @Override
  public void handle(Data data) {
    System.out.println("Data object is received: " + data.toString());
  }
}
