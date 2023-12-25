package com.example.dataanalyserservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Table(name = "data")
@NoArgsConstructor
public class Data {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private long sensorId;
  private LocalDateTime timestamp;
  private double measurement;
  @Column(name = "type")
  @Enumerated(value = EnumType.STRING)
  private MeasurementType measurementType;

  public enum MeasurementType {
    TEMPERATURE,
    VOLTAGE,
    POWER
  }
}
