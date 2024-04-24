package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.DhayaStudent;
import com.example.bidirection.model.DhayaStudentInfo;
import com.example.bidirection.repository.DhayaStudentInfoRepository;
import com.example.bidirection.repository.DhayaStudentRepository;

@Service
public class DhayaStudentService {
    public DhayaStudentRepository studentRepository;
    public DhayaStudentInfoRepository studentInfoRepository;
    public DhayaStudentService(DhayaStudentRepository studentRepository,DhayaStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public DhayaStudent saveStudent(DhayaStudent student)
    {
        return studentRepository.save(student);
    }
    public DhayaStudentInfo saveStudentInfo(DhayaStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<DhayaStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
