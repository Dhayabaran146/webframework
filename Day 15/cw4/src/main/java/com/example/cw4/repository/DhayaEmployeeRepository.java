package com.example.cw4.repository;

import com.example.cw4.model.DhayaEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DhayaEmployeeRepository extends JpaRepository<DhayaEmployee, Integer> {
}