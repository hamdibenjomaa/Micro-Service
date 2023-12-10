package com.example.categorie.Services;

import com.example.categorie.Entities.Categorie;
import com.example.categorie.Repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    CategorieRepository categorieRepository ;
    public List<Categorie> AllCategories(){ return categorieRepository.findAll();}
    public Categorie CategorieById(int id ){ return categorieRepository.findById(id).orElse(null);}

    public Categorie addOrUpdateCategorie(Categorie c){return categorieRepository.save(c);}

    public void deleteCategorie(int idCategorie){categorieRepository.deleteById(idCategorie);}
}
