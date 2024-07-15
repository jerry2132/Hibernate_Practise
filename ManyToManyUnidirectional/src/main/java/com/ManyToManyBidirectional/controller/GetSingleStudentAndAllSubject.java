package com.ManyToManyBidirectional.controller;

import com.ManyToManyBidirectional.dao.SubjectAndStudentDao;
import com.ManyToManyBidirectional.enity.Student;

public class GetSingleStudentAndAllSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubjectAndStudentDao dao = new SubjectAndStudentDao();
		
			Student student =dao.getSingleStudentandAllSubject(101);
			System.out.println(student);
			System.out.println(student.getSubject());
		
	}

}
