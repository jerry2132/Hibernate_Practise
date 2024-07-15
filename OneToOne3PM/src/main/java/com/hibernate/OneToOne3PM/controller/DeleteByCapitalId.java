package com.hibernate.OneToOne3PM.controller;

import com.hibernate.OneToOne3PM.entity.dao.CountryCapitalDao;

public class DeleteByCapitalId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CountryCapitalDao dao = new CountryCapitalDao();
		
		if(dao.deleteByCapitalId(3))
			System.out.println("deleted");
		else
			System.out.println("not deleted");
	}

}
