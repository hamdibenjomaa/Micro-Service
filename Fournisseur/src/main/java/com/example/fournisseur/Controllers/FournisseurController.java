package com.example.fournisseur.Controllers;

import com.example.fournisseur.Entities.Fournisseur;
import com.example.fournisseur.Services.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {
    @Autowired
    private FournisseurService fournisseurService;

    @GetMapping("/all")
    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurService.AllFournisseur();
    }

    @GetMapping("/getById/{idFournisseur}")
    public Fournisseur getFournisseurById(@PathVariable int idFournisseur) {
        return fournisseurService.FournisseurById(idFournisseur);
    }
    @PostMapping("/add")
    public Fournisseur addFournisseur(@RequestBody Fournisseur FOURNISSEUR) {
        return fournisseurService.addOrUpdateFournisseur(FOURNISSEUR);
    }

    @PutMapping("/update")
    public Fournisseur updateFournisseur(@RequestBody Fournisseur Fournisseur) {
        return fournisseurService.addOrUpdateFournisseur(Fournisseur);
    }

    @DeleteMapping("/delete/{idFournisseur}")
    public void deleteFournisseur(@PathVariable int idFournisseur) {
        fournisseurService.deleteFournisseur(idFournisseur);
    }

}
