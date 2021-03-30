package com.callor.classes;

import java.util.Arrays;

/*
 * Random 클래스를 이용하여 50 ~ 100 까지 중 "난수 1개"를 생성합니다.
 * 2 ~ (난수 - 1)까지 수 중에서 생성된 난수의 약수들을 찾아 배열에 저장합니다
 * *난수의 약수 = 난수 % i == 0 인 i 값
 * 배열에 저장된 리스트를 출력합니다.
 * 
 * "약수를 몇개인지 찾아보고" 큰 값으로 배열 만들어라(선언)
 * 랜덤 수만큼... (비효율적) Java.. 
 */ 

import java.util.Random;

public class Class_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNum = new int[20];
		int intSum = 0;
		
		// i값이 0에서 시작하여 1씩 증가하면서 100미만인경우
		// {} 명령들을 실행하라
		// i값은 0 ~ 99 (100 -1)
		
		System.out.println("생성된 난수 :" + intNum);
		
		int nCount = 0;
		for(int i = 2; i < intNum; i++) {
			intNum[i] = rnd.nextInt(51) + 50;
			if(intNum[i] % i == 0) {
				nCount++;
				
			}
			
			System.out.println("약수의 개수 :" + nCount);
			int[] divisor = new int[nCount];
			
			for(int i = 2 ; i < intNum ; i ++) {
				if(intNum % i == 0) {
					divisor[i] = i;
					divisor[index++] = i;
				}
			}
			
			System.out.println (Arrays.toString(divisor));
		}
		
		
	}

}
