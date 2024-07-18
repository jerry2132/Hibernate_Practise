package com.hibernate.OneToOne3PMBi.controller;

import com.hibernate.OneToOne3PMBi.dao.CountryCapitalDao;
import com.hibernate.OneToOne3PMBi.entity.Capital;

public class GetCapitalById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountryCapitalDao cc = new CountryCapitalDao();
		
		//System.out.println(cc.getCapitalById(8).getCountry());
		
		Capital cap = cc.getCapitalById(8);
		System.out.println(cap);
		System.out.println(cap.getCountry());
		
	}

}
