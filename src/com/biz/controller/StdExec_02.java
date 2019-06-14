package com.biz.controller;

import com.biz.model.StudentVO;

public class StdExec_02 {

	public static void main(String[] args) {

		StudentVO[] stdArray = new StudentVO[5];
		
		stdArray[0] = new StudentVO();
		stdArray[0].setNumber("1");
		stdArray[0].setName("홍길동");
		stdArray[0].setGrade(3);
		stdArray[0].setAdd("서울시");
		stdArray[0].setTel("001");
		
		StudentVO stdVO = new StudentVO();
		stdVO.setNumber("2");
		stdVO.setName("성춘향");
		stdVO.setGrade(4);
		stdVO.setAdd("남원시");
		stdVO.setTel("002");
		stdArray[1] = stdVO;
		
		stdVO = new StudentVO();
		stdVO.setNumber("3");
		stdVO.setName("이몽룡");
		stdVO.setGrade(1);
		stdVO.setAdd("서울");
		stdVO.setTel("003");
		stdArray[2] = stdVO;
		
		for(StudentVO vo : stdArray) {						// :기준 오른쪽은 배열이거나 리스트이거나 
			System.out.println(vo.toString());				// 
		}
		
		
	}

}
