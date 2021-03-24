package com.callor.apps;

import java.util.Arrays;
import java.util.Random;

public class App_11 {
	
	public static void main(String[] args) {
		// main() method의 맴버변수
		// method 변수
		
		//정수배열 45개 선언
		int[] intNums = new int[45];
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = i +1;
		}
		
		//Random 클래스를 사용하여
		// 0 ~ 44까지 
		
		Random rnd = new Random();
		for(int i = 0 ; i < 1000 ; i++) {
			int index1 = rnd.nextInt(intNums.length);
			int index2 = rnd.nextInt(intNums.length);
			
			int temp = intNums[index1];
			intNums[index1] = intNums[index2];
			intNums[index2] = temp;
		}
		System.out.println(Arrays.toString(intNums));
		System.out.println("==========================");
		
		for(int i = 0 ; i < 6 ; i++) {
			System.out.print(intNums[i] + "\t");
		}
	}

}
