package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.DhayaStudentInfo;

@Repository
public interface DhayaStudentInfoRepository extends JpaRepository<DhayaStudentInfo,Integer>{
    
}