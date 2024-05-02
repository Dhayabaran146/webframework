package com.example.cw4.service;

import com.example.cw4.model.DhayaEmployee;
import com.example.cw4.repository.DhayaEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private DhayaEmployeeRepository employeeRepository;

    public List<DhayaEmployee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public DhayaEmployee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public DhayaEmployee addEmployee(DhayaEmployee employee) {
        return employeeRepository.save(employee);
    }
}