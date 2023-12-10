package com.example.employe.Controllers;

import com.example.employe.Entities.Employe;
import com.example.employe.Services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employe")
public class EmployeController {
    @Autowired
    private EmployeService employeService;

    @GetMapping("/all")
    public List<Employe> getAllEmployes() {
        return employeService.AllEmploye();
    }

    @GetMapping("/getById/{idEmploye}")
    public Employe getEmployeById(@PathVariable int idEmploye) {
        return employeService.EmployeById(idEmploye);
    }
    @PostMapping("/add")
    public Employe addEmploye(@RequestBody Employe employe) {
        return employeService.addOrUpdateEmploye(employe);
    }

    @PutMapping("/update")
    public Employe updateEmploye(@RequestBody Employe Employe) {
        return employeService.addOrUpdateEmploye(Employe);
    }

    @DeleteMapping("/delete/{idEmploye}")
    public void deleteEmploye(@PathVariable int idEmploye) {
        employeService.deleteEmploye(idEmploye);
    }

}
