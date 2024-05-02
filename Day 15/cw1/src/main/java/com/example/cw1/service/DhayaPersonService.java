package com.example.cw1.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cw1.model.DhayaPerson;
import com.example.cw1.repository.DhayaPersonRepo;

@Service
public class DhayaPersonService {
    @Autowired
    private DhayaPersonRepo repo;

    public DhayaPerson createPerson(DhayaPerson person) {
        return repo.save(person);
    }

    public List<DhayaPerson> getAllPersons() {
        return repo.findAll();
    }
}
