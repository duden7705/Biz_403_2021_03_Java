package com.callor.apps;

import java.util.Scanner;

public class Keylnput_003 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("정수1");
		System.out.print("정수1 >> ");
		int num1 = scan.nextInt();
		System.out.println("======================");
		System.out.println("정수2");
		System.out.print("정수2 >> ");
		int num2 = scan.nextInt();
		System.out.println("=======================");
		
		System.out.printf("%d + %d = %d\n", num1,num2, num1+num2);
		System.out.printf("%d * %d = %d\n", num1,num2, num1*num2);
		System.out.printf("%d - %d = %d\n", num1,num2, num1-num2);
		System.out.printf("%d / %d = %d\n", num1,num2, num1/num2);
		System.out.println("=======================");
		
		
	}

}
