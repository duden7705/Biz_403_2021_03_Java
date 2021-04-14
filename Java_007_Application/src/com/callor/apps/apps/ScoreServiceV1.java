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
		
			for(int i = 0 ; i < 10 ; i++) {
				intKor[i] = rnd.nextInt(100) + 1 ;
				intEng[i] = rnd.nextInt(100) + 1 ;
				intMath[i] = rnd.nextInt(100) + 1 ;
			
				System.out.printf("%d\t%d\t%d\n",i+1,intKor[i],intEng[i],intMath[i]);
			}
			
		}

	public void makeScore() {
		// TODO Auto-generated method stub
		
	}

}
