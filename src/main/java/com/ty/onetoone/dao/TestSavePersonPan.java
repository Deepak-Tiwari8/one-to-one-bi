package com.ty.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class TestSavePersonPan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setName("deepak");
		person.setEmail("deepak@gmail.com");
		person.setPhone(8786543348l);

		Pan pan = new Pan();
		pan.setName("deepak");
		pan.setAddress("bhopal");
		pan.setPanNumber("FVC432YE");

		person.setPan(pan); // set pan id  
		pan.setPerson(person); // set Person id

		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();

	}

}
