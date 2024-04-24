package com.example.springapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.DhayaPerson;
import com.example.springapp.service.DhayaPersonService;

@RestController
public class DhayaPersonController {
    public DhayaPersonService personService;

    public DhayaPersonController(DhayaPersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/api/person")
    public ResponseEntity<DhayaPerson> postMethodName(@RequestBody DhayaPerson person) {
        if (personService.savePerson(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/person/byage/{age}")
    public ResponseEntity<List<DhayaPerson>> getMethodName(@PathVariable("age") int age) {
        List<DhayaPerson> list = personService.getPersonByAge(age);
        if (list.size() == 0) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
