package com.callor.apps;

import java.util.Random;

/*
 * 정수형 배열 20개를 선언합니다
 * Random 클래스를 사용하여 1 ~ 100까지 난 수를 생성하여 배열에 저장합니다.
 * 배열에 저장된 정수 중 짝수들이 몇번위(첨자)에 저장되어 있는지 리스트를 출력합니다
 */

public class App_03 {
	
	public static void main(String[] args) {
		
		int numsLength = 20;
		int[] intNum = new int[numsLength];
		Random rnd = new Random();
		
		for(int i = 0; i < numsLength; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}
		// 요소 : 배열의 몇번쨰 값
		// 위치 : 배열의 몇번쨰
		// 첨자 : 배열의 몇번쨰 인가를 알려주는 값
		for (int i = 0; i < numsLength; i++) {
			if(intNum[i] % 2 == 0) {
				System.out.printf("%3d번째 값은 짝수 %3d 입니다 \n", i+1, intNum[i]);
				
				// 짝수인 값을 출력
				// System.out.println(intNum[i]);
				
				// 몇번째 위치(요소, 첨자)에 저장되어 있나?
				
			}
		}
		
		
		
	}

}
