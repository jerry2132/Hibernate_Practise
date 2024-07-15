package com.ManyToManyBidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ManyToManyBidirectional.enity.Student;
import com.ManyToManyBidirectional.enity.Subject;

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
	
	
	public boolean deletePhoneNumberById(int id) {

		Student student = em.find(Student.class, id);

		try {
			et.begin();
			student.setPhone(0);
			et.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();
		}

		return false;
	}
	
	
	public boolean updateAuthorNameByPhonenumber(long phoneNumber,String authorName) {
		
		String update = "Select s from Student s where s.phone=?1";
		
		Query q = em.createQuery(update,Student.class);
		
		q.setParameter(1, phoneNumber);
		
		try {
			
			et.begin();
			
			Student student = (Student) q.getSingleResult();
			System.out.println(student);
			
			List<Subject> subject = student.getSubject();
			System.out.println(subject);
			int count=0;
			for(Subject sub : subject) {
				
				if(sub.getAuthorname().equals("jimmy22"))
					sub.setAuthorname(authorName);
				//System.out.println(sub.getAuthorname());
				//em.merge(sub);
				
				count++;
			}
			
			et.commit();
			System.out.println(count);
			System.out.println(subject);
			
			return true;
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean updateStudentEmailByAutorName(String authorName , String email) {
		
		String update = "Select s from Subject s where s.authorname=?1";
		
		Query q = em.createQuery(update);
		
		q.setParameter(1, authorName);
		
		try {
			
			et.begin();
			Subject sub = (Subject)q.getSingleResult();
			List<Student> student = sub.getStudent();
			
			for(Student stu : student) {
				
				if(stu.getName().equals("naman"))
					stu.setEmail(email);
			}
			
			et.commit();
			
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public Student getSingleStudentandAllSubject(int id){
		
		
	return em.find(Student.class, id);
	}
	
	public Student saveStudentSubjects(Student st) {
		
		try {
			
			
			List<Subject> sub = getAllSubjects();
			
			et.begin();
			st.setSubject(sub);
			em.persist(st);
			em.merge(st);
			et.commit();
			
			return st;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<Subject> getAllSubjects(){
		
		String sql = "select s from Subject s";
		Query q = em.createQuery(sql);
		
		return q.getResultList();
		
	}
}


//public List<student> getAllStudentAndSubjectDao()

//deletephoneNumber
//updateAuthor
//updatePhone
//fetch a single student and all subject he is taking