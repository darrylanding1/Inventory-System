package com.StockMaster.inventory_system.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestCtrl {

    @GetMapping("/employee")
    @PreAuthorize("hasRole('EMPLOYEE') or hasRole('ADMIN') or hasRole('SUPERADMIN')")
    public String employeeOnly() {
        return "Employee access granted";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN') or hasRole('SUPERADMIN')")
    public String adminOnly() {
        return "Admin access granted";
    }

    @GetMapping("/super")
    @PreAuthorize("hasRole('SUPERADMIN')")
    public String superAdminOnly() {
        return "SuperAdmin access granted";
    }
}
