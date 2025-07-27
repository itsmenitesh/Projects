package com.jobAPI.JobApi.controller;

import com.jobAPI.JobApi.module.Job;
import com.jobAPI.JobApi.module.JobType;
import com.jobAPI.JobApi.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    //Using CrudRepository

    //GetAllJob
    @GetMapping(value = "/job")
    public Iterable<Job> getJob(){
        return jobService.getAllJob();
    }

    //AddJob
    @PostMapping(value = "/addJob")
    public String insertJob(@RequestBody List<Job> jobList){
        return jobService.addJob(jobList);
    }

//    @PutMapping(value = "/job/{id}/description")
//    public String updateJobDescription(@PathVariable Long id, @RequestBody String description) {
//        return jobService.updateJobDescription(id, description);
//    }

    //DeleteJob
    @DeleteMapping(value = "/job/{id}")
    public void deleteJobById(@PathVariable Long id){
        jobService.removeJObById(id);
    }


    //GetJobByTitle
    @GetMapping(value = "job/{title}")
    public List<Job> getJobByTitle(@PathVariable String title){
        return jobService.fetchJobByTitle(title);
    }

    //GetJobByDescription
    @GetMapping(value = "jobs/{description}")
    public List<Job> getJobByDescription(@PathVariable String description){
        return jobService.fetchJobByDescription(description);
    }


    @PutMapping(value = "/job/type/{id}")
    public void updateJobById(@RequestParam JobType jobType, @PathVariable Long id) {
        jobService.updateJobById(jobType, id);
    }


}
