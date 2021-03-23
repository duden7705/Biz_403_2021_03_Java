package com.callor.apps;

/*
 * 1.대한민국 화폐는 5만원, 1만원, 5천원, 1천원, 5백원, 1백원,
 *  50원, 10원, 5원, 1원 권입니다
 *  2. 급여액 3,723,560 원을 은행에서 인출을 합니다.
 *  3. 은행에서는 최소한의 화폐 개수로 집급을 하려고 합니다.
 *  4. 최소 화폐매수를 계산하는 코드를  구현해 봅니다.
 */

public class App_06 {
	
	public static void main(String[] args) {
		
		int money = 3723560;
		int a = 0; // 50000
		int b = 0; // 10000
		int c = 0; // 5000
		int d = 0; // 1000
		int e = 0; // 500
		int f = 0; // 100
		int g = 0; // 50 
		int h = 0; // 10
		int i = 0; // 5
		int j = 0; // 1
		
		if(3723560 % 50000 >= 0) {
			a = 3723560 / 50000;
			System.out.println(a);
		
			
		}
	}

}
