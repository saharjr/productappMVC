package com.example.productapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import lombok. *;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private double prix;
    private int qteStock;

    // Getter pour libelle
    public String getLibelle() {
        return libelle;
    }

    // Setter pour libelle
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    // Getter pour prix
    public double getPrix() {
        return prix;
    }

    // Setter pour prix
    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Getter pour qteStock
    public int getQteStock() {
        return qteStock;
    }

    // Setter pour qteStock
    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }
}
