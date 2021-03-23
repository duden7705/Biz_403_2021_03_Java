package com.callor.apps;

import java.util.Random;

/*
 * 5명 학생의 성적을 계산합니다
 * 과목은 국어(intKor), 영어(intEng), 수학(intMath)이며
 * 과목의 점수는 Random 클래스르ㅡㄹ 사용하여 50 ~ 100까지 생성하여 사용합니다
 * 학생의 성적리스트를 출력 합니다
 * ============================
 * 학번	국어	영어	수학	총첨	평균
 * --------------------------------------
 * 1	90		90 		90  	270		90.00
 * 
 * =======================================
 */

public class App_05 {
	
	public static void main(String[] args) {
		
		
		
		Random rnd = new Random();
		// 과목3가지를 학생수 만큼 배열을 선언
		int[] intKors = new int[5];
		int[] intEngs = new int[5];
		int[] intMaths = new int[5];
		
		// 가상의 점수를 생성하기
		for(int i = 0 ; i < 5; i++) {
			intKors[i] = rnd.nextInt(51) +50 ;
			intEngs[i] = rnd.nextInt(51) +50 ;
			intMaths[i] = rnd.nextInt(51) +50 ;
		
			// 학생별로 총점과 평균을 계산하여
			// 저장해 두기
			int[] intTotal = new int[5];
			float[] floatAvg = new float[5];
			
			for (int i = 0; i < 3; i++) {
				
				intTotal[i] = intKors[i];
				intTotal[i] = intEngs[i];
				intTotal[i] = intMaths[i];
				floatAvg[i] = (float)intTotal[i] / 3;
			}
			
			int intKorTotal = 0;
			int intEngTotal = 0;
			int intMathTotal = 0;
			
			int intAllTotal = 0;
			
			//리스트 출력하기
			System.out.println("==================================");
			System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
			System.out.println("----------------------------------");
			for(int i = 0 ; i < 5 ;i++) {
				System.out.print((i+1) + "\t");
				System.out.print(intKors[i] + "\t");
				System.out.print(intEngs[i] + "\t");
				System.out.print(intMaths[i] + "\t");
				
				System.out.print(intTotal[i] + "\t");
				System.out.printf("%3.2f" ,floatAvg[i]);
				
				intKorTotal += intKors[i];
				intEngTotal += intEngs[i];
				intMathTotal += intMaths[i];
				intAllTotal += intTotal[i];
				
				System.out.printf("총점\t%d\t%d\t%d\t%d\n", intKorTotal, intEngTotal, intMathTotal);
			
			}
						
		}
		
	}

}
 