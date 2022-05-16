package com.example.demo.services;

import java.io.Console;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.dto.PanierDTO;
import com.example.demo.entities.Furniture;
import com.example.demo.entities.Panier;
import com.example.demo.repositories.FurnitureRepository;
import com.example.demo.repositories.PanierRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanierService {
    @Autowired
    PanierRepository panierRepository;

    @Autowired
    FurnitureRepository furnitureRepository;

    public PanierService(PanierRepository panierRepository) {
        this.panierRepository = panierRepository;
    } 

    public Panier save(PanierDTO panierDTO) {
        Panier panier = Panier.builder()
                .totalPanier(panierDTO.getTotalPanier())
                .furnitures(panierDTO.getFurnitures()).build();

        return panierRepository.save(panier);
    }

    public Panier updatePanier(Panier panier) {

        return panierRepository.save(panier);

    }

    public List<Panier> retrieveAllPanier() {
        return panierRepository.findAll();
    }

    public Panier retrievePanierById(Long panierId) {
        return panierRepository.findById(panierId).get();
    }

    public void deletePanier(Long panierId) {
        panierRepository.deleteById(panierId);
    }

    public Set<Furniture> retrieveFurnitureFromPanier(Long panierId) {
        Panier panier = panierRepository.getById(panierId);
        return panier.getFurnitures();
    }

    public Panier retrievePanierByUserId(Long userId){
        return panierRepository.findByUserID(userId).orElseThrow(() -> new RuntimeException("Cannot find cart with user id"+userId));
    }

    public void deleteFurnitureFromPanier(Long idFurniture, Long panierId) {
        
        Panier panier = panierRepository.getById(panierId);
        Furniture furniture = furnitureRepository.getById(idFurniture);
        System.out.println(furniture.getDescription());
        panier.getFurnitures().remove(furniture);
    }
}
