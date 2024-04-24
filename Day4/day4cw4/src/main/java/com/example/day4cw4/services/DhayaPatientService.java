package com.example.day4cw4.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4cw4.model.DhayaPatient;
import com.example.day4cw4.repository.DhayaPatientRepo;

@Service
public class DhayaPatientService {
    public DhayaPatientRepo patientRepo;
    public DhayaPatientService(DhayaPatientRepo patientRepo)
    {
        this.patientRepo = patientRepo;
    }
    public boolean savePatient(DhayaPatient patient)
    {
        try{
            patientRepo.save(patient);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DhayaPatient> getPatients()
    {
        return patientRepo.findAll();
    }
    public DhayaPatient getPatientById(int id)
    {
        Optional<DhayaPatient> obj = patientRepo.findById(id);
        return obj.orElse(null);
    }
}
