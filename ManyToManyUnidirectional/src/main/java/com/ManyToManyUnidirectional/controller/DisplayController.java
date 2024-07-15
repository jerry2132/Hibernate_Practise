package com.ManyToManyUnidirectional.controller;

import com.ManyToManyUnidirectional.dao.*;
import java.util.*;
import com.ManyToManyUnidirectional.enity.*;
public class DisplayController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SubjectAndStudentDao dao = new SubjectAndStudentDao();
		
		List<Student> stu = dao.getAllStudentAndSubjectDao();
		
		//System.out.println(stu);
		
		for(Student student : stu) {
			
			System.out.println("Id of the student : " + student.getId());
			System.out.println("Name of the student :  " + student.getName());
			System.out.println("Email of the student : " + student.getEmail());
			System.out.println("Number of the student : " + student.getPhone());
			
			List<Subject> subject = student.getSubject();
			
			
			if(subject != null) {
				
				for(Subject sub : subject) {
					
					System.out.println("ASSSOCIATED SUBJECT");
					System.out.print("ID  : "+sub.getId()+" ,  AUTHOR NAME  : "+sub.getAuthorname()+
							",  NAME  : "+sub.getName()+",  PRICE : "+sub.getPrice()+",  PUBLISHED YEAR : "+sub.getPublishedYear());
					
					System.out.println();
					System.out.println();
					
				}
				
			
				
			}else
				System.out.println("no subject associated ");
			
		}
	}

}
