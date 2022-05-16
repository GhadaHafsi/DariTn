package com.example.demo.repositories;

import java.util.Optional;

import com.example.demo.entities.Panier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanierRepository extends JpaRepository<Panier, Long> {

    public Optional<Panier> findByUserID(Long userId);    
}
