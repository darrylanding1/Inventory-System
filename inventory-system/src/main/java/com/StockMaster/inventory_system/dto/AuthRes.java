package com.StockMaster.inventory_system.dto;

public class AuthRes {
    private String token;

    public AuthRes(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
