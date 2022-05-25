package com.ty.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class GetPanById {

	public static void main(String[] args) {
   EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
   EntityManager entityManager = entityManagerFactory.createEntityManager();
   
   Pan pan = entityManager.find(Pan.class, 1);
   
   System.out.println(pan.getId());
   System.out.println(pan.getName());
   System.out.println(pan.getAddress());
   System.out.println(pan.getPanNumber());
   
   System.out.println("--------------------------");
   
   Person person = pan.getPerson();
   
   System.out.println(person.getId());
   System.out.println(person.getName());
   System.out.println(person.getEmail());
   
   
  
	}

}
