package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.DhayaEmployee;
import com.example.ce1.repository.DhayaEmployeeRepo;

@Service
public class DhayaEmployeeService {
    @Autowired
    DhayaEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public DhayaEmployee setEmployee(DhayaEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<DhayaEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<DhayaEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
