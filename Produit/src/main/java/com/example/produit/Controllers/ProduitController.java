package com.example.produit.Controllers;

import com.example.produit.Entities.Produit;
import com.example.produit.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping("/all")
    public List<Produit> getAllProduits() {
        return produitService.AllProduits();
    }

    @GetMapping("/getById/{idProduit}")
    public Produit getProduitById(@PathVariable int idProduit) {
        return produitService.ProduitById(idProduit);
    }
    @PostMapping("/add")
    public Produit addProduit(@RequestBody Produit Produit) {
        return produitService.addOrUpdateProduit(Produit);
    }

    @PutMapping("/update")
    public Produit updateProduit(@RequestBody Produit Produit) {
        return produitService.addOrUpdateProduit(Produit);
    }

    @DeleteMapping("/delete/{idProduit}")
    public void deleteProduit(@PathVariable int idProduit) {
        produitService.deleteProduit(idProduit);
    }

}
