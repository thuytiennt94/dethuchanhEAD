package com.example.eadtest.respository;

import com.example.eadtest.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Integer> {
}

