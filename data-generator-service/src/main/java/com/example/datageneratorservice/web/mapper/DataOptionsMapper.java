package com.example.datageneratorservice.web.mapper;

import com.example.datageneratorservice.model.test.DataTestOptions;
import com.example.datageneratorservice.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
