package com.example.magasin.Controllers;

import com.example.magasin.Entities.Magasin;
import com.example.magasin.Services.MagasinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/magasin")
public class MagasinController {
    @Autowired
    private MagasinService magasinService;

    @GetMapping("/all")
    public List<Magasin> getAllMagasins() {
        return magasinService.AllMagasins();
    }

    @GetMapping("/getById/{idMagasin}")
    public Magasin getMagasinById(@PathVariable int idMagasin) {
        return magasinService.magasinById(idMagasin);
    }
    @PostMapping("/add")
    public Magasin addMagasin(@RequestBody Magasin magasin) {
        return magasinService.addOrUpdateMagasin(magasin);
    }

    @PutMapping("/update")
    public Magasin updateMagasin(@RequestBody Magasin magasin) {
        return magasinService.addOrUpdateMagasin(magasin);
    }

    @DeleteMapping("/delete/{idMagasin}")
    public void deleteMagasin(@PathVariable int idMagasin) {
        magasinService.deleteMagasin(idMagasin);
    }

}
