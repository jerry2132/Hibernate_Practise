package com.hibernate.OneToMany3pm.dao;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernate.OneToMany3pm.dto.District;
import com.hibernate.OneToMany3pm.dto.State;

public class StateDistrictDao {

	
	EntityManager em = Persistence.createEntityManagerFactory("sumit").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	public State insertStateAndDistrict(State state) {
		
		et.begin();
		em.persist(state);
		et.commit();
		
		return state;
		
	}
	
	
	public boolean deleteDistrictByStateId(int id) {
		
		State state = em.find(State.class, id);
		
		
		Set<District> dist = state.getDistrict();
		
		District districtToRemove = null;
		
		for(District district : dist) {
			
			if(district.getId() == 1) {
				districtToRemove = district;
				break;
			}
		}
		
		if(districtToRemove != null) {
			
			et.begin();
			dist.remove(districtToRemove);
			em.remove(districtToRemove);
			et.commit();
		}
		
		return false;
		
	}
	
	public boolean deleteDistrictById(int id) {
		
		String query  = "select State_id from state_district where district_id = :id";
		
		Query q = em.createNativeQuery(query);
		
		q.setParameter("id" , id);
		
		int stateId= (int) q.getSingleResult();
		
		State state = em.find(State.class, stateId);
		
		Set<District> dist = state.getDistrict();
		District districtToRemove = null;
		
		for (District district : dist) {
			
			if(district.getId() == id) {
				
				districtToRemove = district;
				break;
				
			}
		}
		
		if(districtToRemove != null) {
		et.begin();
		dist.remove(districtToRemove);
		em.remove(districtToRemove);
		//em.merge(dist);
		
		et.commit();
		return true;
		}
		
		
		//System.out.println(k);
		return false;
	    
	}
	
	public State getAll(int id) {
		
		return em.find(State.class, id);
	}
	
	
	public boolean deleteDistrictByIdDao(int districtId) {
		
		
		District dist = em.find(District.class, districtId);
		
		
		if(dist != null) {
			
			et.begin();
			
			em.createNativeQuery("delete from state_district where district_id=?1").
			setParameter(1, districtId).executeUpdate();
			
			em.remove(dist);
			
			et.commit();
			
			return true;
		}
		
		return false;
		
	}
	
	
}

/*
 *
 * 
 * //		Set<District> dist =	state.getDistrict();
//		
//		District districtToRemove = null;
//		
//		for(District district : dist) {
//			
//			if(district.getId() == id) {
//				
//				districtToRemove = district;
//				break;
//			}
//			
//		}
//		
//		
//		if(districtToRemove != null) {
//			
//			et.begin();
//			
//			dist.remove(districtToRemove);
//			em.remove(districtToRemove);
//			et.commit();
//			
//			return true;
//		}
		
//		District district = em.find(District.class, id);
		
//		System.out.println(district);
 * 
 */