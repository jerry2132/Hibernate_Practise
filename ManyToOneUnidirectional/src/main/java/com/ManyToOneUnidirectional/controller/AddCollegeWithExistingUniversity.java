package com.ManyToOneUnidirectional.controller;


import com.ManyToOneUnidirectional.dao.*;
import com.ManyToOneUnidirectional.entity.College;

public class AddCollegeWithExistingUniversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		collegeAndUniversityDao dao = new collegeAndUniversityDao();
		
		if(dao.addNewCollegeToSameUniversity(new College(107,"roorkee ic ","Dehradun","Engineering",null), 1))
			System.out.println("inserted");
		else 
			System.out.println("not inserted , id not correct");

	}

}
