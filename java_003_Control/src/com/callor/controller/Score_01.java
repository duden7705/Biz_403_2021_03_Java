package com.callor.controller;

public class Score_01 {
	
	public static void main(String[] args) {
		
		int intKor = 80;
		int intEng = 77;
		int intMath = 65;
		
		String strKor = "국어";
		String strEng = "영어";
		String strMath = "수학";
		
		int intSum = intKor +intEng + intMath;
		int inAvg = intSum / 3;
		
		System.out.println("==========================");
		System.out.println("국어 : " + intKor  );
		System.out.println("영어 : " + intEng  );
		System.out.println("수학 : " + intMath  );
		System.out.println("-----------------------");
		
		System.out.println("총점:" + intSum+ " 평균 :" + inAvg );
		System.out.println("========================");
		
		/*
		 * printf() 사용하여 출력할때
		 * %d : 정수(십진수)
		 * 		%3d : 자릿수를 3개로 맞추고
		 * 		값을 오른쪽정렬
		 * %f : 실수(float)
		 * 		%3.2f : 소수점이하 2째자리까지 표시
		 * %s : 문자열
		 * 
		 * \n : Enter를 누른것 처럼 줄바꿈을 실행
		 * \t : Tab 키를 누른것 처럼 사이띄기를
		 * 		일정하게 맞추어라
		 */
	}

}
