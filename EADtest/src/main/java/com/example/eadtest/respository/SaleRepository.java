package com.example.eadtest.respository;

import com.example.eadtest.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository  extends JpaRepository<Sales, Long> {
}
