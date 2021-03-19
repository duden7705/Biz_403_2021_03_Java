package com.callor.var;

public class Varriable_15 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		intSum += (intNum +=2);
		intSum += (intNum +=4);
		intSum += (intNum +=6);
		intSum += (intNum +=8);
		intSum += (intNum +=10);
		System.out.println(intSum);
		
		intNum = 0;
		intSum = 0;
		
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		
		
		

	}

}
