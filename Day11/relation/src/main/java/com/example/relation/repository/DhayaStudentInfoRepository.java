package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.DhayaStudentInfo;

@Repository
public interface DhayaStudentInfoRepository extends JpaRepository<DhayaStudentInfo,Integer>{
    
}