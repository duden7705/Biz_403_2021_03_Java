package com.callor.controller;

public class Varriable_01 {
	
	public static void main(String[] args) {
		
		int intNum = 4;
		System.out.println(intNum % 2);
		System.out.println(intNum % 2 ==0);
		System.out.println(intNum % 2 == 0 ? "0" : "0아님");
		
		
		int intResult = intNum % 2;
		boolean byes = (intNum % 2) == 0;
		Boolean byes1 =3 == 3;
		
		/*
		 * 블린값(형)
		 * true, fales : 키워드이면서 하나의 값
		 * 값 : 연산된 결과
		 */
		boolean byes2 = true;
		byes2 = false;
		
		// 비교 연산자
		// 어떤 값들이 같은지, 크기가 어떠한지를
		// 판단하는 연산
		// 결과는 true, false가 있다
		byes = 3 > 3; // false
		byes = 3>= 3; // true
		byes = 3 < 3; // false
		byes = 3 <= 3; // true
		byes =3 == 3; // true
		
		byes = false;
		
		// 어떤 조건이 true일때만 코드를 실행하고 싶을때
		// byes에 담긴 값이 true이냐?
		if( byes ) {
			// byes에 담긴 값이 true일때 실행할 코드들
			System.out.println("byes 는 true");
		
	}
	}
}
