package com.hibernate.HibernateManyToOne3pm.controller;

import java.util.List;

import com.hibernate.HibernateManyToOne3pm.dao.ClassRoomStudentDao;
import com.hibernate.HibernateManyToOne3pm.entity.Student;

public class GetStudentByClassRoomId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassRoomStudentDao dao = new ClassRoomStudentDao();
		
		List<Student> student = dao.getStudentByClassId(1);
		
		System.out.println(student);

	}

}
