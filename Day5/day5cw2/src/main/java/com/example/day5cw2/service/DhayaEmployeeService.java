package com.example.day5cw2.service;

import org.springframework.stereotype.Service;

import com.example.day5cw2.model.DhayaEmployee;
import com.example.day5cw2.repository.DhayaEmployeeRepo;

@Service
public class DhayaEmployeeService {
    public DhayaEmployeeRepo employeeRepo;
    public DhayaEmployeeService(DhayaEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(DhayaEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,DhayaEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public DhayaEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
