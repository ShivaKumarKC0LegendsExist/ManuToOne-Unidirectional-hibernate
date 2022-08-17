package com.ty.manyToOne.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.manyToOne.dto.Hotel;

public class GetHotelByID {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = entityManagerFactory.createEntityManager();

		Hotel hotel = manager.find(Hotel.class, 2);
		System.out.println(hotel);
	}

}
