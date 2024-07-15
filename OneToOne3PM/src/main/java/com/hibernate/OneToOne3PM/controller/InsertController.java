package com.hibernate.OneToOne3PM.controller;

import com.hibernate.OneToOne3PM.entity.Capital;
import com.hibernate.OneToOne3PM.entity.Country;
import com.hibernate.OneToOne3PM.entity.dao.CountryCapitalDao;

public class InsertController {

	
	
	
	public static void main(String[] args) {
	
		CountryCapitalDao cc = new CountryCapitalDao();
		
		Capital cap = new Capital(3,"ny",79989,5);
		Country con  = new Country(5,"USA",78809,7890878,null);
		
		cc.save(con, cap);
		
	}
}
