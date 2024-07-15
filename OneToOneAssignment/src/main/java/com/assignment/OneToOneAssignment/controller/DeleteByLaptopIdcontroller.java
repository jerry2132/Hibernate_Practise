package com.assignment.OneToOneAssignment.controller;

import com.assignment.OneToOneAssignment.service.ServiceClass;

public class DeleteByLaptopIdcontroller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ServiceClass sc = new ServiceClass();
		
		if(sc.deleteLaptopById(1042))
			System.out.println("deleted");
		else
			System.out.println("not deleted , id not found");
	}

}
