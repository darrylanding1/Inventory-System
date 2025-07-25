package com.StockMaster.inventory_system.service;

import com.StockMaster.inventory_system.model.Item;
import com.StockMaster.inventory_system.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepo repo;

    public Item add(Item item) {
        return repo.save(item);
    }

    public List<Item> getAll() {
        return repo.findAll();
    }

    public Item getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Item update(Long id, Item item) {
        Item existing = getById(id);
        if (existing == null) return null;

        existing.setName(item.getName());
        existing.setBrand(item.getBrand());
        existing.setQuantity(item.getQuantity());
        existing.setCostPrice(item.getCostPrice());
        existing.setSellPrice(item.getSellPrice());
        existing.setCategory(item.getCategory());

        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
