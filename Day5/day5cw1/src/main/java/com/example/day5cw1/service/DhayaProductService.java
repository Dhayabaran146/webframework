package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.DhayaProduct;
import com.example.day5cw1.repository.DhayaProductRepo;

@Service
public class DhayaProductService {
    public DhayaProductRepo productRepo;
    public DhayaProductService(DhayaProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(DhayaProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,DhayaProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public DhayaProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
