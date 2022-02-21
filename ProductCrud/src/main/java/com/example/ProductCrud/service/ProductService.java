package com.example.ProductCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProductCrud.domain.Product;
import com.example.ProductCrud.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
    private ProductRepository repo;
public List<Product> listAll() {
        return repo.findAll();
    }
    
    public void save(Product std) {
        repo.save(std);
    }
    
    public Product get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }

}
