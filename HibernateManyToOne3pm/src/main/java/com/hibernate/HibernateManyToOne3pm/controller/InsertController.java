package com.hibernate.HibernateManyToOne3pm.controller;

import java.util.ArrayList;
import java.util.List;

import com.hibernate.HibernateManyToOne3pm.dao.ClassRoomStudentDao;
import com.hibernate.HibernateManyToOne3pm.entity.ClassRoom;
import com.hibernate.HibernateManyToOne3pm.entity.Student;

public class InsertController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassRoomStudentDao dao = new ClassRoomStudentDao();
		
		ClassRoom cl = new ClassRoom(1,52,"ground","A");
		
		List<Student> st = new ArrayList<>();
		
		
		
		st.add(new Student("hjdn","hbjsdnm",741465184,cl));
		st.add(new Student("hjsdb","bankd",7415,cl));
		st.add(new Student("ajhbd","njnad",554456,cl));
		st.add(new Student("vac","akdnk",74651,cl));
		st.add(new Student("adhj","wuhue",787415415,cl));
		
		dao.insertData(st);
		
	}

}
