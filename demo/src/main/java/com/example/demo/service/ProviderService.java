package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Provider;
import com.example.demo.repo.ProviderRepository;

import java.util.List;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository repository;

    public List<Provider> getAllProviders() {
        return repository.findAll();
    }
}
