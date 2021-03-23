package com.callor.controller;

public class Controller_01 {
	
	public static void main(String[] args) {
			
	
		
		int intSum3 = 0;
		
		for (int i = 0; i < 101; i++) {
			if( i % 3 == 0) {
				intSum3 += i;				

	}

}
			/*
			 * 3의 배수이면서 5의 배수
			 * num % 3 == . AND num % 5 ==
			 */
		int intSum4 = 0;
		for (int i =0; i < 101; i++) {
			if( i% 4 == 0) {
				intSum4 += i;
			}
		}
		int intSum35 = 0;
		for (int i = 0; i <101; i++ ) {
			if(i % 3 == 0 && i % 5 ==0) {
				intSum35 += i;				
				
				/*
				 * 여기에서 else if를 사용하면
				 * 3의 배수이면서 4의 배수인 경우
				 * 3의 배수에는 합산(누적)이되지만
				 * 4의 배수에는 누락이 된다.
				 */
		}

	}
		System.out.println("===============================");
		System.out.println("3의 배수의 합 : " + intSum3) ;
		System.out.println("4의 배수의 합 : " + intSum4) ;
		System.out.println("3과 5의 배수의 합: " + intSum35) ;
		System.out.println("=================================");
		
}
}
		