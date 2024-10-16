package com.example.productapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productapp.Model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
