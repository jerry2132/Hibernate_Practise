package com.hibernate.OneToOne3PMBi.controller;

import com.hibernate.OneToOne3PMBi.dao.CountryCapitalDao;

public class DeleteByIdController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountryCapitalDao dao = new CountryCapitalDao();
		
		if(dao.deleteCoutryById(2))
			System.out.println("deleted");
		else 
			System.out.println("not deleted, id  not found");
		
		
		
	}

}
