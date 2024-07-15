package com.hibernateCRUDOerations.Controller;

import com.hibernateCRUDOerations.dao.StudentDao;

public class DeleteById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDao dao = new StudentDao();
		
		boolean b= dao.deleteStudentById(12345);
		
		if(b)
			System.out.println("deleted ");
		else
			System.out.println("id not found");
		
	}

}
