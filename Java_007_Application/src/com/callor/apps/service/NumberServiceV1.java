package com.callor.apps.service;

import java.util.Scanner;

import com.callor.apps.LinesService;

public class NumberServiceV1 {
	
	int intNum = 0; 
	Scanner scan;
	public void inputNum() {
		scan = new Scanner(System.in);
		
		
		System.out.println("정수 1개를 입력합니다");
		System.out.println(">>");
		intNum = scan.nextInt();
		
		// main() method가 아닌 곳에서
		// Scanner 사용하는 경우
		// 사용이 끝나면 close()를 하자
		// 이제는 Scanner 사용이 끝났으니
		// Resource(자원)을 반납하겠다
		
	}
	
	public void checkEver() {
		
		System.out.println(LinesService.dLines(50));
		if(intNum % 2 == 0) {
			System.out.printf("입력한 정수 %d는 짝수\n",intNum);
		} else {
			System.out.printf("입력한 정수 %d는 짝수가 아님\n",intNum);
		}
	}
	
	public void chekPrime() {
		System.out.println(LinesService.dLines(50));
		int num = 0;
		for(num = 2 ; num < intNum ; num++) {
			if(intNum % num == 0) {
				break;
			}
		}
		if(num < intNum) {
			System.out.printf("입력한 정수 %d는 소수가 아님\n",intNum);
		} else {
			System.out.printf("입력한 정수 %d는 소수\n",intNum);
		}
	}
	

}
