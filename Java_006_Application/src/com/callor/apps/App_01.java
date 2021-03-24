package com.callor.apps;

import java.util.Random;

/*
 * 정수형 배열20개를 선언합니다.
 * Random 클래스를 사용하여 1 ~ 100까지 난 수를 생성하여 배열에 저장합니다.
 * 배열에 저장된 정수 중 짝수들의 리스트를 출력하고 짝수들의 합을 계산하여 출력합니다.
 */

public class App_01 {
	
	/*
	 * { } 내에 있는 코드는 최소화 하자
	 * 작은 일들로 분해하기
	 * 
	 * 나누어서 정복하라 : Divide and Conquer
	 */
	
	
	public static void main(String[] args) {
		
		/*
		 * 배열의 크기를 변수에 설정해 두고
		 * 코드내에서 공통으로 사용하기 
		 */
		
		int numsLength = 20;
		
		int[] nums = new int[20];
		int intSum = 0;
		Random rnd = new Random();
		
		for(int i = 0 ; i < 20 ; i++) {
			
			// 먼저 선언되어 있는 
			// 배열에 값을 저장하기
			nums[i] = rnd.nextInt(100) + 1;
		}
		
		for(int i =0 ; i < 20 ; i++) {
			
			// 배열에 저장된 값을 릭기
			// 읽은 값이 짝수인가 검사
			if(nums[i] % 2 == 0) {
				// 짝수이면 출력
				System.out.println(nums[i]);
				
			}
		}
		// intSum에 이전 코드에서 어떤 값이 저장되어
		// 있을지도 모르기때문에 clear하고 시작
		intSum = 0;
		for(int i = 0 ; i <20; i++) {
			if(nums[i] % 2 == 0) {
				// 짝수이면 intSum에 합산(누적)하라
				intSum += nums[i];
				
			}
			
		}
		System.out.println("==================");
		System.out.printf("짝수들의 합 : %d\n",intSum);
		
	}

}
