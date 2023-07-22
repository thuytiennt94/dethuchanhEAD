package com.example.eadtest.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sales")
@Data
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer slNo;
    private Long salesmanID;
    private Long prodID;
    private String salesmanName;
    private String DOS;
}
