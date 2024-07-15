package com.ManyToManyBidirectional.controller;

import com.ManyToManyBidirectional.dao.SubjectAndStudentDao;

public class updateauhtorNameByphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubjectAndStudentDao dao = new SubjectAndStudentDao();
		
		System.out.println(dao.updateAuthorNameByPhonenumber(594520, "johnny"));

	}

}
