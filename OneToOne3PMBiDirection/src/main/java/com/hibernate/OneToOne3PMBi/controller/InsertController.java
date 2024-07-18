package com.hibernate.OneToOne3PMBi.controller;

import com.hibernate.OneToOne3PMBi.dao.CountryCapitalDao;
import com.hibernate.OneToOne3PMBi.entity.Capital;
import com.hibernate.OneToOne3PMBi.entity.Country;

public class InsertController {


	public static void main(String[] args) {
	
		CountryCapitalDao cc = new CountryCapitalDao();
		
		Capital cap = new Capital(8,"ny",79989,5,null);
		Country con  = new Country(99,"USA",78809,7890878,cap);
		
		cc.save(con, cap);
		
	}
}
