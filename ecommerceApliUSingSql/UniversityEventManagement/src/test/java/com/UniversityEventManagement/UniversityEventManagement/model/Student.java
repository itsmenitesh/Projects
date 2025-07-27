package com.UniversityEventManagement.UniversityEventManagement.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    @NotNull
    private int age;
    private String department;
}
