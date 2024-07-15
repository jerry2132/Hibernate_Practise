package com.ManyToOneUnidirectional.controller;

import com.ManyToOneUnidirectional.dao.collegeAndUniversityDao;

public class DeleteCollegeByCollegeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		collegeAndUniversityDao dao = new collegeAndUniversityDao();
		
		System.out.println(dao.deleteCollegeByCollegeName("roorkee ic "));
		
	}

}
