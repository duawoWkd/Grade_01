package com.biz.controller;

import com.biz.service.ScoreService_01;

public class ScoreExec_09 {

	public static void main(String[] args) {

		ScoreService_01 ss = new ScoreService_01();
		
		for(int i = 0; i < 3; i++) {
			try {
				if (!ss.intputScore(i)) break; // if문에 영향을받는 부분이 한줄만나올때 중괄호를 안써도 된다.	
			} catch (Exception e) {
				System.out.println("점수 입력 오류!!!");
				System.out.println((i+1) + "번째 다시 입력");
				i--;
				continue;
			}
			
		}
		ss.makeTotall();
		ss.viewScore();
		ss.makeRank();
		
	}

}
