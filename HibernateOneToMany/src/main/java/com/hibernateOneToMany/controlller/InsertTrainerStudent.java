package com.hibernateOneToMany.controlller;


import java.time.LocalDate;
import java.util.*;

import com.hibernateOneToMany.dto.*;
import com.hibernateOneToMany.dao.*;
public class InsertTrainerStudent {

	
	public static void main(String[] args) {
		
		
		TrainerDao dao = new TrainerDao();
		List<Students> st = new ArrayList<>();
		
		
		Trainer trainer = new Trainer(1,"hjbn","hsdjbad",96519851,LocalDate.parse("1997-02-03"),"java",null);
		Trainer t2 = new Trainer(2,"jumnanjn","hsdjbad",96519851,LocalDate.parse("1993-02-03"),"java",null);
		
		st.add(new Students(101,"pawan","guydbh",LocalDate.parse("2002-02-03"),trainer));
		st.add(new Students(102,"nitish","guydbh",LocalDate.parse("2002-02-03"),trainer));
		st.add(new Students(103,"laalu","guydbh",LocalDate.parse("2002-02-03"),trainer));
		st.add(new Students(104,"kaalu","guydbh",LocalDate.parse("2004-02-03"),t2));
		st.add(new Students(105,"kaaluthgh","guydbh",LocalDate.parse("7004-02-03"),t2));
		
		List<Students> student = dao.saveTrainerAndStudent(st);
		
		for(Students stu : student) {
			
			System.out.println(stu);
			
			
			if(stu.getTrainer() != null)
				System.out.println(stu.getTrainer());
			
		}
		
		
	}
}
//when one  object is associated with multiple  object from one direction is OneToMany unidirectional mapping ;
//e.g one teacher can have multiple student , one uinversity can have multiple colleges.