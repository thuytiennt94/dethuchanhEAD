package com.example.eadtest.service;

import com.example.eadtest.entity.Products;
import com.example.eadtest.respository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class ProductService {
    final ProductRepository productRepository;

    public Page<Products> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public Optional<Products> findById(long prodId) {
        return productRepository.findById(prodId);
    }
}
