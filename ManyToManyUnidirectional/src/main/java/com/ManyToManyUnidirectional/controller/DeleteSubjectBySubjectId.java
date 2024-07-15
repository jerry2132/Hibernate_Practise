package com.ManyToManyUnidirectional.controller;

import com.ManyToManyUnidirectional.dao.SubjectAndStudentDao;

public class DeleteSubjectBySubjectId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SubjectAndStudentDao dao = new SubjectAndStudentDao();
		
		
		dao.deleteSubjectByIdDao(123);
	}

}
