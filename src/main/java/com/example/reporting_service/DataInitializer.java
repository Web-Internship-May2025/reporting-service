package com.example.reporting_service;

import com.example.reporting_service.repository.ReportRepository;
import com.example.reporting_service.repository.ReportTypeRepository;
import com.example.reporting_service.model.Report;
import com.example.reporting_service.model.ReportType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;


@Component
public class DataInitializer implements CommandLineRunner{

    @Autowired
    ReportRepository reportRepository;
    @Autowired
    ReportTypeRepository reportTypeRepository;

    @Override
    public void run(String... args) throws Exception {
        ReportType reportType1 = new ReportType(null, "POLICY_REPORT");
        ReportType reportType2 = new ReportType(null, "POLICY");
        ReportType reportType3 = new ReportType(null, "OFFER");
        reportTypeRepository.save(reportType1);
        reportTypeRepository.save(reportType2);
        reportTypeRepository.save(reportType3);

        Set<ReportType> reportTypes =  new HashSet<>(reportTypeRepository.findAll());

        Report report1 = new Report(null, "Sample Title 1", "Description 1", "User1", "2024-04-27", reportTypes);
        Report report2 = new Report(null, "Sample Title 2", "Description 2", "User2", "2024-04-28", reportTypes);
        reportRepository.save(report1);
        reportRepository.save(report2);

    }
}
