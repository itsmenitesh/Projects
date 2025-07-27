package com.jobAPI.JobApi.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String location;
    private Double salary;

    private String companyName;
    private String employerName;
    @Enumerated(EnumType.STRING)//(JOB could be IT, HR , Sales, Marketing, etc...choose anything u want put the types should be in an enum)
    private JobType jobType;
    private LocalDate appliedDate;
}
