package com.callor.apps;

import java.util.Scanner;

public class Keylnput_06 {
	
	public static void main(String[] args) {
		
		NumberServiceV1 nsV1 = new NumberServiceV1();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(LinesService.dLines(50));
			System.out.println("넘버 체크!!");
			System.out.println(LinesService.sLines(50));
			nsV1.inputNum();
			nsV1.checkEver();
			nsV1.check
			
			System.out.println(LinesService.dLines(50));
			System.out.printf("계속할까요? (Yes:1, No:0");
			int yesNo = scan.nextInt();
			if(yesNo == 0) {
				break;
			}
		}
		System.out.println("Game Over!!");
		
	}

}
