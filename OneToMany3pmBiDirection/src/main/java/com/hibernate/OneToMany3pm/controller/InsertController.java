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

		State st = new State(4,"UP","hab",24,null);
		
		dist.add(new District(1,"Udham nagar",963742,LocalDate.parse("1998-02-05"),null));
		dist.add(new District(2,"jsdb",74152,LocalDate.parse("2114-09-05"),null));
		dist.add(new District(3,"hgjk",741,LocalDate.parse("1889-06-09"),null));
		dist.add(new District(4,"fyguh",62753,LocalDate.parse("1998-03-09"),null));
		dist.add(new District(5,"uyghjb",142152,LocalDate.parse("1995-06-07"),null));
		
		
		
		
		
		System.out.println(dao.insertStateAndDistrict(dist,st));
		
	}

}