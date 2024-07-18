package com.hibernate.ManyToManyUni3pm.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hibernate.ManyToManyUni3pm.dao.StudentSubjectDao;
import com.hibernate.ManyToManyUni3pm.entity.Student;
import com.hibernate.ManyToManyUni3pm.entity.Subject;

public class InsertController {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		StudentSubjectDao dao = new  StudentSubjectDao();
		 
		List<Student> student = new ArrayList<>();
		List<Subject> subject  = new ArrayList<>();
		
		subject.add(new Subject("cricket", "jdfn", 4512865));
		subject.add(new Subject("physics", "sd", 4512865));
		subject.add(new Subject("chemistry", "efasd", 45142865));
		
		//"C:\\Users\\DELL\\Downloads\\virat2.jpg"
		
		byte[] image  = imageConverter("C:\\Users\\DELL\\Downloads\\virat2.jpg");
	
		byte[] image2  = imageConverter("C:\\Users\\DELL\\Downloads\\gang.jpg");
		
		
		student.add(new Student("virat","jkdn", 11541215, image,subject));
		student.add(new Student("sourav","souravhds", 1451121215, image2,subject));
		
		dao.insertStudent(student);
		
	}
	
	public static byte[] imageConverter(String path) throws FileNotFoundException, IOException {
		
		File file = new File(path);
		return new FileInputStream(file).readAllBytes();
	}

}
