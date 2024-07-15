package com.hibernateCRUDOerations.Controller;


import com.hibernateCRUDOerations.dto.*;
import com.hibernateCRUDOerations.dao.*;
import java.util.*;

public class GetAllStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao dao = new StudentDao();
		List<Student> student = new ArrayList<>();
		
		student  = dao.getAllStudents();
		
		Iterator<Student> it = student.iterator();
		
		while (it.hasNext())
			 
            // Print the elements of ArrayList
            System.out.println(it.next() + " ");
    }
		
		//System.out.println(student);
		
		
	}


