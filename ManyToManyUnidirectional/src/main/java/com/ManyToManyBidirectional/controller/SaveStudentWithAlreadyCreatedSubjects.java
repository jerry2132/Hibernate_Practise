package com.ManyToManyBidirectional.controller;

import com.ManyToManyBidirectional.dao.SubjectAndStudentDao;
import com.ManyToManyBidirectional.enity.Student;

public class SaveStudentWithAlreadyCreatedSubjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubjectAndStudentDao dao = new SubjectAndStudentDao();
		
		Student student = new Student(106,"Ahsish","hdhd",594520,null);
		
		System.out.println(dao.saveStudentSubjects(student));
		System.out.println();
		
	}

}
