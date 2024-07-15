package com.ManyToManyBidirectional.controller;
import com.ManyToManyBidirectional.dao.*;

public class DeletePhoneByStudentId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubjectAndStudentDao dao = new SubjectAndStudentDao();
		
		System.out.println(dao.deletePhoneNumberById(102));
	}

}
