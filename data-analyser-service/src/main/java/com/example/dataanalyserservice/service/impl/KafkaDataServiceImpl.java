package com.example.dataanalyserservice.service.impl;

import com.example.dataanalyserservice.model.Data;
import com.example.dataanalyserservice.repository.DataRepository;
import com.example.dataanalyserservice.service.KafkaDataService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {

  public static final Logger LOG = LoggerFactory.getLogger(KafkaDataServiceImpl.class);

  private final DataRepository dataRepository;
  @Override
  public void handle(Data data) {
    LOG.info("Data object {} was saved.", data);
    dataRepository.save(data);
  }
}
