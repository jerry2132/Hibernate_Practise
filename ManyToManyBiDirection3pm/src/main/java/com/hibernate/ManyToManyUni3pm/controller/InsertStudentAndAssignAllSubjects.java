package com.hibernate.ManyToManyUni3pm.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hibernate.ManyToManyUni3pm.dao.StudentSubjectDao;
import com.hibernate.ManyToManyUni3pm.entity.Student;

public class InsertStudentAndAssignAllSubjects {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		StudentSubjectDao dao = new StudentSubjectDao();
		
		List<Student> st = new ArrayList<>();
		
		byte[] image  = imageConverter("C:\\Users\\DELL\\Downloads\\virat2.jpg");
		byte[] image1  = imageConverter("C:\\Users\\DELL\\Downloads\\gang.jpg");
		
		st.add(new Student("john","asjdj",448455,image,null));
		st.add(new Student("kabir","asjasdadj",451448455,image1,null));
		
		System.out.println(dao.insertStudentAndAssignAllSubjects(st));
		

	}
	
	public static byte[] imageConverter(String path) throws FileNotFoundException, IOException {
		
		File file = new File(path);
		return new FileInputStream(file).readAllBytes();
	}

}
