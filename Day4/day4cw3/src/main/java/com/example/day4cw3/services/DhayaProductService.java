package com.example.day4cw3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4cw3.model.DhayaProduct;
import com.example.day4cw3.repository.DhayaProductRepo;

@Service
public class DhayaProductService {
    public DhayaProductRepo productRepo;
    public DhayaProductService(DhayaProductRepo productRepo)
    {
        this.productRepo=productRepo;
    }
    public boolean saveProduct(DhayaProduct product)
    {
        try{
            productRepo.save(product);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DhayaProduct> getProducts()
    {
        return productRepo.findAll();
    }
    public DhayaProduct getProductById(int id)
    {
        Optional<DhayaProduct> obj = productRepo.findById(id);
        return obj.orElse(new DhayaProduct());
    }
}
