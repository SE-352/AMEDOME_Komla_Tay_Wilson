package com.federation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("federationdb");
        EntityManager em=emf.createEntityManager();
        
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        Joueur joueur1=new Joueur("ABKOS", "ABALO", "Kossi", 0);
        em.persist(joueur1);
        tx.commit();
    }
}
