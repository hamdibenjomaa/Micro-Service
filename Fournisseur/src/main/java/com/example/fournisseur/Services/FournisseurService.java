package com.example.fournisseur.Services;

import com.example.fournisseur.Entities.Fournisseur;
import com.example.fournisseur.Repositories.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {
    @Autowired
    FournisseurRepository fournisseurRepository;
    public List<Fournisseur> AllFournisseur(){ return fournisseurRepository.findAll();}
    public Fournisseur FournisseurById(int id ){ return fournisseurRepository.findById(id).orElse(null);}

    public Fournisseur addOrUpdateFournisseur(Fournisseur f){return fournisseurRepository.save(f);}

    public void deleteFournisseur(int idFournisseur){fournisseurRepository.deleteById(idFournisseur);}
}
