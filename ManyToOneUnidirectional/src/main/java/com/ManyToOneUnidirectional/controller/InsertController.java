package com.ManyToOneUnidirectional.controller;

import com.ManyToOneUnidirectional.dao.*;
import com.ManyToOneUnidirectional.service.*;
import com.ManyToOneUnidirectional.entity.*;
import java.util.*;

public class InsertController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//collegeAndUniversityDao dao = new collegeAndUniversityDao();
		
		 ServiceClass sc = new  ServiceClass();
		
		University un = new University(2,"HNBGU","Pauri Garhwal");
		
		List<College> lt = new ArrayList<>();
		lt.add( new College(104,"Hnbgu - Kotdwara","Kotdwara","Bachelor - non tech",un));
		lt.add( new College(105,"hnbgu -srinagar ","Dehradun","Engineering",un));
		lt.add( new College(106,"hnbgu - pantnagar","Dehradun","Engineering",un));
		
		if(sc.saveService(lt) == null)
			System.out.println(" no data");
		else 
			System.out.println("inserted successfully");
			
			
		
		
	}

}
