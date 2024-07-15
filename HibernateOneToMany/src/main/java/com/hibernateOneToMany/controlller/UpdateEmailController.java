package com.hibernateOneToMany.controlller;

import com.hibernateOneToMany.dao.*;
public class UpdateEmailController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TrainerDao dao = new TrainerDao();
		
		if(dao.updateEmailofStudentByStudentId(101, "summmmmmmmmiiit@"))
			System.out.println("updated");
		else
			System.out.println("error");
	}

}
