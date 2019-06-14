package com.biz.controller;


import com.biz.service.StudentService_ex;

public class StdExec_05 {

	public static void main(String[] args) {
		
		StudentService_ex stdSvr = new StudentService_ex();
		
		for(int i = 0; i < 1; i++) {
		stdSvr.inputStudent(i);
	}
		stdSvr.viewStudents();
	}

}
