package com.ty.manyToOne.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manyToOne.dto.Hotel;
import com.ty.manyToOne.dto.Room;

public class SaveHotelRoom {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Hotel hotel = new Hotel();
		hotel.setName("OYO");
		hotel.setAddress("Mahalakshmi Layout");

		Room room1 = new Room();
		room1.setCapacity(5);
		room1.setType("AC");
		room1.setHotel(hotel);

		Room room2 = new Room();
		room2.setCapacity(10);
		room2.setType("Delux");
		room2.setHotel(hotel);

		Room room3 = new Room();
		room3.setCapacity(5);
		room3.setType("DoubleAC");
		room3.setHotel(hotel);

		transaction.begin();

		manager.persist(hotel);
		manager.persist(room1);
		manager.persist(room2);
		manager.persist(room3);
		
		transaction.commit();
	}

}
