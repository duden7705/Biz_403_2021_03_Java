package com.callor.controller;

import java.util.Random;

public class Controller_14 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		
		/*
		 * intSum 변수를 어디에 선언할까?
		 * 짝수들을 어디에서 합산(누적)할까
		 * 어디에서 출력을 할까
		 */
		
		int intKor = rnd.nextInt(100)+1;
		int intEng = rnd.nextInt(100)+1;
		int intMath = rnd.nextInt(100)+1;
		int intSum = intKor + intEng + intMath;
		int intAvg = intSum / 3;
		
		System.out.println("국어 :" + intKor);
		System.out.println("영어 :" + intEng);
		System.out.println("수학 :" + intMath);
		System.out.printf("총점 %d : , 평균 %d\n", intSum, intAvg);
				
	}

}
