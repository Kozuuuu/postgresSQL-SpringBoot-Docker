package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Integer> {
}
