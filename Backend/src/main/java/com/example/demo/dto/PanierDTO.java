package com.example.demo.dto;

import java.util.Set;

import com.example.demo.entities.Furniture;

import lombok.Data;

@Data
public class PanierDTO {
    private float totalPanier;
    private Set<Furniture> furnitures;
    private long userID;
}
