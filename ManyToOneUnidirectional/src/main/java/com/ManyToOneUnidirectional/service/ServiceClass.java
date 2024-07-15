package com.ManyToOneUnidirectional.service;

import java.util.List;

import com.ManyToOneUnidirectional.dao.collegeAndUniversityDao;
import com.ManyToOneUnidirectional.entity.College;

public class ServiceClass {

	collegeAndUniversityDao dao = new collegeAndUniversityDao();
	
	public List<College> saveService(List<College> lt){
		
		
		if(!lt.isEmpty()) 
			return  dao.InsertDao(lt);
		else 
			return null;
		
	}
}
