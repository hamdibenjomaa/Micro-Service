package com.example.employe.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Employe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmploye;
    private String nomEmploye;
    private String poste;
    private String email;

    public Employe() {
    }

    public Employe(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "idEmploye=" + idEmploye +
                ", nomEmploye='" + nomEmploye + '\'' +
                ", poste='" + poste + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Employe(int idEmploye, String nomEmploye, String poste, String email) {
        this.idEmploye = idEmploye;
        this.nomEmploye = nomEmploye;
        this.poste = poste;
        this.email = email;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
