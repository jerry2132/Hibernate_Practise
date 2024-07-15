package com.hibernateOneToOneMapping.Controller;

import com.hibernateOneToOneMapping.dao.AdhaarPersonDao;

public class SetFatherNameByPersonId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdhaarPersonDao dao = new AdhaarPersonDao();
		
		System.out.println(dao.updateFatherNameByPersonId(106, "boman"));

	}

}
