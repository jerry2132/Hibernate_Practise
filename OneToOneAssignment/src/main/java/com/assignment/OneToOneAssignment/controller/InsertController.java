package com.assignment.OneToOneAssignment.controller;

import com.assignment.OneToOneAssignment.dto.*;

import java.time.LocalDate;

import com.assignment.OneToOneAssignment.service.*;

//import com.assignment.OneToOneAssignment.dao.*;
public class InsertController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceClass sc = new ServiceClass();
		
		Laptop laptop = new Laptop(104,"predetor",41152,"asus");
		
		Employee emp = new Employee(4,"aneet",LocalDate.parse("2000-02-03"),"jhsd",null);
		
		System.out.println(sc.insertEmployeeAndLaptop(emp, laptop));
	}

}
