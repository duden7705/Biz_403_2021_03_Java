package com.callor.apps.service;

import java.util.Random;

public class ScoreService_02 {
	
	public static void main(String[] args) {
		
		Random rnd;
		int[] intKor;
		int[] intEng;
		int[] intMath;
		
		// 배열과, 인스턴스변수를 생성하는 method
		public void intValue() {
			
			// Random 클래스를 사용하여
			// rnd 인스턴스(변수) 생성
			rnd = new Random();
			
			intKor = new int[10];
			intEng = new int [ intKor.length];
			intMath = new int[intKor.length];
			
		}
		
		// Random 클래스를 사용하여 점수 생성후 
		// 배열에 저장하는 method
		
		// Random  클래스를 사용하여 생성된 rnd 인스턴스변수의
		// nextInt() method를 호출하여 1 ~ 100 까지 난수를 만들고
		// 각각 점수 배열에 저장하기
		public void makeScore() {
			for(int i = 0 ; i < intKor.length ; i++) {
				intKor[i] = rnd.nextInt(100) +1;
				intEng[i] = rnd.nextInt(100) +1;
				intMath[i] = rnd.nextInt(100) +1;
			}
		}
		
		public void printScore() {
			
			System.out.println("=============================");
			System.out.println("국어\t영어\t수학");
			System.out.println("----------------------------");
			for(int i = 0 ; i < intKor.length ; i++) {
				System.out.printf("%3d\t%3d\t%3d\n", intKor[i],intEng[i],intMath[i]);
			}
			System.out.println("==================================");
		}
		
		
	}

}
