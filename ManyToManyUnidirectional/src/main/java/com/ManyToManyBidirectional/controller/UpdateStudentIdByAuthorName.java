package com.ManyToManyBidirectional.controller;

import com.ManyToManyBidirectional.dao.SubjectAndStudentDao;

public class UpdateStudentIdByAuthorName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubjectAndStudentDao dao = new SubjectAndStudentDao();
		
		System.out.println(dao.updateStudentEmailByAutorName("jimm", "naman@gmail.com"));
		
	}

}
