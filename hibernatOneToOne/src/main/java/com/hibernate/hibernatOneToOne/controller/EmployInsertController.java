package com.hibernate.hibernatOneToOne.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployInsertController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = Persistence.createEntityManagerFactory("jakarta").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		

	}

}
