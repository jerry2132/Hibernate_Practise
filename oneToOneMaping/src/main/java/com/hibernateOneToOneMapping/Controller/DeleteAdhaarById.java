package com.hibernateOneToOneMapping.Controller;

import com.hibernateOneToOneMapping.dao.AdhaarPersonDao;

public class DeleteAdhaarById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	AdhaarPersonDao dao = new AdhaarPersonDao();
		
		boolean b = dao.deleteAdhaarByPersonId(101);
		
		if(b)
			System.out.println("Adhaaar Details Deleted");
		else
			System.out.println("doesnt contain Adhaarid");
		
	}
		
	}


