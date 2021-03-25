package com.callor.apps.apps;

/*
 * 정수형 배열 100개를 선언
 * 1 ~ 100까지의 난 수를 만들어 정수형 배열에 저장
 * 배열에 저장된 수들 중에서 짝수들 리스트를 출력
 * 짝수들의 합을 구하여 출력
 * EvenServiceV1 클래스에 method를 선언하여 코드 작성
 * App_05dml main() 메서드에서 객체생성, method호출하여 실행
 */

public class App_05 {
	
	public class EvenServiceV1 {
		
		int[] intNum;
		public EvenServiceV1() {
			intNum = new int[100];
		
			public void makeNums() {
				Random rnd = new Random();
				for(int i = 0; i < intNum.length; i++) {
				intNum[i] = rnd.nextInt(100) + 1;	
				}	 
			publlic void evenNums() {
				for(int i = 0; i < intNum.length; i++) {
					if(intSum[i] % 2 == 0) {
						System.out.println(intNum[i] + "는 짝수");
					}
				}
			}										
	}

}
