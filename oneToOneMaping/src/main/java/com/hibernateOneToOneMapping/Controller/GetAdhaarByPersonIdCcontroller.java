package com.hibernateOneToOneMapping.Controller;

import com.hibernateOneToOneMapping.dao.AdhaarPersonDao;
import com.hibernateOneToOneMapping.dto.Person;

public class GetAdhaarByPersonIdCcontroller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdhaarPersonDao dao  = new AdhaarPersonDao();
		
		Person person = dao.getPersonAdhaarByPersonId(103);
		
		System.out.println(person);
		System.out.println(person.getAdhaar());
		
	}

}
