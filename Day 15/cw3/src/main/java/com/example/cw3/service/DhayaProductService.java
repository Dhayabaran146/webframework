package com.example.cw3.service;

import com.example.cw3.model.DhayaProduct;
import com.example.cw3.repository.DhayaProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DhayaProductService {

    @Autowired
    private DhayaProductRepo productRepo;

    public List<DhayaProduct> getAllProducts() {
        return productRepo.findAll();
    }

    public DhayaProduct getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public DhayaProduct addProduct(DhayaProduct product) {
        return productRepo.save(product);
    }
}