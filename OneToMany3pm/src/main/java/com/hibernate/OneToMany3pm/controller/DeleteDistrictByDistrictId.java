package com.hibernate.OneToMany3pm.controller;

import com.hibernate.OneToMany3pm.dao.StateDistrictDao;

public class DeleteDistrictByDistrictId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StateDistrictDao dao = new StateDistrictDao();
		
		//dao.deleteDistrictById(5);
		
		dao.deleteDistrictByIdDao(9);

	}

}