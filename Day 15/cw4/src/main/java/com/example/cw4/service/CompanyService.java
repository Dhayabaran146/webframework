package com.example.cw4.service;

import com.example.cw4.model.DhayaCompany;
import com.example.cw4.repository.DhayaCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private DhayaCompanyRepository companyRepository;

    public List<DhayaCompany> getAllCompanies() {
        return companyRepository.findAll();
    }

    public DhayaCompany getCompanyById(int id) {
        return companyRepository.findById(id).orElse(null);
    }

    public DhayaCompany addCompany(DhayaCompany company) {
        return companyRepository.save(company);
    }
}