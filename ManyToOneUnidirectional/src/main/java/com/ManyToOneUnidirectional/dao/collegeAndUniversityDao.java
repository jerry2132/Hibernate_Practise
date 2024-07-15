package com.ManyToOneUnidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ManyToOneUnidirectional.entity.College;
import com.ManyToOneUnidirectional.entity.University;

public class collegeAndUniversityDao {

	EntityManager em = Persistence.createEntityManagerFactory("sumit").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public List<College> InsertDao(List<College> lt) {
		
		
		
		try {
			
			et.begin();
			
			for(College college : lt) {
				
				em.persist(college);
				
				
			}
			et.commit();
			
			return lt;
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	
	
	public boolean addNewCollegeToSameUniversity(College college , int universityId) {
		
		
		University uni = em.find(University.class, universityId);
		
		try {
			et.begin();
			college.setUniversity(uni);
			em.persist(college);
			et.commit();
			return true;
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}
	
}
