package com.example.day4cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day4cw2.model.DhayaJob;

@Repository
public interface DhayaJobRepo extends JpaRepository<DhayaJob,Integer>{
    
}
