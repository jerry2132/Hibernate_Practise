package com.hibernateOneToOneMapping.Controller;

import com.hibernateOneToOneMapping.dao.AdhaarPersonDao;
import com.hibernateOneToOneMapping.dto.Adhaar;

public class GetAdhaarPersonByAdhaarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdhaarPersonDao dao  = new AdhaarPersonDao();
		
		Adhaar adhaar = dao.getAdhaarPersonByAdhaarNumber(908425);
		
		System.out.println(adhaar);
		System.out.println(adhaar.getPerson());
	}

}
