package com.federation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Joueur {
    @Id
    @Column(name = "numero_licence",nullable = false,length = 20)
    private String numeroLicence;

    @Column(name = "nom",nullable = false,length = 20)
    private String nom;

    @Column(name = "prenom",nullable = false,length = 20)
    private String prenom;

    @Column(name = "nombre_point",nullable = false)
    private int nombrePoint=0;


    public String getNumeroLicence() {
        return numeroLicence;
    }

    public void setNumeroLicence(String numeroLicence) {
        this.numeroLicence = numeroLicence;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNombrePoint() {
        return nombrePoint;
    }

    public void setNombrePoint(int nombrePoint) {
        this.nombrePoint = nombrePoint;
    }




}
