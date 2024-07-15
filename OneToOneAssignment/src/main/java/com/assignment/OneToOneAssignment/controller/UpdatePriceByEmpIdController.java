package com.assignment.OneToOneAssignment.controller;

import com.assignment.OneToOneAssignment.service.ServiceClass;

public class UpdatePriceByEmpIdController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceClass sc = new ServiceClass();
		
		if(sc.updateLaptopPriceByEmpId(4, 452165))
			System.out.println("updated");
		else
			System.out.println("not updated , id not found");
		
	}

}
