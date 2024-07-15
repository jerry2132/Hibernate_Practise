package com.hibernate.OneToMany3pm.controller;

import com.hibernate.OneToMany3pm.dao.StateDistrictDao;

public class DeleteDistrictByStateId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StateDistrictDao dao = new StateDistrictDao();
		
		dao.deleteDistrictByStateId(1);
	}

}
