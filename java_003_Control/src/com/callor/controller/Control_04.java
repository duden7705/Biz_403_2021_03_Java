package com.callor.controller;

public class Control_04 {
	
	public static void main(String[] args) {
	
		int intNum = 0;
	
		for(int index = 0; index < 10 ; index++) {
			// for() 반복문이 실행되는 동안에
			// 		intNum qustnsms todtjdrhk thaufdmf qksqhrghlttnakszma
			// 		실행한다
			// 		과거에는 이러한 문제가 이슈가 되었던 적도
			// 		있다.
			// int intNum = 0;
			int intdex = index + 1;
			System.out.println(intNum); // i + 1 
		}
		
		
		int intSum = 0;
		// index는 for() 반복문에 의해서 0 ~ 9 까지 변한다
		//		index++ 명령문에 의해서 index가 변한다
		for(int index =0 ; index <10 ; index++) {
			
			// 0 ~ 9까지의 값이 index에 저장된 상태로
			// 명령이 실행된다.
			// intNum에는 index값에 1을 더한값이 저장된다
			// 결국 intNum는 0 ~ 9 까지 값이 하나씩 저장된다
			// 		index ++
			// 		intNum = index + 1
			intNum = index + 1;
			
			// intSum = intSum + intNum;
			intSum += intNum;
		}
		
		intSum = 0;
		for(int i =0 ; i < 10; i++) {
			int n = i + 1;
			intSum += n;
		}
		System.out.println(intSum); 
		
		intSum = 0;
		for(int index = 0 ; index < 10 ; index +=2) {
			int nun = index + 1;
			
		
			
		
		for(int index = 0; index < 10 ; index += 2) {
			System.out.println(index);
		
	}

	
