package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.DhayaStudent;
import com.example.relation.repository.DhayaStudentRepository;

@Service
public class DhayaStudentService {
    public DhayaStudentRepository studentRepository;
    public DhayaStudentService(DhayaStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public DhayaStudent saveStudent(DhayaStudent student)
    {
        return studentRepository.save(student);
    }
    public List<DhayaStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
