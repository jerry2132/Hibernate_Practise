package com.hibernateCRUDOerations.Controller;

import com.hibernateCRUDOerations.dao.StudentDao;
import com.hibernateCRUDOerations.dto.Student;

public class UpdateStudentNameById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDao dao = new StudentDao();
		
		Student student = dao.updateStudentNameById(1235, "SumitSinghRawat");
		
		if(student != null)
			System.out.println(student);
		else
			System.out.println("id not found");
		
	}

}
