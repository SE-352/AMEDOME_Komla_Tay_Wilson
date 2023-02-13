/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import universitymanager.Etudiant.Etudiant;

/**
 *
 * @author AMEDOME
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("UniversityManagerPU");
        EntityManager em = entityManagerFactory.createEntityManager();
        
        //em.getTransaction().begin();
       // em.persist(etudiant1);
       //em.getTransaction().commit();
                
    }
}
