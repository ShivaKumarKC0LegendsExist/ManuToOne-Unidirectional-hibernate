package com.ty.manyToOne.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.manyToOne.dto.Room;

public class GetRoomById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = entityManagerFactory.createEntityManager();

		Room room = manager.find(Room.class, 1);
		System.out.println(room);
	}

}
