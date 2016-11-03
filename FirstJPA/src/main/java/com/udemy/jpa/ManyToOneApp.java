package com.udemy.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.udemy.manytoone.Stud;
import com.udemy.manytoone.University;
import com.udemy.onetoone.Address;
import com.udemy.onetoone.Employee;

public class ManyToOneApp {

	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.balazsholczer.jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
	
		
		University univ = new University("Periyar");
		
		Stud s1 = new Stud("Rajasekar",univ);
		
		entityManager.persist(univ);
		entityManager.persist(s1);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();

	}

}
