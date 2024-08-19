package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Provider;
import com.example.demo.service.ProviderService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProviderController {
    @Autowired
    private ProviderService service;
    
    @GetMapping("providers")
    public List<Provider> getAllProviders() {
        System.out.println("Inside getAllProviders");
        return service.getAllProviders();
    }
}
