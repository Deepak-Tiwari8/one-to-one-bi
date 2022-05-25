package com.ty.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Vehicle;

public class UpdateVehicleCharcy {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicle vehicle = entityManager.find(Vehicle.class, 1);
		if(vehicle!=null)
		{
			
			entityTransaction.begin();
			vehicle.setName("HayaaBosa");
			vehicle.setCost(90876);
			entityManager.merge(vehicle);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Sorry we can not update ");
		}
	}

}
