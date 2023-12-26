package com.example.datastoreservice.web.mapper;

import com.example.datastoreservice.model.Summary;
import com.example.datastoreservice.web.dto.SummaryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SummaryMapper extends Mappable<Summary, SummaryDto> {
}
