package com.hibernate.ManyToManyUni3pm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.ManyToManyUni3pm.entity.Student;
import com.hibernate.ManyToManyUni3pm.entity.Subject;

public class StudentSubjectDao {

	EntityManager em = Persistence.createEntityManagerFactory("sumit").createEntityManager();
	EntityTransaction et = em.getTransaction();

	public List<Student> insertStudent(List<Student> student) {

		et.begin();
		for (Student student2 : student) {

			em.persist(student2);
		}

		et.commit();

		return student;
	}

	public boolean deleteSubjectOfSpecificStudent(int id, String name) {
		try {

			// Student student = em.find(Student.class, id);

			Subject subject = (Subject) em.createQuery("select s from Subject s where s.name=?1").setParameter(1, name)
					.getSingleResult();

			int subject_id = subject.getId();

			// System.out.println(ids.);
			et.begin();
			// em.createNativeQuery("delete from student_subject where ")
			em.createNativeQuery("delete from student_subject where Student_id=?1 && subject_id=?2").setParameter(1, id)
					.setParameter(2, subject_id).executeUpdate();
			et.commit();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			;
		}

		return false;
	}

	public List<Student> insertSubjectAndAssignToAllStudents(List<Subject> subject) {

		List<Student> student = em.createQuery("from Student").getResultList();

		try {
			et.begin();

			for (Student student2 : student) {

				List<Subject> sub = student2.getSubject();
				sub.addAll(subject);
				student2.setSubject(sub);
				em.persist(student2);
			}

			et.commit();

			return student;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	public List<Student> insertStudentAndAssignAllSubjects(List<Student> student) {

		List<Subject> subject = em.createQuery("from Subject").getResultList();

		try {
			et.begin();
			for (Student stu : student) {

				stu.setSubject(subject);
				em.persist(stu);

			}

			et.commit();

			return student;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	public boolean deletSubjectFromStudent(String studentName, String subjectName) {
		
		Student student = (Student) em.createQuery("select s from Student s where s.name=?1").setParameter(1, studentName).getSingleResult();
		
		Subject subject = (Subject) em.createQuery("select s from Subject s where s.name=?1").setParameter(1, subjectName).getSingleResult();
		
		//student.getId();
		
		try {
			et.begin();
			em.createNativeQuery("delete from student_subject where Student_id=?1 && subject_id=?2").setParameter(1, student.getId())
				.setParameter(2, subject.getId()).executeUpdate();
			et.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}

/*
 * List<Student> allStudents = em.createQuery("SELECT s FROM Student s",
 * Student.class).getResultList();
 * 
 * List<Student> student1 = allStudents.stream() .filter(student ->
 * student.getSubject().stream() .anyMatch(subject ->
 * name.equals(subject.getName()))) .collect(Collectors.toList());
 * 
 * 
 * for (Student student2 : student1) {
 * 
 * System.out.println(student2); }
 * 
 * 
 * 
 */