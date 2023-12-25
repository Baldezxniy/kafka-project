package com.example.dataanalyserservice.service.impl;

import com.example.dataanalyserservice.model.Data;
import com.example.dataanalyserservice.service.KafkaDataReceiverService;
import com.example.dataanalyserservice.service.KafkaDataService;
import com.example.dataanalyserservice.util.LocalDateTimeDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.kafka.receiver.KafkaReceiver;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class KafkaDataReceiverServiceImpl implements KafkaDataReceiverService {

  private final KafkaReceiver<String, Object> receiver;
  private final LocalDateTimeDeserializer timeDeserializer;
  private final KafkaDataService kafkaDataService;

  @PostConstruct
  public void init() {
    fetch();
  }

  @Override
  public void fetch() {
    Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDateTime.class, timeDeserializer).create();

    receiver.receive().subscribe(receiver -> {
      Data data = gson.fromJson(receiver.value().toString(), Data.class);

      kafkaDataService.handle(data);

      receiver.receiverOffset().acknowledge(); // Указывает kafka что мы почитали сообщения. и ждем следующего
    });
  }
}
