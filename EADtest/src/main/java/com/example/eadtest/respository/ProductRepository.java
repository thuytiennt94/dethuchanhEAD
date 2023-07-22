package com.example.eadtest.respository;

import com.example.eadtest.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class ProductRepository  extends JpaRepository<Products, Integer> {


}
