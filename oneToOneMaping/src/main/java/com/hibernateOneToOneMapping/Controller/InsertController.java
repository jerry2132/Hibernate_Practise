package com.hibernateOneToOneMapping.Controller;

import java.time.LocalDate;

import com.hibernateOneToOneMapping.dao.*;
import com.hibernateOneToOneMapping.dto.*;

public class InsertController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdhaarPersonDao dao = new AdhaarPersonDao();
		
	
		
		Person p = new Person(102,"hjds","bjsbdh",84655152,null);
		Adhaar ad = new Adhaar(908425,LocalDate.parse("1986-02-03"),"bhghvar","njshduh",null);
		
		
		dao.savePersonDao(p,ad);
	}

}
