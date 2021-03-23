package com.callor.controller;
/*
 * 1. 학생 10명의 국어 점수를 정할 변수 선언
 * 2. 1 ~100까지 범위의 임의 점수를 생성하여 변수에 저장
 * 3. 총점과 평균을 계산하여 출력하라
 * =================================
 * 학생1 :
 * 학생2 :
 * --------------------------------
 * 총점 :               평균 :
 * ================================
 */

import java.util.Random;

public class Controller_15 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
			
			int intKor1 = 0;
			int intKor2 = 0;
			int intKor3 = 0;
			int intKor4 = 0;
			int intKor5 = 0;
			int intKor6 = 0;
			int intKor7 = 0;
			int intKor8 = 0;
			int intKor9 = 0;
			int intKor10 = 0;
			
			/*
			 * num 변수하고
			 * intKor 이름하고 합하여
			 * 		intKor1 ~ intKor5 처럼
			 * 		만들수 있을거 같은데 안된다
			 * intKornum 이라고 작성하면 java는
			 * intKornum라는 변수를 찾으려고 시도한다
			 */
			// intKornum = rnd.nextInt(100)
			intKor1 = rnd.nextInt(100)+1;
			intKor2 = rnd.nextInt(100)+1;
			intKor3 = rnd.nextInt(100)+1;
			intKor4 = rnd.nextInt(100)+1;
			intKor5 = rnd.nextInt(100)+1;
			intKor6 = rnd.nextInt(100)+1;
			intKor7 = rnd.nextInt(100)+1;
			intKor8 = rnd.nextInt(100)+1;
			intKor9 = rnd.nextInt(100)+1;
			intKor10 = rnd.nextInt(100)+1;
			
			int intSum = 0;
			float floatAvg = (float)intSum / 3;
			
			
			System.out.printf("학생1 : %d\n", intKor1);
			System.out.printf("학생2 : %d\n", intKor2);
			System.out.printf("학생3 : %d\n", intKor3);
			System.out.printf("학생4 : %d\n", intKor4);
			System.out.printf("학생5 : %d\n", intKor5);
			System.out.printf("학생6 : %d\n", intKor6);
			System.out.printf("학생7 : %d\n", intKor7);
			System.out.printf("학생8 : %d\n", intKor8);
			System.out.printf("학생9 : %d\n", intKor9);
			System.out.printf("학생10 : %d\n", intKor10);
			System.out.printf("총점 : %d 평균 : %3.2f\n",intSum,floatAvg);
		}
	

}
