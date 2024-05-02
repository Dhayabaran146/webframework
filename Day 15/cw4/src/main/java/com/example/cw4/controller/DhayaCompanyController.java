package com.example.cw4.controller;

import com.example.cw4.model.DhayaCompany;
import com.example.cw4.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/companies")
public class DhayaCompanyController {

    private static final Logger logger = LoggerFactory.getLogger(DhayaCompanyController.class);

    @Autowired
    private CompanyService CompanyService;

    @GetMapping
    public ResponseEntity<List<DhayaCompany>> getAllCompanys() {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/companies; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                "N/A", HttpStatus.OK.value(), "List of Companies", "N/A");
        List<DhayaCompany> Companys = CompanyService.getAllCompanies();
        return ResponseEntity.ok(Companys);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DhayaCompany> getCompanyById(@PathVariable("id") int id) {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/Companies/{}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                id, HttpStatus.OK.value(), "Company details", "N/A");
        DhayaCompany Company = CompanyService.getCompanyById(id);
        return ResponseEntity.ok(Company);
    }

    @PostMapping
    public ResponseEntity<DhayaCompany> addCompany(@RequestBody DhayaCompany Company) {
        logger.info("FINISHED PROCESSING : METHOD=POST; REQUESTURI=/companies; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                Company, HttpStatus.CREATED.value(), "Company added successfully", "N/A");
        DhayaCompany savedCompany = CompanyService.addCompany(Company);
        return new ResponseEntity<>(savedCompany, HttpStatus.CREATED);
    }
}