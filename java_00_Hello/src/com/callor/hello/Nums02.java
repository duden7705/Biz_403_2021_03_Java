package com.callor.hello;

/*
 * 숫자 연산
 * java에서는 수학의 4칙연산과 나머지 연산을 
 * 수행할 수 있다.
 * 
 * 숫자가 정수형 일때는 
 * 4칙연산의 결과가 모두 정수이다
 * 
 * 정수 / 정수 연산을 수행했을때 결과는 나눗셈의 몫을 구하는 연산이 된다. 
 * 
 * 정수 % 정수 연산을 수행하면 결과는 나머지를 구하는 연산이 된다.
 * 
 */



public class Nums02 {

	public static void main(String[] args) {
		
		
		System.out.println(30 + 40);
		System.out.println(30 - 40);
		System.out.println(30 * 40);
		System.out.println(30 / 40);
		System.out.println(30 % 40);
		System.out.println(==============);
		// 40을 30으로 나누면 일반적 수학 연산에서는 소수점 이하 값이 나타나지만
		// java에서 정수/ 정수는 몫을 구하기 때문에 
		// 결과는 1만 나타난다
		
		// java에서 실수의 표현
		//java는 실수를 표현할때 10 -16승까지 표현한다
		// 소수점이하 16자리 까지 표현하고 이후 값
		// 무시 또는 반올림등을 수행한다
		System.out.println(40.0 / 30.0);
		System.out.println(40 / 30.0);
		
	}
		

	}

}
