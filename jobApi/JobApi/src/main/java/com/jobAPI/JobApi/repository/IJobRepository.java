package com.jobAPI.JobApi.repository;

import com.jobAPI.JobApi.module.Job;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepository extends CrudRepository<Job , Long> {
    //GetJobByTitle
    public List<Job>findByTitle(String title);

    //GetJobByDescription
    public List<Job>findByDescription(String description);

//@Modifying
//    @Query(value = "update job set JOB_TYPE = :myType where id= :id",nativeQuery = true)
//    void modifyJobtypeById(String myType , Long id);
@Modifying
@Query(value = "UPDATE job SET job_type = :myType WHERE id = :id", nativeQuery = true)
void modifyJobTypeById(String myType, Long id);

}
