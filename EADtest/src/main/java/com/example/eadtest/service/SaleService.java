package com.example.eadtest.service;

import com.example.eadtest.entity.Sales;
import com.example.eadtest.respository.SaleRepository;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.Optional;

public class SaleService {
    final SaleRepository saleRepository;

    public Page<Sales> findAll(Pageable pageable) {
        return saleRepository.findAll(pageable);
    }

    public Optional<Sales> findById(long SalesmanID) {
        return saleRepository.findById(SalesmanID);
    }
}
