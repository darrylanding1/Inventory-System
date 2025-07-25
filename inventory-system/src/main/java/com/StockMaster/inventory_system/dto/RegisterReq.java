package com.StockMaster.inventory_system.dto;

import com.StockMaster.inventory_system.model.Role;

public class RegisterReq {
    private String username;
    private String password;
    private Role role;

    // Constructors (optional)
    public RegisterReq() {}

    public RegisterReq(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // ✅ Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    // ✅ Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
