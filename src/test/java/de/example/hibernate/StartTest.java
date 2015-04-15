package de.example.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StartTest {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my_pu");
        EntityManager em = entityManagerFactory.createEntityManager();

        em.getTransaction().begin();
        // ...
        em.getTransaction().commit();
    }

}
