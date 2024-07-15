package com.hibernateOneToOneMapping.Controller;

import java.time.LocalDate;

import com.hibernateOneToOneMapping.dao.AdhaarPersonDao;

public class UpdateAddressByDOB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdhaarPersonDao dao = new AdhaarPersonDao();
		
		System.out.println(dao.updateAddressByDob(LocalDate.parse("1996-02-03"), "Noida"));

	}

}
