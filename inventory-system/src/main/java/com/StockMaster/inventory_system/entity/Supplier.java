package com.StockMaster.inventory_system.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contactInfo;

    @OneToMany(mappedBy = "supplier")
    private List<Product> products;

    // Getters and Setters...
}
