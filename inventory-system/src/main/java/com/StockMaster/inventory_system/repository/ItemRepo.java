package com.StockMaster.inventory_system.repository;

import com.StockMaster.inventory_system.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Long> {
}
