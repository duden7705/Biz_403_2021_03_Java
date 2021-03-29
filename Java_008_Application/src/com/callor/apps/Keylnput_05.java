package com.callor.apps;

/*
 * 키보드를 통해서 정수를 1개 입력 받습니다.
 * 입력한 정수가 짝수인가 판별하여 출력합니다.
 * 입력한 정수가 Prime(소수)인지 판별하여 출력합니다
 */

import java.util.Scanner;

public class Keylnput_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("=============================");
		System.out.println("정수 1개를 입력하세요");
		System.out.print(">>");
		num = scan.nextInt();
		System.out.println("==============================");
		if(num % 2 == 0) {
			System.out.printf("입력한 정수 %d는 짝수가 아닙니다", num);
		} else {
			System.out.printf("입력한 정수 %d는 짝수 입니다 ", num);
		
		}
		for(int i = 2 ; i < num ; i++) {
			if(num % 2 == 0) {
				System.out.println(num + "은 소수가 아님");				
			} else {
				System.out.println(num + "은 소수");
				break;
			}
		}
	}

}
