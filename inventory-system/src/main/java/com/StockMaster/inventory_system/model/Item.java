package com.StockMaster.inventory_system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String brand;
    private int quantity;
    private double costPrice;
    private double sellPrice;
    private String category;

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getBrand() { return brand; }
    public int getQuantity() { return quantity; }
    public double getCostPrice() { return costPrice; }
    public double getSellPrice() { return sellPrice; }
    public String getCategory() { return category; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setCostPrice(double costPrice) { this.costPrice = costPrice; }
    public void setSellPrice(double sellPrice) { this.sellPrice = sellPrice; }
    public void setCategory(String category) { this.category = category; }
}
