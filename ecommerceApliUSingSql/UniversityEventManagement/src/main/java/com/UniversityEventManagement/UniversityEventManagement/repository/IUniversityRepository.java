package com.universityEventManagement.UniversityEventManagement.repository;

import com.universityEventManagement.UniversityEventManagement.module.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUniversity extends CrudRepository<Student , Long> {
}
