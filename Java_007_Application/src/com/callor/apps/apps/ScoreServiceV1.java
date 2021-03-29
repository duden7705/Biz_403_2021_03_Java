package com.callor.apps.apps;

import java.util.Random;

public class ScoreServiceV1 {
	
	public ScoreServiceV1() {
		
		int[] intNums;
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];
		
		int[] intTotal;
		int[] intAvg;
		
		
		Random rnd = new Random();		
		public ScoreServiceV1() {
			for(int i = 0 ; i < 10 ; i++) {
				intKor[i] = rnd.nextInt(100) + 1 ;
				intEng[i] = rnd.nextInt(100) + 1 ;
				intMath[i] = rnd.nextInt(100) + 1 ;
				intSum[i] = intKor[i];
				intSum[i] = intEng[i];
				intSum[i] = intMath[i];
				System.out.printf("%d\t%d\t%d\n",i+1,intKor[i],intEng[i],intMath[i]);
			}
			
		}
		System.out.println("----------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점");
		System.out.println("----------------------------");
		for(int i = o ; i < intKor.length ; i++) {
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
		}
	}

}
