package com.example.categorie.Controllers;

import com.example.categorie.Entities.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorie")
public class CategorieController {
    @Autowired
    private com.example.categorie.Services.CategorieService categorieService;

    @GetMapping("/all")
    public List<Categorie> getAllCategories() {
        return categorieService.AllCategories();
    }

    @GetMapping("/getById/{idCategorie}")
    public Categorie getCategorieById(@PathVariable int idCategorie) {
        return categorieService.CategorieById(idCategorie);
    }
    @PostMapping("/add")
    public Categorie addCategorie(@RequestBody Categorie categorie) {
        return categorieService.addOrUpdateCategorie(categorie);
    }

    @PutMapping("/update")
    public Categorie updateCategorie(@RequestBody Categorie categorie) {
        return categorieService.addOrUpdateCategorie(categorie);
    }

    @DeleteMapping("/delete/{idCategorie}")
    public void deleteCategorie(@PathVariable int idCategorie) {
        categorieService.deleteCategorie(idCategorie);
    }

}
