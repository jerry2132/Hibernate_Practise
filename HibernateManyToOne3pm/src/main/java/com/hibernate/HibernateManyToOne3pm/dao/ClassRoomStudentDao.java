package com.hibernate.HibernateManyToOne3pm.dao;

import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.HibernateManyToOne3pm.entity.ClassRoom;
import com.hibernate.HibernateManyToOne3pm.entity.Student;

public class ClassRoomStudentDao {

	EntityManager em = Persistence.createEntityManagerFactory("sumit").createEntityManager();
	EntityTransaction et = em.getTransaction();

	public List<Student> insertData(List<Student> st) {
		
		et.begin();

		for (Student student : st) {
			//student.setClassRoom(cl);
			em.persist(student);
		}
		et.commit();
		return st;
	}
	
	
	public List<Student> getStudentByClassId(int id) {
		
		List<Student> student =em.createQuery("select s from Student s where s.classRoom.number=?1").
				setParameter(1, id).getResultList();
		
		//List <Student> student = stu.toList();
		
		return student;
	}
	
	

}
