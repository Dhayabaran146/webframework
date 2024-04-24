package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.DhayaPerson;
import com.example.springapp.repository.DhayaPersonRepo;

@Service
public class DhayaPersonService {
    public DhayaPersonRepo personRepo;

    public DhayaPersonService(DhayaPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(DhayaPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<DhayaPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
