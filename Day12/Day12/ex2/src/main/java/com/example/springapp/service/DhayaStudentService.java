package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.DhayaStudent;
import com.example.springapp.repository.DhayaStudentRepository;

@Service
public class DhayaStudentService {
    @Autowired
    DhayaStudentRepository studentRepository;
    public DhayaStudent addStudents(DhayaStudent student)
    {
        return studentRepository.save(student);
    }
    public List<DhayaStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<DhayaStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<DhayaStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
