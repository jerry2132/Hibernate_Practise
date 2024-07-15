package com.hibernateCRUDOerations.Controller;



import com.hibernateCRUDOerations.dao.StudentDao;
import com.hibernateCRUDOerations.dto.Student;
import com.hibernateCRUDOerations.Exception.*;

public class GetStudentByIdController {

	public static void main(String[] args) {

		Student student = new StudentDao().getStudentByIdDao(12345);

		if (student != null) {
			System.out.println(student);
		} else {
			try {
				throw new IdNotFoundException("given id is not found");
			} catch (IdNotFoundException e) {
				e.printStackTrace();
			}

		}
	}
}

