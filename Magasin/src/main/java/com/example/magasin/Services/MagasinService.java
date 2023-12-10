package com.example.magasin.Services;

import com.example.magasin.Entities.Magasin;
import com.example.magasin.Repositories.MagasinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagasinService {
    @Autowired
    MagasinRepository magasinRepository ;
    public List<Magasin> AllMagasins(){ return magasinRepository.findAll();}
    public Magasin magasinById(int id ){ return magasinRepository.findById(id).orElse(null);}

    public Magasin addOrUpdateMagasin(Magasin m){return magasinRepository.save(m);}

    public void deleteMagasin(int idMagasin){magasinRepository.deleteById(idMagasin);}
}
