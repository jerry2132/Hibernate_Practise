package com.hibernateCRUDOerations.Controller;



import com.hibernateCRUDOerations.dao.StudentDao;
import com.hibernateCRUDOerations.dto.Student;

public class GetStudentByNameController {

	public static void main(String[] args) {
		
		Student student = new StudentDao().getStudentByNameDao("aleem1");

		if (student != null) {
			System.out.println(student);
		} else {
			System.out.println("given name is not found");

		}
	}
}
