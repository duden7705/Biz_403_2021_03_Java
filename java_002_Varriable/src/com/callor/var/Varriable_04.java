package com.callor.var;

public class Varriable_04 {

	public static void main(String[] args) {
		
		int intDan = 7;
		int intNum = 12;
		
		
		System.out.println("=============================");
		System.out.printf("%d 구구단\n",intDan);
		System.out.println("--------------------------");
		
		System.out.printf("%d * %d = %d",
				intDan, intNum, intDan * intNum);
		intNum ++;
		System.out.printf("%d * %d = %d\n",
				intDan, intNum, intDan);

	}

}
