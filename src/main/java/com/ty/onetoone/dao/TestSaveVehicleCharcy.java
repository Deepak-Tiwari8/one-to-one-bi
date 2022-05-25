package com.ty.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Charcy;
import com.ty.onetoone.dto.Vehicle;

public class TestSaveVehicleCharcy {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Vehicle vehicle = new Vehicle();
		vehicle.setName("BMW");
		vehicle.setCost(7865432);

		Charcy charcy = new Charcy();
		charcy.setCharcyNumber("IND5676MP04CS3578");
		charcy.setType("petrol");

		vehicle.setCharcy(charcy);

		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityTransaction.commit();
	}

}
