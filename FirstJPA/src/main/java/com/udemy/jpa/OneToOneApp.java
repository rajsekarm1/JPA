package com.udemy.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.udemy.onetoone.Address;
import com.udemy.onetoone.Employee;

public class OneToOneApp {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.balazsholczer.jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
	
		
		Employee e = new Employee();
		//e.setAddress(a1);
		e.setUserName("Rajasekar");
		
		
		entityManager.persist(e);
		
		Address a1 = new Address();
		a1.setCountry("India");
		a1.setLocation("Narisimman Pudur");
		a1.setState("TN");
		a1.setEmployee(e);
		a1 = entityManager.merge(a1);
		
		//entityManager.persist(s2);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}
}
