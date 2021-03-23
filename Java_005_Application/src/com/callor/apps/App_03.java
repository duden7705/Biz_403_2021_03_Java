package com.callor.apps;

/*
 *  1. 정수형 배열 intScores를 10개 선언(생성)
 *  Random 클래스를 사용하요 50 ~ 100까지 정수를 만들어
 *  intScores 각 배열에 저장
 *  intScores 배열에 저장된 점수를 이용하여
 *  전체총첨, 평균을 계산한 후 출력
 */


import java.util.Random;

public class App_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intScores = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			intScores[i] = rnd.nextInt(51) + 50;
		}
		
		int intTotal = 0;
		float floatAvg = 0;
		
		for(int i = 0 ; i < 10 ; i ++) {
			
			intTotal += intScores[i];
			
		}
		// 평균은 전체 총점을 계산 한 후에
		// 한번만 계싼을 수행하면 된다
		// 평균을 총점과 같이 for() 반복문에서
		// 계산할 필요는 없다.
		floatAvg = (float) intTotal / 10;
		
		System.out.println("==========================================");
		System.out.printf("총점 : %d, 평균 : %3.2f", intTotal, floatAvg);
		System.out.println("==========================================");
		
				
	}

}
