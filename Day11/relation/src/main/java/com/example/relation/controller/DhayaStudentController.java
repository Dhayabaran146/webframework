package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.DhayaStudent;
import com.example.relation.service.DhayaStudentService;
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
    @PostMapping("/api/student")
    public DhayaStudent postMethodName(@RequestBody DhayaStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<DhayaStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
