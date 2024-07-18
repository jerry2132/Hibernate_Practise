package com.hibernate.OneToMany3pm.controller;

import com.hibernate.OneToMany3pm.dao.StateDistrictDao;

public class GetStateByStateId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StateDistrictDao dao = new StateDistrictDao();
		
		System.out.println(dao.getStateByStateById(3));
		
	}

}
