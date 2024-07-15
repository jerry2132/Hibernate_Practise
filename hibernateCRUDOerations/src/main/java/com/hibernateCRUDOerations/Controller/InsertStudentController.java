package com.hibernateCRUDOerations.Controller;



import com.hibernateCRUDOerations.dao.StudentDao;
import com.hibernateCRUDOerations.dto.Student;

public class InsertStudentController {

	public static void main(String[] args) {
		
		StudentDao dao = new StudentDao();
		
		Student student=new Student(123, "sumit", "sumitsingh@gmail.com", 56789000);
		
		dao.saveStudentDao(student);
		
	}
}

