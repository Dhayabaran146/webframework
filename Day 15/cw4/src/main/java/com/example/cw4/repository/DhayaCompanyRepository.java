package com.example.cw4.repository;

import com.example.cw4.model.DhayaCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DhayaCompanyRepository extends JpaRepository<DhayaCompany, Integer> {
}