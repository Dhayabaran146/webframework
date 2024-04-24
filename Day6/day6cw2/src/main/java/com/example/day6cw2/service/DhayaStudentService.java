package com.example.day6cw2.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw2.model.DhayaStudent;
import com.example.day6cw2.repository.DhayaStudentRepo;

@Service
public class DhayaStudentService {
    public DhayaStudentRepo studentRepo;
    public DhayaStudentService(DhayaStudentRepo studentRepo)
    {
        this.studentRepo = studentRepo;
    }
    public boolean postStudent(DhayaStudent student)
    {
        try{

            studentRepo.save(student);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DhayaStudent> paginationStudents(int pageno,int size)
    {
        return studentRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<DhayaStudent>  sortPaginationStudents(int pageno,int size,String field)
    {
        return studentRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}
