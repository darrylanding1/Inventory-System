package com.StockMaster.inventory_system.dto;

public class LoginReq {
    private String username;
    private String password;

    // Constructors (optional)
    public LoginReq() {}

    public LoginReq(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // ✅ Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // ✅ Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
