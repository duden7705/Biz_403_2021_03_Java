package com.callor.apps;

import java.util.Scanner;

/* 정수형 배열 5개를 생성 O
 * 키보드를 통해서 정수 5개를 입력 받아 배열에 저장
 * 배열에 입력된 정수들의 리스트와 합을 계산하여 출력
 * 입력Prompt와 출력 문의 UI를 만들어서 출력
 * 
 */

public class Keylnput_04 {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		int intSum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("5개의 정수를 입력합니다");
		for(int i = 0; i < nums.length ; i++) {
			int num = i +1;
			System.out.printf("정수 %d번 >>",num);
		}
		
		System.out.printf("정수 >> ");
		int num1 = scan.nextInt();
		System.out.println("정수2");
		System.out.print("정수 >> ");
		int num2 = scan.nextInt();
		System.out.println("정수3");
		System.out.print("정수 >> ");
		int num3 = scan.nextInt();
		System.out.println("정수4");
		System.out.print("정수 >> ");
		int num4 = scan.nextInt();
		System.out.println("정수5");
		System.out.print("정수 >>");
		int num5 = scan.nextInt();
		
		System.out.println("정수들의 합 :" + intSum);
		
		
	}

}
