package com.StockMaster.inventory_system.service;

import com.StockMaster.inventory_system.dto.*;
import com.StockMaster.inventory_system.model.User;
import com.StockMaster.inventory_system.repository.UserRepo;
import com.StockMaster.inventory_system.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwt;

    @Autowired
    private com.StockMaster.inventory_system.security.CustomUserDetails userDetails;

    public String login(LoginReq req) {
        authManager.authenticate(new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword()));
        UserDetails user = userDetails.loadUserByUsername(req.getUsername());
        return jwt.generateToken(user.getUsername());
    }

    public void register(RegisterReq req) {
        User user = new User();
        user.setUsername(req.getUsername());
        user.setPassword(passwordEncoder.encode(req.getPassword()));
        user.setRole(req.getRole());
        userRepo.save(user);
    }
}
