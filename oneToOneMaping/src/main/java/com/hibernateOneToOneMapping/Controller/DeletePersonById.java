package com.hibernateOneToOneMapping.Controller;

import com.hibernateOneToOneMapping.dao.AdhaarPersonDao;

public class DeletePersonById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdhaarPersonDao dao = new AdhaarPersonDao();
		
		boolean b = dao.deletePersonById(103);
		
		if(b)
			System.out.println("Deleted");
		else
			System.out.println("doesnt contain id");
		
	}

}
