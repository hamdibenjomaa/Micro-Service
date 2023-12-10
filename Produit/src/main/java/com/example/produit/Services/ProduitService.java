package com.example.produit.Services;

import com.example.produit.Repositories.ProduitRepository;
import com.example.produit.Entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    @Autowired
    ProduitRepository produitRepository ;
    public List<Produit> AllProduits(){ return produitRepository.findAll();}
    public Produit ProduitById(int id ){ return produitRepository.findById(id).orElse(null);}

    public Produit addOrUpdateProduit(Produit p){return produitRepository.save(p);}

    public void deleteProduit(int idProduit){produitRepository.deleteById(idProduit);}
}
