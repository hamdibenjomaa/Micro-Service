package com.example.magasin.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Magasin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMagasin;
    private String nomMagasin;
    private String addresse;

    @Override
    public String toString() {
        return "Magasin{" +
                "idMagasin=" + idMagasin +
                ", nomMagasin='" + nomMagasin + '\'' +
                ", addresse='" + addresse + '\'' +
                '}';
    }

    public Magasin() {
    }

    public Magasin(int idMagasin) {
        this.idMagasin = idMagasin;
    }

    public Magasin(int idMagasin, String nomMagasin, String addresse) {
        this.idMagasin = idMagasin;
        this.nomMagasin = nomMagasin;
        this.addresse = addresse;
    }

    public int getIdMagasin() {
        return idMagasin;
    }

    public void setIdMagasin(int idMagasin) {
        this.idMagasin = idMagasin;
    }

    public String getNomMagasin() {
        return nomMagasin;
    }

    public void setNomMagasin(String nomMagasin) {
        this.nomMagasin = nomMagasin;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
}
