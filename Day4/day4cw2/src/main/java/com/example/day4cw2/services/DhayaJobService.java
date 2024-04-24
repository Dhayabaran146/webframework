package com.example.day4cw2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4cw2.model.DhayaJob;
import com.example.day4cw2.repository.DhayaJobRepo;

@Service
public class DhayaJobService {
    public DhayaJobRepo jobRepo;
    public DhayaJobService(DhayaJobRepo jobRepo)
    {
        this.jobRepo = jobRepo;
    }
    public boolean saveJob(DhayaJob job)
    {
        try{
            jobRepo.save(job);
        } 
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DhayaJob> getJobs()
    {
        return jobRepo.findAll();
    }
    public DhayaJob getJobById(int id)
    {
        Optional<DhayaJob> obj = jobRepo.findById(id);
        return obj.orElse(null);
    }
}
