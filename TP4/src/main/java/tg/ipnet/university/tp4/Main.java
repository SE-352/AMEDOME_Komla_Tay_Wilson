/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tg.ipnet.university.tp4;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import antlr.collections.List;
import tg.ipnet.university.tp4.entities.Cours;
import tg.ipnet.university.tp4.entities.Departement;
import tg.ipnet.university.tp4.entities.Etudiant;
import tg.ipnet.university.tp4.entities.Professeur;

/**
 *
 * @author wilson
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("universitepu");
        EntityManager em=emf.createEntityManager();
        
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        Etudiant etudiant1=new Etudiant("AYIVOR", "Jennifer", "mawouli.ayivor@ipnetinstitute.com", "Lomé-TOGO", "70432968");
        Etudiant etudiant2=new Etudiant("FOLIE", "Komla", "komla.folie@ipnetinstitute.com", "Lomé-TOGO", "90997667");
        Etudiant etudiant3=new Etudiant("DODO", "Sandrine", "sandrine.dodo@ipnetinstitute.com", "Lomé-TOGO", "76578909");
        Etudiant etudiant4=new Etudiant("AMEDOME", "Fabrice", "fabrice.coos@ipnetinstitute.com", "Lomé-TOGO", "99987753");

        Departement departement1 = new Departement("Informatique","ipnet.info.tg");
        Departement departement2 = new Departement("Biologie","ipnet.bio.tg");

        Cours cours1 = new Cours("Bioligie Moléculaire", new Date(), null, null);
        Cours cours2 = new Cours("Programmation Orientée Objet", new Date(), null, null);
        Cours cours3 = new Cours("Analyse Numérique", new Date(), null, null);

        Professeur professeur = new Professeur("Titulaire", "FOKI", "Ronis", "fokironis@ipnetinstitute.com");
        Professeur professeur1 = new Professeur("Titulaire", "LOKO", "Esther", "lokoester@ipnetinstitute.com");
        Professeur professeur2 = new Professeur("Titulaire", "MOMO", "Ferdinand", "momoferdinand@ipnetinstitute.com");

        etudiant1.setDepartement(departement2);
        etudiant2.setDepartement(departement1);
        etudiant3.setDepartement(departement1);
        etudiant4.setDepartement(departement2);

        long id = 1;
        // System.out.println("***************************\n"+etudiant1.getId()+"\n***************************");
        Etudiant etudiantToUpdate = em.find(Etudiant.class,id); //Consider em as JPA EntityManager
        Departement d = em.find(Departement.class,id);
        // ArrayList<Etudiant> results = (ArrayList<Etudiant>) em
        //               .createQuery("Select a from Etudiant a", Etudiant.class)
        //               .getResultList();
        // for (Etudiant etudiant : results) {
        //     System.out.println(etudiant.getId());
        //     etudiant.setDepartement(departement2);
        //     em.persist(etudiant);
        // }

        
        em.persist(etudiant1);
        em.persist(etudiant2);
        em.persist(etudiant3);
        em.persist(etudiant4);
         tx.commit();
        
    }
}
