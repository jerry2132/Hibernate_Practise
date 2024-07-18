package com.hibernate.ManyToManyUni3pm.controller;

import java.util.ArrayList;
import java.util.List;

import com.hibernate.ManyToManyUni3pm.dao.StudentSubjectDao;
import com.hibernate.ManyToManyUni3pm.entity.Student;
import com.hibernate.ManyToManyUni3pm.entity.Subject;

public class InsertSubjectAndAssignToAllStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentSubjectDao dao = new StudentSubjectDao();
		
		List<Subject> subject = new ArrayList<>();
		
		subject.add(new Subject("maths","rd sharma ",450485));
		
		List<Student> stu = dao.insertSubjectAndAssignToAllStudents(subject);
		
		for (Student student : stu) {
			
			System.out.println(student);
		}
		
	}

}
