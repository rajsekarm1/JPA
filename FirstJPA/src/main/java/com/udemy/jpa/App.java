package com.udemy.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.balazsholczer.jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Student s = new Student();
		s.setAge(30);
		s.setName("Daniel");
		
		Student s2 = new Student();
		s2.setAge(312);
		s2.setName("Adam");
		
		entityManager.persist(s);
		entityManager.persist(s2);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}
}
