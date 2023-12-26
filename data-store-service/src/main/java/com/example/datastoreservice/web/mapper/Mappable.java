package com.example.datastoreservice.web.mapper;

import java.util.List;

public interface Mappable<E, D> {
  E toEntity(D d);

  List<E> toEntity(List<D> d);

  D toDto(E E);

  List<D> toDto(List<E> E);
}
