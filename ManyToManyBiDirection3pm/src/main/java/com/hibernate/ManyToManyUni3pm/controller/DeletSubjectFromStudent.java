package com.hibernate.ManyToManyUni3pm.controller;

import com.hibernate.ManyToManyUni3pm.dao.StudentSubjectDao;

public class DeletSubjectFromStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentSubjectDao dao = new StudentSubjectDao();
		
		System.out.println(dao.deletSubjectFromStudent("virat", "maths"));
		
	}

}
