package com.tech.JPAdemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien a= new Alien();
    	a.setAname("rams");
    	a.setId(106);
    	a.setTech("flutter");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
    	EntityManager em= emf.createEntityManager();
    	em.getTransaction().begin();
    	 em.persist(a);
    	 em.getTransaction().commit();
    	System.out.println("Data saved successfully");
    	 
        
    }
}
