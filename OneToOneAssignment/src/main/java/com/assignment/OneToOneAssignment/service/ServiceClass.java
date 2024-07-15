package com.assignment.OneToOneAssignment.service;

import com.assignment.OneToOneAssignment.dto.Employee;
import com.assignment.OneToOneAssignment.dto.Laptop;

import java.time.LocalDate;
import java.util.List;

import com.assignment.OneToOneAssignment.dao.*;


public class ServiceClass {

	EmployeeLaptopDao dao = new EmployeeLaptopDao();
	
public Employee insertEmployeeAndLaptop(Employee emp , Laptop laptop) {
	
	
	if(emp != null && laptop !=null) {
		dao.insertEmployeeAndLaptop(emp, laptop);
		return emp;
	}else
		return null;	
}


public boolean deleteLaptopById(int laptopId) {
	
	if(laptopId >0 ) {
		
		if(dao.deleteLaptopById(laptopId))
			return true;
		else
			return false;
	}
	else
		return false;
}


public boolean deleteEmployeeByDob(LocalDate date) {
	
	
	if(date != null) {
		if(dao.deleteEmployeeByDob(date));
			return true;
	}else
		return false;

}

public boolean updateLaptopPriceByEmpId(int id, long price) {
	
	
	if(id > 0 && price > 0) {
		
		if(dao.updateLaptopPriceByEmployeeId(id, price))
			return true;
		else 
			return false;
	}
	
	return false;
}

public List<Employee> getDetails(){
	
	List<Employee> emp = dao.displayLaptopAndEmployee();
	
	
	return emp;
}
	
}
