package com.hibernate.OneToMany3pm.dao;

import java.util.List;
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
	
	
	public Set<District> insertStateAndDistrict(Set<District> district,State state) {
		
		et.begin();
//		for (District district2 : district) {
//			
//			district2.setState(state);
//			
//		}
		
		for (District district2 : district) {
			
			district2.setState(state);
			em.persist(district2);
		}
		
		
		et.commit();
		
		return district;
		
	}
	
	public State getStateByStateById(int stateid) {
		
		return em.find(State.class, stateid);
	}
	
	
//	public boolean deleteDistrictByStateId(int districtId ) {
//		
//		
//		
//		
//	}
	
	
	public boolean deleteDistrictById(int id) {
		
		District district = em.find(District.class, id);
		
		System.out.println(district);
		et.begin();
		district.setState(null);
		em.remove(district);
		et.commit();
		
		return true;
	}
	
	
	
	public State getAll(int id) {
		
		return em.find(State.class, id);
	}
	
	
//	public boolean deleteDistrictByIdDao(int districtId) {
//		
//		
//		District dist = em.find(District.class, districtId);
//		
//		
//		if(dist != null) {
//			
//			et.begin();
//			
//			em.createNativeQuery("delete from state_district where district_id=?1").
//			setParameter(1, districtId).executeUpdate();
//			
//			em.remove(dist);
//			
//			et.commit();
//			
//			return true;
//		}
//		
//		return false;
//		
//	}
	
	
	public boolean deleteStateByStateId(int stateId) {
		
		State state = em.find(State.class, stateId);
		
		
		
		
		
		et.begin();
		
		em.createQuery("update District d set d.state=?1 where d.state.id=?2").setParameter(1, null).setParameter(2, stateId)
		.executeUpdate();
//		em.createQuery("update District where ")
		em.remove(state);
		et.commit();
		
		return true;
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
