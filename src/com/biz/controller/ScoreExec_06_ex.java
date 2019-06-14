package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_06_ex {

	public static void main(String[] args) {

		/* 
		 * ScoreVO를 이용해서 List를 생성하고
		 * 5명 학생의 3과목 성적을
		 * 키보드로 입력받아 List에 추가하고
		 * 총점과 평균을 구하시오
		 */
		
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; i <5; i++) {
			
			System.out.print((i+1) + "번 학생 국어 성적>>");
			String strKor = scan.nextLine();
			int intKor = Integer.valueOf(strKor);

			System.out.print((i+1) + "번 학생 영어 성적>>");
			String strEng = scan.nextLine();
			int intEng = Integer.valueOf(strEng);

			System.out.print((i+1) + "번 학생 국어 성적>>");
			String strMath = scan.nextLine();
			int intMath = Integer.valueOf(strMath);
			
		// 1번방법
			ScoreVO vo = new ScoreVO();  // 생성
			vo.setNumber("" + (i+1) );   // 학번
			vo.setKor(intKor);
			vo.setEng(intEng);
			vo.setMath(intMath);
			
			scList.add(vo);					// 저장
			
		// 2번방법
		//	vo = new ScoreVO(""+ (i+1),intKor,intEng,intMath);
		//	scList.add(vo);
		
		// 3번방법
		//	scList.add(new ScoreVO("" + (i+1),intKor,intEng,intMath));
		//	System.out.println(scList.get(i).toString());
		}
		for(ScoreVO vo : scList) {
			System.out.println(vo.toString());
		
		}
		

	
	
			
			
			
		
		
		
		
		
		
	}

}
