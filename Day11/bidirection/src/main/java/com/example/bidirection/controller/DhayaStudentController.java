package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.DhayaStudent;
import com.example.bidirection.model.DhayaStudentInfo;
import com.example.bidirection.service.DhayaStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DhayaStudentController {
    public DhayaStudentService studentService;
    public DhayaStudentController(DhayaStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public DhayaStudent postMethodName(@RequestBody DhayaStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public DhayaStudentInfo postMethodName(@RequestBody DhayaStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<DhayaStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}