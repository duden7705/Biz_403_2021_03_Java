package com.callor.apps;

import java.util.Random;

/*
 * 25 ~50명 인원 있는 각 반에
 * pizza 간식을 지급하려고 한다.
 * 각 반의 학생들에게 1조각씩 pizza를
 * 지급하려고 한다
 * 학생수보다 부족하거나
 * 6조각 이상 남지 않도록pizza를 주문해야 한다
 * 몇box의 pizza를 주문해야 하는지 코드로 구현하시오 
 */

public class App_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		
		
		int intMembers = 0;
		int pizza = 0;
		
		intMembers = rnd.nextInt(26)+25;
		if(intMembers % 6 == 0) {
			pizza = (intMembers / 6);
			System.out.println(pizza);
			
			
			
		}
		
		
	}

}
