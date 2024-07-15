package com.hibernateOneToOneMapping.Controller;

import com.hibernateOneToOneMapping.dao.AdhaarPersonDao;

public class DeletePersonByAdhaarId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdhaarPersonDao dao  = new AdhaarPersonDao();
		
		System.out.println(dao.deletePersonByAdhaarId(908425));
		
		
	}

}
