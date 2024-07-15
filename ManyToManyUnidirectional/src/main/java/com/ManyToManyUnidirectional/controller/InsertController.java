package com.ManyToManyUnidirectional.controller;

import java.time.LocalDate;
import com.ManyToManyUnidirectional.dao.*;
import java.util.*;
import com.ManyToManyUnidirectional.enity.*;
public class InsertController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubjectAndStudentDao dao = new SubjectAndStudentDao();
		List<Student> lt = new ArrayList<>();
		
		List<Subject> sb = new ArrayList<>();
		
		sb.add(new Subject(123,"Java","James",LocalDate.parse("2000-02-03"),200));
		sb.add(new Subject(124,"python","James89",LocalDate.parse("2000-02-03"),200));
		
		
		
		
		lt.add(new Student(101,"Ahsish","hdhd",594520,sb));
		lt.add(new Student(102,"naman","hdhuihdbd",59454120,sb));
		lt.add(new Student(103,"shubham","hddashd",59420,sb));
		lt.add(new Student(104,"rahul","hdhdadd",594445120,sb));
		lt.add(new Student(105,"tju","hddavca",594440,sb));
		
		System.out.println(dao.insertStudentandSubject(lt));
		
	}

}
