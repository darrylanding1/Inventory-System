package com.StockMaster.inventory_system.controller;

import com.StockMaster.inventory_system.model.Item;
import com.StockMaster.inventory_system.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@CrossOrigin("*")
public class ItemCtrl {

    @Autowired
    private ItemService service;

    @PostMapping
    public Item add(@RequestBody Item item) {
        return service.add(item);
    }

    @GetMapping
    public List<Item> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Item get(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Item update(@PathVariable Long id, @RequestBody Item item) {
        return service.update(id, item);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted";
    }
}
