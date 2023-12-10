package com.example.employe.Services;

import com.example.employe.Entities.Employe;
import com.example.employe.Repositories.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {
    @Autowired
    EmployeRepository employeRepository;
    public List<Employe> AllEmploye(){ return employeRepository.findAll();}
    public Employe EmployeById(int id ){ return employeRepository.findById(id).orElse(null);}

    public Employe addOrUpdateEmploye(Employe f){return employeRepository.save(f);}

    public void deleteEmploye(int idEmploye){employeRepository.deleteById(idEmploye);}
}
