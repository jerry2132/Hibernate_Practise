package com.hibernateOneToOneMapping.Controller;

import java.time.LocalDate;

import com.hibernateOneToOneMapping.dao.AdhaarPersonDao;

public class UpateAdhaarDobByPersonPhoneController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdhaarPersonDao dao = new AdhaarPersonDao();
		
		if(dao.updateAdharDobByPersonPhoneDao(8465152, LocalDate.parse("1988-09-03")))
			System.out.println("updated");
		else
			System.out.println("not updated");
	}

}
