package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.StudentVO;

public class StudentService {
	
	List<StudentVO> stdList;
	Scanner scan;
	
	public StudentService() {
		stdList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
	}
	
	// 키보드에서 학생정보를 입력받아서 stdList에 추가
	public boolean inputStudent(int number) {
		number ++;
		System.out.print( " 학번 ");
		String strNum = scan.nextLine();
		
		System.out.print( " 이름(영문입력)");
		String strName = scan.nextLine();
		
		System.out.print( " 학년 ");
		String strGrade = scan.nextLine();
		int grade = Integer.valueOf(strGrade);
		
		System.out.print( " 주소 ");
		String strAddr = scan.nextLine();
		
		System.out.print( " 전화번호 ");
		String strTel = scan.nextLine();

		
		StudentVO stvo = new StudentVO( strNum,strName,grade,strAddr,strTel);
		System.out.println(stvo.toString());
		stdList.add(stvo);
		return true;
		
	}
	
	
	// stdList에 담긴 학생정보를 Console에 보이기
	public void viewStudents() {
		
		System.out.println("빅데이터반 학생 정보");
		System.out.println("=================================================");
		System.out.println("학번\t이름\t학년\t주소\t번호");
		System.out.println("-------------------------------------------------");
		for(StudentVO stvo : stdList) {
			System.out.println(stvo.getNumber() );
			System.out.println(stvo.getName()  );
			System.out.println(stvo.getGrade()  );
			System.out.println(stvo.getAdd());
			System.out.println(stvo.getTel());
		}
		System.out.println("==================================================");
	}

}
