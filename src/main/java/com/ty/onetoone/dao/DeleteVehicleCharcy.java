package com.ty.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Vehicle;

public class DeleteVehicleCharcy {

	public static void main(String[] args) {
  
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicle vehicle = entityManager.find(Vehicle.class, 1);
		if(vehicle!=null)
		{
			entityTransaction.begin();
			entityManager.persist(vehicle);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Sorry data is not delete by id");
		}
	}

}
