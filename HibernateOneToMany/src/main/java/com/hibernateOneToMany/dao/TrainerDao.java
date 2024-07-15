package com.hibernateOneToMany.dao;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernateOneToMany.dto.Students;
import com.hibernateOneToMany.dto.Trainer;

public class TrainerDao {

	EntityManager em = Persistence.createEntityManagerFactory("sumit").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public List<Students> saveTrainerAndStudent(List<Students> list) {
		
		//List<Students> st = new ArrayList<>();
		//st.add(students);
		try {
			
			et.begin();
			for(Students stu : list) {
				
				em.persist(stu);
			}
			
			//trainer.setStudents(st);
			
			et.commit();
			
			return list;
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public boolean updateEmailofStudentByStudentId(int studentId,String email) {
		
		Students stu = em.find(Students.class, studentId);
		
		try {
			
			et.begin();
			stu.setEmail(email);
			//em.merge(stu);
			et.commit();
			
			return true;
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	
}
