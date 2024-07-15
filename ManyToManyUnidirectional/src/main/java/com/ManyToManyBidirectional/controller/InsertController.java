package com.ManyToManyBidirectional.controller;

import java.time.LocalDate;

import com.ManyToManyBidirectional.dao.*;
import com.ManyToManyBidirectional.enity.*;

import java.util.*;
public class InsertController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubjectAndStudentDao dao = new SubjectAndStudentDao();
		List<Student> lt = new ArrayList<>();
		
		List<Subject> sb = new ArrayList<>();
		
		

		sb.add(new Subject(123,"Java","James",LocalDate.parse("2000-02-03"),200,null));
		sb.add(new Subject(124,"python","James89",LocalDate.parse("2000-02-03"),200,null));
		
		
		lt.add(new Student(106,"Ahsish","hdhd",594520,sb));
		lt.add(new Student(107,"naman","hdhuihdbd",59454120,sb));
		lt.add(new Student(108,"shubham","hddashd",59420,sb));
		lt.add(new Student(109,"rahul","hdhdadd",594445120,sb));
		lt.add(new Student(110,"tju","hddavca",594440,sb));
		
//		lt.add(new Student(110,"tju","hddavca",594440,sb));
//		lt.add(new Student(111,"tju","hddavca",594440,sb));
//		lt.add(new Student(112,"tju","hddavca",594440,sb));
//		
		
		
		System.out.println(dao.insertStudentandSubject(lt));
	
		
	}

}
