package com.assignment.OneToOneAssignment.controller;

import java.util.List;

import com.assignment.OneToOneAssignment.dto.Employee;
import com.assignment.OneToOneAssignment.dto.Laptop;
import com.assignment.OneToOneAssignment.service.ServiceClass;

public class DisplayAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceClass sc = new ServiceClass();
		
		
		 List<Employee> employees = sc.getDetails();

	        for (Employee employee : employees) {
	            System.out.println("Employee ID: " + employee.getId());
	            System.out.println("Employee Name: " + employee.getName());
	            System.out.println("Employee Dob: " + employee.getDob());
	            System.out.println("Employee Email: " + employee.getEmail());

	            Laptop laptop = employee.getLaptop();
	            if (laptop != null) {
	                System.out.println("Laptop ID: " + laptop.getId());
	                System.out.println("Laptop Brand: " + laptop.getName());
	                System.out.println("Laptop Model: " + laptop.getPrice());
	            } else {
	                System.out.println("No Laptop assigned");
	            }

	            System.out.println("-------------------------------");
	        }
	    }
	}


