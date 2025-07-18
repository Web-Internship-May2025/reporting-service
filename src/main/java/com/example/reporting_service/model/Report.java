package com.example.reporting_service.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "reports")
public class Report{

    @Id
    private String id;

    private String originalName;
    private String path;
    private String name;
    private String format;
    private Set<ReportType> reportTypes;
}
