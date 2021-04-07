package com.callor.method.service;

/*
 * inputScore() method를 선언하고
 * InputServiceV2 클래스를 사용하여
 * 국어, 영어, 수학, 점수를 입력 받고
 * 각각 intKor, intEng, intMath 변수에 저장
 * 각 점수는 0 ~ 100 점 범위 내에서 입력
 * 입력 받은 3 과목의 총점과 평균을 계산하여 출력
 */
public class ScoreServiceV3 {

	InputServiceV2 inService;
	
	public ScoreServiceV3() {		
		inService = new InputServiceV2();
		
	}
	public void inputScore() {
		int intKor = inService.inputValue("국어",0,100);
		int intEng = inService.inputValue("영어",0,100);
		int intMath = inService.inputValue("수학",0,100);
		int intSum = intKor + intEng + intMath;
		float floatAvg = intSum /3;
		
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + floatAvg);		
	}
}
