package com.hibernate.OneToOne3PM.controller;

import com.hibernate.OneToOne3PM.entity.dao.CountryCapitalDao;

public class DeleteByIdController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountryCapitalDao dao = new CountryCapitalDao();
		
		if(dao.deleteCoutryById(31))
			System.out.println("deleted");
		else 
			System.out.println("not deleted, id  not found");
		
		
		
	}

}