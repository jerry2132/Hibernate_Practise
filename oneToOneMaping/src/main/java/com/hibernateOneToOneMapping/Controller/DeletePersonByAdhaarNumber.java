package com.hibernateOneToOneMapping.Controller;

import com.hibernateOneToOneMapping.dao.AdhaarPersonDao;

public class DeletePersonByAdhaarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdhaarPersonDao dao = new AdhaarPersonDao();
		
		dao.deletePersonByAdhaarNumber(90845452);

	}

}
