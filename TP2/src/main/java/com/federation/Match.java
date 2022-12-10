package com.federation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Match
 */
@Data
@AllArgsConstructor
@Entity
public class Match {
    @Id
    @Column(name = "numero_match")
    private String numeroMatch;

    @ManyToOne(fetch=FetchType.LAZY)
    private Joueur joueur1;

    @ManyToOne(fetch=FetchType.LAZY)
    private Joueur joueur2;

    @OneToOne
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
