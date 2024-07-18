package com.hibernate.OneToOne3PMBi.dao;

import java.util.LinkedList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernate.OneToOne3PMBi.entity.Capital;
import com.hibernate.OneToOne3PMBi.entity.Country;

public class CountryCapitalDao {

	
	EntityManager em = Persistence.createEntityManagerFactory("sumit").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	public Country save(Country c , Capital cp) {
		
		try {
			
			et.begin();
			//c.setCapital(cp);
			//cp.setCountry(c);
			em.persist(c);
			et.commit();
//			et.begin();
//			em.persist(cp);
//			em.persist(c);
//			et.commit();
			
			return c;
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	public boolean deleteCoutryById(int id) {
		
	Country con = 	em.find(Country.class, id);
	
	try {
		
		if(con != null) {
			
			et.begin();
			em.remove(con);
			et.commit();
			
			return true;
		}
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}
		return false;
	}
	
	
	public Capital getCapitalById(int capitalId) {
		
		return em.find(Capital.class, capitalId);
	}
	
	
	
	public boolean deleteByCapitalId(int id) {
		
		
		String query = "update Country set capital.id=?1 where capital.id=?2";
		
		Query q = em.createQuery(query);
		
		q.setParameter(1, null);
		q.setParameter(2, id);
		
		//Country country = (Country)q.getSingleResult();
		
		//q.executeUpdate();
		
		Capital cap = 	em.find(Capital.class, id);
		
		try {
			
			if(cap != null) {
				
				et.begin();
				q.executeUpdate();
				//country.setCapital(null);
				//cap.setCountry(null);
				em.remove(cap);
				et.commit();
				
				return true;
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
			return false;
		
	}
//	
//	public Country getCountryByCountryId(int countryId){
//		
//	}															ASSIGNMENT 
	
//	
//	public Country updateCapitalNameByCountryId(int id) {
//		
//	}
	
	
	//delete capital as well as Country by capital id
	//see if capital the no owninng side also have 
	
	
	public boolean deleteCapitalAndCountryByCapitalId(int capitalId) {
		
		Capital capital = em.find(Capital.class, capitalId);
		Country country = capital.getCountry();
		
		
		if(capital != null && country != null) {
			et.begin();
//			capital.setCountry(null);
//			country.setCapital(null);
			em.remove(country);
			
			et.commit();
			
			return true;
		}
		
		return false;
		
	}
	

	public boolean deleteCapitalByCapitalId(int id) {
		
		Capital capital  = em.find(Capital.class, id);
		
		Country country = capital.getCountry();
		
		et.begin();
		country.setCapital(null);
		em.remove(capital);
		et.commit();
		return true;
	}
	
	
}
