package com.hibernate.OneToMany3pm.controller;

import java.util.Set;

import com.hibernate.OneToMany3pm.dao.StateDistrictDao;
import com.hibernate.OneToMany3pm.dto.District;
import com.hibernate.OneToMany3pm.dto.State;

public class GetAllData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StateDistrictDao dao = new StateDistrictDao();
		
		
		State st =dao.getAll(1);
		
		System.out.println(st);
		
		Set<District> dist = st.getDistrict();
		
		System.out.println("ASSOCIATED DISTRICTS .....");
		for(District district : dist) {
			
			System.out.println(district);
		}
	}

}
