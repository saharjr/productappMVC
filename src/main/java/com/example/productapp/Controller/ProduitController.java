package com.example.productapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.productapp.Model.Produit;

@Controller
@RequestMapping("/produits")

public class ProduitController {
    @Autowired
    private com.example.productapp.Service.ProduitService produitService;

    @GetMapping
    public String getProduit(Model model) {
        model.addAttribute("produits", produitService.findAll());
        return "produits"; // Nom de la vue
    }

    @PostMapping("/add")
    public String addProduit(Produit produit) {
        produitService.save(produit);
        return "redirect:/produits"; // Rediriger vers la liste des produits
    }

}
