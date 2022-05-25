package com.ty.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Person;

public class GetPersonById {

	public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
       EntityManager entityManager = entityManagerFactory.createEntityManager();
       
       Person person = entityManager.find(Person.class, 1);
       
       System.out.println("-------------------------------");
       
       System.out.println(person.getId());
       System.out.println(person.getName());
       System.out.println(person.getEmail());
       System.out.println(person.getPhone());
	}

}
