package com.hibernate.OneToOne3PMBi.controller;

import com.hibernate.OneToOne3PMBi.dao.CountryCapitalDao;

public class DeleteCapitalAndCountryByCapitalId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountryCapitalDao dao = new CountryCapitalDao();
		
		
		System.out.println(dao.deleteCapitalAndCountryByCapitalId(3));
		
	}

}
