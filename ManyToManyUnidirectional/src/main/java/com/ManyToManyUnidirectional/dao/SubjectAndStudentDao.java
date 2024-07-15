package com.ManyToManyUnidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ManyToManyUnidirectional.enity.Student;
import com.ManyToManyUnidirectional.enity.Subject;

public class SubjectAndStudentDao {

	EntityManager em = Persistence.createEntityManagerFactory("sumit").createEntityManager();
	EntityTransaction et = em.getTransaction();

	public List<Student> insertStudentandSubject(List<Student> st) {

		try {

			et.begin();

			for (Student student : st) {

				em.persist(student);
			}

			et.commit();

			return st;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	public boolean deleteSubjectByIdDao(int subjectId) {

		Subject subject = em.find(Subject.class, subjectId);

		try {

			et.begin();
			em.createNativeQuery("Delete from student_subject where subject_id=?1").setParameter(1, subjectId)
					.executeUpdate();

			em.remove(subject);
			et.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}
	
	public List<Student> getAllStudentAndSubjectDao(){
		
		//em.createNativeQuery("Select * from Student").executeUpdate();
		
		String display = "select s from Student s";
		
		Query q = em.createQuery(display);
		
		List<Student> st = q.getResultList();
		
		
		
		return st;
		
	}
}
//public List<student> getAllStudentAndSubjectDao()