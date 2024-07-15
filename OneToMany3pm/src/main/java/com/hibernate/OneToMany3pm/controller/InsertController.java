package com.hibernate.OneToMany3pm.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.hibernate.OneToMany3pm.dao.StateDistrictDao;
import com.hibernate.OneToMany3pm.dto.District;
import com.hibernate.OneToMany3pm.dto.State;

public class InsertController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StateDistrictDao dao = new StateDistrictDao();
		
		Set<District> dist =new  HashSet<>();

		
		dist.add(new District(8,"Udham nagar",963742,LocalDate.parse("1998-02-05")));
		dist.add(new District(9,"jsdb",74152,LocalDate.parse("2114-09-05")));
		dist.add(new District(10,"hgjk",741,LocalDate.parse("1889-06-09")));
		dist.add(new District(11,"fyguh",62753,LocalDate.parse("1998-03-09")));
		dist.add(new District(12,"uyghjb",142152,LocalDate.parse("1995-06-07")));
		
		
		State st = new State(3,"UP","hab",24,dist);
		
		
		State state = dao.insertStateAndDistrict(st);
		
		System.out.println(state);
	}

}
