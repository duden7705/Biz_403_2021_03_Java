package com.callor.method.service;

import java.util.Scanner;

public class InputNumberV1 {
	
	public void inputValus(String title) {
		Scanner scn = new Scanner(System.in);
		System.out.println(title + "값을 입력하세요");
		String strNum = scn.nextLine();
		if(strNum.eqals("QUIT")) {
			
		}
		
	}

}
