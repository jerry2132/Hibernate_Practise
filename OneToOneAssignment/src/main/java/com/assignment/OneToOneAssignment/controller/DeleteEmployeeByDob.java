package com.assignment.OneToOneAssignment.controller;

import java.time.LocalDate;

import com.assignment.OneToOneAssignment.dao.EmployeeLaptopDao;
import com.assignment.OneToOneAssignment.service.ServiceClass;

public class DeleteEmployeeByDob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceClass sc = new ServiceClass();
		
		if(sc.deleteEmployeeByDob(LocalDate.parse("1989-02-03")))
			System.out.println("deleted");
		else 
			System.out.println("no data found");
			
		
	}

}
