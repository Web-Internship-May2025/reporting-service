package com.example.reporting_service.repository;

import com.example.reporting_service.model.ReportType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportTypeRepository extends MongoRepository<ReportType, String> {
}
