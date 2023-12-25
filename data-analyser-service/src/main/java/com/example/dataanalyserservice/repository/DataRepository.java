package com.example.dataanalyserservice.repository;

import com.example.dataanalyserservice.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
