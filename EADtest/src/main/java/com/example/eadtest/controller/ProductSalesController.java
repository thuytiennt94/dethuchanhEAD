package com.example.eadtest.controller;

import com.example.eadtest.entity.Products;
import com.example.eadtest.entity.Sales;
import com.example.eadtest.respository.ProductRepository;
import com.example.eadtest.respository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductSalesController {
    private final ProductRepository productRepository;
    private final SaleRepository salesRepository;

    @Autowired
    public ProductSalesController(ProductRepository productRepository, SaleRepository salesRepository) {
        this.productRepository = productRepository;
        this.salesRepository = salesRepository;
    }

    public ProductSalesController(ProductRepository productRepository, SaleRepository salesRepository) {
        this.productRepository = productRepository;
        this.salesRepository = salesRepository;
    }

    @GetMapping("/products")
    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/sales")
    public List<Sales> getAllSales() {
        return salesRepository.findAll();
    }
}
