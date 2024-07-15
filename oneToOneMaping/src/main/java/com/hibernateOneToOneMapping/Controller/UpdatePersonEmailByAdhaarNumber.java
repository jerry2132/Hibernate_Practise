package com.hibernateOneToOneMapping.Controller;

import com.hibernateOneToOneMapping.dao.AdhaarPersonDao;

public class UpdatePersonEmailByAdhaarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdhaarPersonDao dao = new AdhaarPersonDao();
		
		System.out.println(dao.updatePersonEmailByAdhaarNumber(90084542, "sumit@ghon"));

	}

}
