package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_06 {

	public static void main(String[] args) {

		/* 
		 * ScoreVO를 이용해서 List를 생성하고
		 * 5명 학생의 3과목 성적을
		 * 키보드로 입력받아 List에 추가하고
		 * 총점과 평균을 구하시오
		 */
		
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);
		
		int scLen = scList.size();
	
		for(int i = 0; i <5; i++) {
			
			System.out.print("국어 성적입력");
			String s1 = scan.nextLine();
			int ints1 = Integer.valueOf(s1);
			
			System.out.print("영어 성적입력");
			String s2 = scan.nextLine();
			int ints2 = Integer.valueOf(s2);

			System.out.print("수학 성적입력");
			String s3 = scan.nextLine();
			int ints3 = Integer.valueOf(s3);
		}
		

	
	
			
			
			
		
		
		
		
		
		
	}

}
