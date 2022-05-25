package com.ty.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Vehicle;

public class GetVehicleCharcyById {

	public static void main(String[] args) {
	     EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	       EntityManager entityManager = entityManagerFactory.createEntityManager();
	       
	       Vehicle vehicle = entityManager.find(Vehicle.class, 1);
	       if(vehicle!=null)
	       {
	    	   System.out.println(vehicle.getId());
	    	   System.out.println(vehicle.getName());
	    	   System.out.println(vehicle.getCost());
	    	   System.out.println(vehicle.getCharcy());
	       }
	}

}
