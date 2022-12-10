package com.federation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
@Table(name="federation_match")
public class Match {
    @Id
    @Column(name = "numero_match",nullable = false,length = 20)
    private String numeroMatch;

    @ManyToOne(fetch=FetchType.LAZY,optional=false)
    @JoinColumn(name = "numero_licence_joueur_1", insertable=false, updatable=false)
    private Joueur joueur1;

    @ManyToOne(fetch=FetchType.LAZY,optional=false)
    @JoinColumn(name = "numero_licence_joueur_2", insertable=false, updatable=false)
    private Joueur joueur2;

    @OneToOne
    @JoinColumn(name = "numero_licence_vainqueur")
    private Joueur vainqueur;

    public Joueur getJoueur1() {
        return joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }

    public Joueur getVainqueur() throws IllegalStateException {
        return vainqueur;
    }

    public Joueur getVaincu() throws IllegalStateException {
        return vainqueur;
    }

    public void setVainqueur(Joueur vainqueur) throws IllegalArgumentException {
        this.vainqueur = vainqueur;
    }



}
