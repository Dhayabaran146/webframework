package com.example.day4cw1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4cw1.model.DhayaMedicine;
import com.example.day4cw1.repository.DhayaMedicineRepo;

@Service
public class DhayaMedicineService {
    public DhayaMedicineRepo medicineRepo;
    public DhayaMedicineService(DhayaMedicineRepo medicineRepo)
    {
        this.medicineRepo = medicineRepo;
    }
    public boolean saveMedicine(DhayaMedicine medicine)
    {
        try{
            medicineRepo.save(medicine);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DhayaMedicine> getMedicines()
    {
        return medicineRepo.findAll();
    }

    public DhayaMedicine MedicineById(int id)
    {
        Optional<DhayaMedicine> obj = medicineRepo.findById(id);
        return obj.orElse(new DhayaMedicine());
    }

}
