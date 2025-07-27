package com.jobAPI.JobApi.service;

import com.jobAPI.JobApi.module.Job;
import com.jobAPI.JobApi.module.JobType;
import com.jobAPI.JobApi.repository.IJobRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    IJobRepository iJobRepository;

    //Using CrudRepository

    //getAllJob
    public Iterable<Job> getAllJob(){
        Iterable<Job> allJob = iJobRepository.findAll();
        return allJob;
    }
    //AddJob
    public String addJob(List<Job> jobList){
        Iterable<Job> addedJob = iJobRepository.saveAll(jobList);
        if(addedJob != null){
            return "YES";
        }else {
            return "NO";
        }
    }


    //DeleteById
    public void removeJObById(Long id){
        iJobRepository.deleteById(id);
    }


    //GetJobByTitle
    public List<Job> fetchJobByTitle(String title){
        return iJobRepository.findByTitle(title);
    }

    //GetJobByDescription
    public List<Job> fetchJobByDescription(String description){
        return iJobRepository.findByDescription(description);
    }


@Transactional
public void updateJobById(JobType jobType, Long id) {
    String enumValue = jobType.name();
    iJobRepository.modifyJobTypeById(enumValue, id);
}


}
