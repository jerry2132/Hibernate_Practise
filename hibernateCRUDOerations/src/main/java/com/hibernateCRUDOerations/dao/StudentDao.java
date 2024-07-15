package com.hibernateCRUDOerations.dao;



import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;

import com.hibernateCRUDOerations.dto.Student;

public class StudentDao {

	EntityManager em = Persistence.createEntityManagerFactory("sumit").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Student saveStudentDao(Student student) {
		try {
			et.begin();
			em.persist(student);
			et.commit();
			return student;
		} catch (IllegalStateException|RollbackException|IllegalArgumentException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public Student getStudentByIdDao(int studentId) {
		return em.find(Student.class, studentId);
	}
	
	public Student getStudentByNameDao(String name) {
		//JPQL QUERY
		String selectByNameQuery = "SELECT s FROM Student s Where s.name=?1";
		
		Query query=em.createQuery(selectByNameQuery);
		
		query.setParameter(1, name);
		
		try {
			 return (Student)query.getSingleResult();
		} catch (Exception e) {
			return null;
		}  
	}
	
	
	public List<Student> getAllStudents(){
		
		
		List<Student> st = new ArrayList<>();
		String getAllQuery = "SELECT e FROM Student e";
		
		Query q = em.createQuery(getAllQuery);
		
		st = q.getResultList();
		
		return st;
	
		
	}
	
	public boolean deleteStudentById(int id) {
		
		boolean b = false;
		int res = 0;
		
		String deleteById = "DELETE FROM Student s WHERE s.id =?1";
		
		Query q = em.createQuery(deleteById);
		
		try {
			q.setParameter(1, id);
			et.begin();
			 res = q.executeUpdate();
			et.commit();
		}catch(Exception e) {
			e.printStackTrace();
			return b;
		}
		
		
		if(res > 0 )
			b = true;
		
		return b;
		
	}
	
	public Student updateStudentNameById(int id , String name) {
		
		
		
		Student student = em.find(Student.class, id);
		
		if(student != null) {
			
			student.setName(name);
			et.begin();
			em.merge(student);
			et.commit();
		}
			
		
		return student;
		
	}
}
