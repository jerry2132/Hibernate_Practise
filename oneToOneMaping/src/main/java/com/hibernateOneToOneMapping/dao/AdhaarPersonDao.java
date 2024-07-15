package com.hibernateOneToOneMapping.dao;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;

import com.hibernateOneToOneMapping.dto.Adhaar;
import com.hibernateOneToOneMapping.dto.Person;

public class AdhaarPersonDao {

	EntityManager em = Persistence.createEntityManagerFactory("sumit").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Person savePersonDao(Person person,Adhaar adhaar) {
		
		try {
			
			et.begin();
			person.setAdhaar(adhaar);
			adhaar.setPerson(person);
			em.persist(person);
			et.commit();
			
			return person;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	public boolean deletePersonById(int personId) {
		
		//boolean b = false;
//		int res = 0;
//		
//		String deleteById = "DELETE FROM Person s WHERE s.id =?1";
//		
//		Query q = em.createQuery(deleteById);
//		
//		try {
//			q.setParameter(1, personId);
//			et.begin();
//			 res = q.executeUpdate();
//			et.commit();
//		}catch(Exception e) {
//			e.printStackTrace();
//			return b;
//		}
//		
//		
//		if(res > 0 )
//			b = true;
//		
//		return b;
		
		
		Person person = em.find(Person.class, personId);
		
		if(person != null) {
			
			et.begin();
			em.remove(person);
			et.commit();
			return true;
		}
		
		return false;
	}
	
	public boolean deleteAdhaarByPersonId(int personId) {
		
		
//		int res = 0;
//		
//		String deleteById = "DELETE FROM Adhaar s WHERE s.id =?1";
//		
//		Query q = em.createQuery(deleteById);
//		
//		try {
//			q.setParameter(1, adhaarNumber);
//			et.begin();
//			 res = q.executeUpdate();
//			et.commit();
//		}catch(Exception e) {
//			e.printStackTrace();
//			return b;
//		}
//		
//		
//		if(res > 0 )
//			b = true;
//		
//		return b;
		
		Person person = findPersonById(personId);
		
		
		if(person != null) {
			
			et.begin();
			Adhaar ad = person.getAdhaar();
			person.setAdhaar(null);
			em.merge(person);
			
			if(ad != null) {
				em.remove(ad);
				et.commit();
				return true;
			}else 
				return false;
		}
		
		return false;
		
		
	}
	
	public Person findPersonById(int personId) {
		
		Person person  = em.find(Person.class, personId);
		
		return person;
	}
	

	public boolean updateAdharDobByPersonPhoneDao(long phone , LocalDate dob) {
		
		String getPhone = "SELECT s FROM Person s Where s.phone=?1";
		
		Query q = em.createQuery(getPhone);
		
		q.setParameter(1, phone);
		
		try {
			
			
			Person p = (Person)q.getSingleResult();
			
			//int id = p.getId();
			
			//Person person  = em.find(Person.class, p.getId());
			
			if(p != null) {
				
				
				Adhaar adhaar = p.getAdhaar();
				et.begin();
				//person.getAdhaar().setDob(dob);
				
				adhaar.setDob(dob);
				em.merge(adhaar);
				et.commit();
				
				return true;
		}
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		return false;
	}
	
	public Person getPersonAdhaarByPersonId(int personId) {
		
		return em.find(Person.class, personId);
	}
	
	public boolean deletePersonByAdhaarId(long adharId) {
		
		try {
			
		Adhaar adh = 	em.find(Adhaar.class, adharId);
		Person per = adh.getPerson();
		
		et.begin();
		
//		adh.setPerson(null);
		em.remove(per);
		
		et.commit();
		
		return true;
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public Adhaar getAdhaarPersonByAdhaarNumber(long adhaarNumber) {
		
		return em.find(Adhaar.class, adhaarNumber);
		
	}
	
	
}
