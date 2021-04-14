package com.callor.apps;

import java.util.Random;

public class App_01A {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[20];
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}
		
		for(int arr = 0 ; arr < intNums.length ; arr++) {
			
			int num = 0;
			int nump = intNums[arr];
			for(num = 2 ; num < nump; num++) {
				if(nump % num == 0) {
					break;
				}
				
			}
			if(num < nump) {
				System.out.println(nump + "는 소수가 아님");
			} else {
				System.out.println(num + "는 소수임");
			}
		}
	}

}
