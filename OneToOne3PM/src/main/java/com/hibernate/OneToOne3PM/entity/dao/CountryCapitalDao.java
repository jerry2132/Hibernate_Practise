package com.hibernate.OneToOne3PM.entity.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernate.OneToOne3PM.entity.Capital;
import com.hibernate.OneToOne3PM.entity.Country;

public class CountryCapitalDao {

	
	EntityManager em = Persistence.createEntityManagerFactory("sumit").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	public Country save(Country c , Capital cp) {
		
		try {
			
			et.begin();
			c.setCapital(cp);
			em.persist(c);
			et.commit();
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
	
	
	public boolean deleteByCapitalId(int id) {
		
		
		String query = "update Country set capital.id=?1 where capital.id=?2";
		
		Query q = em.createQuery(query);
		
		q.setParameter(1, null);
		q.setParameter(2, id);
		
		//Country country = (Country)q.getSingleResult();
		
		//q.executeUpdate();
		
		Capital con = 	em.find(Capital.class, id);
		
		try {
			
			if(con != null) {
				
				et.begin();
				q.executeUpdate();
				//country.setCapital(null);
				em.remove(con);
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
}
