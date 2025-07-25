package com.StockMaster.inventory_system.controller;

import com.StockMaster.inventory_system.dto.*;
import com.StockMaster.inventory_system.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*") // allow React to connect
public class AuthCtrl {

    @Autowired
    private AuthService service;

    @PostMapping("/login")
    public AuthRes login(@RequestBody LoginReq req) {
        String token = service.login(req);
        return new AuthRes(token);
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterReq req) {
        service.register(req);
        return "User registered";
    }
}
