package com.callor.apps;

import java.util.Arrays;
import java.util.Random;

public class App_10 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[10];
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100);
		}
		
		// for() 등을 사용하지 않고
		// 배열 요소를 나열하는 문자열 만들기
		// Debuging 코드
		// 코드가 진행되는 동안에
		// 변수, 배열등에 저장된 값을 확인하고 싶을떄
		// 사용하는 코드
		String strView = Arrays.toString(intNums);		
		System.out.println(strView);
		
		System.out.println(Arrays.toString(intNums));
		
		
	}

}
